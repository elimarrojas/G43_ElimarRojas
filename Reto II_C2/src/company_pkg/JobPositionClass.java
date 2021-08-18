/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import person_pkg.EmployeeClass;

/**
 *
 * @author Daniel Fajardo
 */
public class JobPositionClass {
    private String namePos;    
    private EmployeeClass employee;
    private static Scanner insDatos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_BLUE = "\u001B[34m";
    ArrayList<String> nivelInstitucional = new ArrayList<>();      
    ArrayList<String> nivelIntermedio = new ArrayList<>();
    ArrayList<String> nivelOperacional = new ArrayList<>();
    ArrayList<String> nivelEjecucion = new ArrayList<>();
    
    public JobPositionClass(EmployeeClass employee) {
        this.employee = employee;
        nivelInstitucional.add("Director");
        nivelIntermedio.add("Gerente");
        nivelOperacional.add("Supervisor RRHH");
        nivelOperacional.add("Supervisor Finanzas");
        nivelOperacional.add("Supervisor Marketing");
        nivelOperacional.add("Supervisor Ventas");
        nivelOperacional.add("Producción");
        nivelEjecucion.add("Analista RRHH");
        nivelEjecucion.add("Analista Finanzas");
        nivelEjecucion.add("Analista Marketing");
        nivelEjecucion.add("Analista Ventas");
    }
    

    public EmployeeClass getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeClass employee) {
        this.employee = employee;
    }
        
    /**
     * @return the namePos
     */
    public String getNamePos() {
        return namePos;
    }

    /**
     * @param namePos the namePos to set
     */
    public void setNamePos(String namePos) {
        this.namePos = namePos;
    }

    /**
     * @return the level
     */
    public String getLevel() {
        if (nivelInstitucional.contains(namePos)){
            return "Nivel Institucional";
        }else if(nivelIntermedio.contains(namePos)){ 
            return "Nivel Intermedio";
        }else if(nivelOperacional.contains(namePos)){ 
            return "Nivel Operacional";
        }else if(nivelEjecucion.contains(namePos)){ 
            return "Nivel Ejecución";
        }else{
            return "No tiene nivel jerárquico";
        }    
    }    
        
    public void CreateJobPos(){       
        //Se crean los cargos de cada empleado              
        System.out.println("=================CARGO EMPLEADO=================");         
        System.out.println(ANSI_BLUE + "SELECCIONA UN NIVEL JERÁRQUICO" + ANSI_RESET);
        System.out.println("1. Institucional");
        System.out.println("2. Intermedio");
        System.out.println("3. Operacional");
        System.out.println("4. Ejecución");
        System.out.println(ANSI_BLUE + "Ingresa tu respuesta: " + ANSI_RESET);
        int option1 = Integer.parseInt(insDatos.nextLine());        
        switch (option1) {
            case 1:
                System.out.println(ANSI_BLUE + "SELECCIONA UN CARGO" + ANSI_RESET);
                for (int i = 0; i < nivelInstitucional.size() ; i++) {
                    System.out.println((i)+1 + ". " + nivelInstitucional.get(i));                    
                }
                System.out.println(ANSI_BLUE + "Ingresa tu respuesta: " + ANSI_RESET);
                int optionJob = Integer.parseInt(insDatos.nextLine());
                namePos = nivelInstitucional.get(optionJob-1);                
                break;
            case 2:
                System.out.println(ANSI_BLUE + "SELECCIONA UN CARGO" + ANSI_RESET);
                for (int i = 0; i < nivelIntermedio.size(); i++) {
                    System.out.println((i)+1 +". "+ nivelIntermedio.get(i));
                }
                System.out.println(ANSI_BLUE + "Ingresa tu respuesta: " + ANSI_RESET);
                int optionJob1 = Integer.parseInt(insDatos.nextLine());
                namePos = nivelIntermedio.get(optionJob1-1);
                break;
            case 3:
                System.out.println(ANSI_BLUE + "SELECCIONA UN CARGO" + ANSI_RESET);
                for (int i = 0; i < nivelOperacional.size(); i++) {
                    System.out.println((i)+1 +". "+ nivelOperacional.get(i));  
                }
                System.out.println(ANSI_BLUE + "Ingresa tu respuesta: " + ANSI_RESET);
                int optionJob2 = Integer.parseInt(insDatos.nextLine());
                namePos = nivelOperacional.get(optionJob2-1);
                break;
            case 4:
                System.out.println(ANSI_BLUE + "SELECCIONA UN CARGO" + ANSI_RESET);
                for (int i = 0; i < nivelEjecucion.size(); i++) {
                    System.out.println((i)+1 +". "+ nivelEjecucion.get(i));
                }
                System.out.println(ANSI_BLUE + "Ingresa tu respuesta: " + ANSI_RESET);
                int optionJob3 = Integer.parseInt(insDatos.nextLine());
                namePos = nivelEjecucion.get(optionJob3-1);
                break;
            default:
                System.out.println(ANSI_RED + "=========================OPCIÓN INVÁLIDA========================="+ ANSI_RESET);                
                break;
        }        
        System.out.println("==============CARGO CREADO CON ÉXITO=============\n");
    }
}
        

            
       

    
