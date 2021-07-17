/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.i_c2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


/**
 *
 * @author Daniel Fajardo
 */
public class RETOI_C2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Solicitando todos los datos al usuario por teclado
        System.out.println("BIENVENID@ AL SISTEMA \nPor favor, diligencie la siguiente información\n");
        
        Scanner i_data = new Scanner(System.in);
        System.out.println("Registre su nombre y apellido: ");
        String name = i_data.nextLine();
        
        System.out.println("Tipo de documento: (C.C, C.E) ");
        String type_doc = i_data.nextLine();
        
        System.out.println("Número de documento: ");
        int num_doc = Integer.parseInt(i_data.nextLine());
                
        System.out.println("Indique su género:(F,M)");
        String gender = i_data.nextLine();
        
        System.out.println("Indique su peso: ");
        float weigth = i_data.nextFloat();
        
        System.out.println("Indique su estatura: ");
        float height = i_data.nextFloat();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Ingrese fecha de nacimiento: dd/MM/yyyy");
        String birth = i_data.next();
        i_data.nextLine();
        LocalDate fecha = LocalDate.parse(birth,formato);
        Period edad = Period.between(fecha, LocalDate.now());
        
        System.out.println("Departamento en donde nació: ");
        String residence = i_data.nextLine();
        
        System.out.println("Dirección de residencia: ");
        String address = i_data.nextLine();
        
        System.out.println("Teléfono de contacto: ");
        int phone = Integer.parseInt(i_data.nextLine());
        
        System.out.println("Correo electrónico: ");
        String email = i_data.nextLine();
        
        System.out.println("Ocupación laboral: ");
        String job = i_data.nextLine();
        
        System.out.println("¿Actualmente estudia?: (Si, No)");
        String study = i_data.nextLine();
        
        System.out.println("Estado civil: ");
        String marital_s = i_data.nextLine();
              
        System.out.println("Cantidad de hijos: ");
        int children = Integer.parseInt(i_data.nextLine());
                       
        System.out.println("¿Tiene alguna discapacidad?: (Si, No)");
        String disability = i_data.nextLine();
                   
        System.out.println("¿Padece alguna enfermedad?: (Si, No)");
        String disease = i_data.nextLine();
        
        System.out.println("¿Practica algún deporte?: (Si, No)");
        String sport = i_data.nextLine();
               
        PersonClass inst_person = new PersonClass(name, type_doc, num_doc, gender, weigth, height, birth, residence, address, phone, email, job, study, marital_s, children, disability, disease, sport);
        System.out.println(inst_person.consultar_info());
            
    }
    
    
    
}
