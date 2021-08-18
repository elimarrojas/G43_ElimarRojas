/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.ii_c2;

import company_pkg.CompanyClass;
import company_pkg.JobPositionClass;
import java.util.ArrayList;
import java.util.Scanner;
import person_pkg.AdminClass;
import person_pkg.ClientClass;
import person_pkg.EmployeeClass;

/**
 *
 * @author Daniel Fajardo
 */
public class RetoII_C2 {
    private static Scanner insDatos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_BLUE = "\u001B[34m";
    CompanyClass comp = new CompanyClass();
    private static ArrayList<CompanyClass> companyList = new ArrayList<>();
    
       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean exitProgram = false;
        while(!exitProgram){
            System.out.println(ANSI_RED + "SELECCIONA UNA OPCIÓN DEL MENÚ" + ANSI_RESET);
            System.out.println(" 1. Crear empresa");
            System.out.println(" 2. Consultar lista de empresas");
            System.out.println(" 3. Editar empresa");
            System.out.println(" 4. Eliminar empresa");
            System.out.println(" 5. Administrar empresa"); //Esta opción se refiere a la operación de realización del CRUD tanto de empleados, como de clientes de la(s) empresa(s) creada(s)
            System.out.println(" 6. Salir");
            System.out.println(ANSI_RED + "Ingresa tu respuesta: " + ANSI_RESET);
            int option = Integer.parseInt(insDatos.nextLine());
            
            switch(option){
                case 1:
                    System.out.println("¿Cuántas empresas deseas añadir?");
                    int numClients = Integer.parseInt(insDatos.nextLine());
                    System.out.println("\n ========================================================");
                    System.out.println(ANSI_RED +"FORMULARIO DE REGISTRO DE EMPRESAS"+ ANSI_RESET);
                    for (int i = 1; i <= numClients; i++) {
                        System.out.println("\n" + ANSI_RED +"      Empresa "+ i + ANSI_RESET);
                        System.out.println(ANSI_RED +"Nombre: " + ANSI_RESET);
                        String nameComp = insDatos.nextLine();
                        
                        System.out.println(ANSI_RED +"NIT: " + ANSI_RESET);
                        String nit = insDatos.nextLine();
                        
                        System.out.println(ANSI_RED +"Dirección: " + ANSI_RESET);
                        String addressCom = insDatos.nextLine();
                        
                        System.out.println(ANSI_BLUE +"Documento del primer empleado: " + ANSI_RESET);
                        int doc = Integer.parseInt(insDatos.nextLine());
                        
                        System.out.println(ANSI_BLUE +"Nombre completo del primer empleado: " + ANSI_RESET);
                        String fullName = insDatos.nextLine();
                        
                        System.out.println(ANSI_BLUE +"Email del primer empleado: " + ANSI_RESET);
                        String email = insDatos.nextLine();
                        
                        System.out.println(ANSI_BLUE +"Categoría: (Senior, Semi-Senior, Junior)" + ANSI_RESET);
                        String category = insDatos.nextLine();                        
                                  
                        AdminClass admin = new AdminClass(doc, fullName , email, category);
                        JobPositionClass jobPos = new JobPositionClass(admin);
                        jobPos.CreateJobPos();
                        CompanyClass company = new CompanyClass(nameComp, nit, addressCom, admin, jobPos);
                        companyList.add(company);                        
                        System.out.println("==============COMPAÑÍA CREADA CON ÉXITO=============\n");                                        
                    }
                    break;
                case 2:
                    System.out.println("===============COMPAÑÍAS REGISTRADAS===============");
                    for (int i = 0; i < companyList.size(); i++) {
                        System.out.println("\n" + ANSI_RED +"      COMPAÑÍA "+ (i+1) + ANSI_RESET);
                        CompanyClass company1 = (CompanyClass)companyList.get(i);
                        System.out.println(ANSI_RED +"Nombre: " + ANSI_RESET + company1.getNameCompany());
                        System.out.println(ANSI_RED +"NIT: " + ANSI_RESET + company1.getNIT());
                        System.out.println(ANSI_RED +"Dirección: " + ANSI_RESET + company1.getAddress());                       
                    }
                    break;
                case 3:
                    System.out.println("===============EDITAR INFORMACIÓN DE LA COMPAÑÍA===============");
                    System.out.println("Ingresa el índice de la compañía a editar: ");
                    int index = Integer.parseInt(insDatos.nextLine());
                    if (index >= 0 && index <= companyList.size()){
                        CompanyClass company2 = (CompanyClass)companyList.get(index);
                        System.out.println("===============INFORMACIÓN ACTUAL DE LA COMPAÑÍA===============");
                        System.out.println(ANSI_RED +"Nombre: " + ANSI_RESET + company2.getNameCompany());
                        System.out.println(ANSI_RED +"NIT: " + ANSI_RESET + company2.getNIT());
                        System.out.println(ANSI_RED +"Dirección: " + ANSI_RESET + company2.getAddress());                        
                        System.out.println("¿Qué campo deseas editar?\n     1. Nombre\n     2. NIT\n     4. Dirección\n");
                        int editCompany = Integer.parseInt(insDatos.nextLine());
                        switch(editCompany){
                            case 1:
                                System.out.println("Nombre nuevo: ");
                                String newName = insDatos.nextLine();
                                company2.setNameCompany(newName);
                                break;
                            case 2:
                                System.out.println("NIT nuevo: ");
                                String newNit = insDatos.nextLine();
                                company2.setNIT(newNit);
                                break;
                            case 3:
                                System.out.println("Dirección nueva: ");
                                String newEmail = insDatos.nextLine();
                                company2.setAddress(newEmail);
                                break;                                                                                 
                        }
                        System.out.println("===========LA INFORMACIÓN DE LA COMPAÑÍA ACTUALIZADA EXITOSAMENTE===========");
                    }
                    break;
                case 4:
                    System.out.println(ANSI_RED + "=============ELIMINAR INFORMACIÓN DE LA COMPAÑÍA============="+ANSI_RESET);
                    System.out.println("Ingresa el índice de la compañía a eliminar: ");
                    int indexRemove = Integer.parseInt(insDatos.nextLine());
                    if (indexRemove >= 0 && indexRemove <= companyList.size()){
                        CompanyClass company3 = (CompanyClass)companyList.get(indexRemove);
                        System.out.println("===============INFORMACIÓN ACTUAL DE LA COMPAÑÍA===============");
                        System.out.println(ANSI_RED +"Nombre: " + ANSI_RESET + company3.getNameCompany());
                        System.out.println(ANSI_RED +"NIT: " + ANSI_RESET + company3.getNIT());
                        System.out.println(ANSI_RED +"Dirección: " + ANSI_RESET + company3.getAddress());                        
                        System.out.println("¿Estás seguro que deseas eliminar a " + company3.getNameCompany()+"? (Si, No)");
                        String answer = insDatos.nextLine();
                        if (answer.toLowerCase().equals("si")||answer.toLowerCase().equals("sí")){
                            companyList.remove(indexRemove);
                        }else{
                            System.out.println("===========CANCELANDO PROCESO===========");
                        }
                        System.out.println(ANSI_RED + "BASE DE DATOS COMPANÍA ACTUALIZADA" + ANSI_RESET);
                        for (int i = 0; i < companyList.size(); i++) {
                            System.out.println("\n" + ANSI_RED + "       COMPAÑÍA " + (i + 1) + ANSI_RESET);
                            CompanyClass company4 = companyList.get(i);
                            System.out.println(ANSI_RED + "Nombre: " + ANSI_RESET + company4.getNameCompany());
                            System.out.println(ANSI_RED + "NIT: " + ANSI_RESET + company4.getNIT());
                            System.out.println(ANSI_RED + "Dirección: " + ANSI_RESET + company4.getAddress());                           
                        }
                    }
                    break;
                case 5:
                    System.out.println("==================SELECCIONE UNA EMPRESA====================");
                    for (int i = 0; i < companyList.size(); i++) {
                        System.out.println(((i)+1) + ". " +companyList.get(i).getNameCompany());
                        }
                    System.out.println(ANSI_RED + "Ingresa tu respuesta: " + ANSI_RESET);
                    int optionCompany = Integer.parseInt(insDatos.nextLine());
                    
                    System.out.println("Deseas trabajar con:\n      1. Empleados\n      2. Clientes");
                    int number = Integer.parseInt(insDatos.nextLine());
                    if (number == 1) {
                        companyList.get(optionCompany-1).crudEmployees();
                    } else if (number == 2) {
                        companyList.get(optionCompany-1).crudClients();
                    } else {
                        System.out.println(ANSI_RED + "Opción Inválida" + ANSI_RESET);
                    }
          
                    break;                
                case 6:
                    exitProgram = true;
                    System.out.println(ANSI_RED + "=======================SALIENDO DEL PROGRAMA=======================" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "=========================OPCIÓN INVÁLIDA========================="+ ANSI_RESET);                
                    break;
            }                   
        }
        
        //JobPositionClass jobPos = new JobPositionClass();
//        jobPos.CreateJobPos();
//        CompanyClass company = new CompanyClass();
//        company.crudCompany();
//        //EmployeeClass employee = new EmployeeClass();
//        ClientClass client = new ClientClass();
//        System.out.println("\n======================================");
//        System.out.println(ANSI_GREEN + "ER BUSINEES" + ANSI_RESET);
//        System.out.println("======================================");
//        System.out.println("Deseas trabajar con:\n      1. Empleados\n      2. Clientes");
//        int number = Integer.parseInt(insDatos.nextLine());
//        if (number == 1){
//            company.crudEmployees();             
//        }else if(number == 2){
//            company.crudClients();
//        }else{
//            System.out.println(ANSI_RED + "Opción Inválida" + ANSI_RESET);
//        }

    }

}
