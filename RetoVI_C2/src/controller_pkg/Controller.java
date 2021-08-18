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
import model_pkg.DataDB;
import model_pkg.DataModelDB;
import view_pkg.DialogPets;

/**
 *
 * @author Daniel Fajardo
 */
public class Controller implements ActionListener {
    private final DialogPets view;
    
    public final void events(){
        view.cbOwner.addActionListener(this);
        view.cbPetType.addActionListener(this);
        view.cbBreed.addActionListener(this);
    }

    public Controller(DialogPets view) {
        this.view = view;
        getOwners();
        getPetType();
        getBreed();
        Item item = (Item)view.cbOwner.getSelectedItem();        
        ItemPetType item1 = (ItemPetType)view.cbPetType.getSelectedItem();
        ItemBreed item2 = (ItemBreed)view.cbBreed.getSelectedItem();
        events();
    }
    
    
    public final void getPetType(){
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getPetType();
        if(list.size() > 0){
            for (int i = 0; i < list.size(); i++) {                
                String petType = list.get(i).getPetType();
                view.cbPetType.addItem(new ItemPetType(i,petType));
                view.petTypeList.add(new ItemPetType(i,petType));
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontraron registro de tipos de mascotas", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }  
    
    
    public final void getBreed(String petType){
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getBreed(petType);
        if(list.size() > 0){
            for (int i = 0; i < list.size(); i++) {
                int idBreed = list.get(i).getIdBreed();
                String breed = list.get(i).getBreed();
                view.cbBreed.addItem(new ItemBreed(idBreed, breed));
                view.breedList.add(new ItemBreed(idBreed, breed));
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontraron registro de razas", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }
    public final void getBreed(){
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getBreed("Gato");
        if(list.size() > 0){
            for (int i = 0; i < list.size(); i++) {
                int idBreed = list.get(i).getIdBreed();
                String breed = list.get(i).getBreed();                
                view.breedList.add(new ItemBreed(idBreed, breed));
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontraron registro de razas", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        list = model.getBreed("Perro");
        if(list.size() > 0){
            for (int i = 0; i < list.size(); i++) {
                int idBreed = list.get(i).getIdBreed();
                String breed = list.get(i).getBreed();                
                view.breedList.add(new ItemBreed(idBreed, breed));
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontraron registro de razas", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public final void getOwners(){
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getOwners(0);
        if(list.size() > 0){
            for (int i = 0; i < list.size(); i++) {
                int idOwner = list.get(i).getIdOwner();
                String owner = list.get(i).getOwner();
                view.cbOwner.addItem(new Item(idOwner, owner));
                view.ownerList.add(new Item(idOwner, owner));
                view.setIdOwners(list.get(0).getIdOwner());
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontraron registro de clientes", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }    

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object evt = ae.getSource();
        if(evt.equals(view.cbOwner)){
            Item item = (Item)view.cbOwner.getSelectedItem();
            view.setIdOwners(item.getIdOwner());
        }        
    }    
}
