/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_pkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model_pkg.*;
import view_pkg.Principal;

/**
 *
 * @author Daniel Fajardo
 */
public class Controller implements ActionListener{
    private final Principal view;

    public final void events(){
        view.cbHospital.addActionListener(this);
    }
    
    public Controller(Principal view){
        this.view = view;
        getHospital();
        Item item = (Item)view.cbHospital.getSelectedItem();
        getPets(item.getIdHospital());
        events();
    }
    
    public final void getHospital(){
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getHospital();
        if(list.size() > 0 ){
            for(int i = 0; i < list.size(); i++){
                int idHospital = list.get(i).getIdHospital();
                String name = list.get(i).getHospital();
                String address = list.get(i).getAddress();
                view.cbHospital.addItem(new Item(idHospital, name, address));
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontraron registros de clínicas", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public final void getPets(int id){
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getPets(id);
        if(list.size() > 0){
            for (int i = 0; i < list.size(); i++) {
                DefaultTableModel modelTable = (DefaultTableModel)view.tbPets.getModel();
                Object[] fila = new Object[4];
                fila[0] = list.get(i).getIdPet();
                fila[1] = list.get(i).getName();
                fila[2] = list.get(i).getCode();
                fila[3] = list.get(i).getBreed();
                
                modelTable.addRow(fila);
                view.tbPets.setModel(modelTable);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontraron mascotas asociadas a la clínica ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel)view.tbPets.getModel();
        while (view.tbPets.getRowCount() > 0){
            model.removeRow(0);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        Object evt =ae.getSource(); {
        if (evt.equals(view.cbHospital)){
            clearTable();
            Item item = (Item)view.cbHospital.getSelectedItem();
            getPets(item.getIdHospital());
            }
        }
    }
}
