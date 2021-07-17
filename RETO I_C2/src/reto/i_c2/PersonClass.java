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
public class PersonClass {
    
    //Declarando variables de forma private
    private String nombre;
    private String tipo_doc;
    private int nro_doc;
    private String genero;
    private float peso;
    private float estatura;
    private String fecha_nac;
    private String dpto_nac;
    private String direccion;
    private int tlf_contacto;
    private String email;
    private String profesion;
    private String actual_estudia;
    private String edo_civil;
    private int cant_hijos;
    private String discapacidad;
    private String enfermedad;
    private String pract_deporte;
    Period edad;
           
    //Agregar el constructor de la clase con todos los parámetros
    
    public PersonClass(String nombre, String tipo_doc, int nro_doc, String genero, float peso, float estatura, String fecha_nac, String dpto_nac, String direccion, int tlf_contacto, String email, String profesion, String actual_estudia, String edo_civil, int cant_hijos, String discapacidad, String enfermedad, String pract_deporte) {
        this.nombre = nombre;
        this.tipo_doc = tipo_doc;
        this.nro_doc = nro_doc;
        this.genero = genero;
        this.peso = peso;
        this.estatura = estatura;
        this.fecha_nac = fecha_nac;
        this.dpto_nac = dpto_nac;
        this.direccion = direccion;
        this.tlf_contacto = tlf_contacto;
        this.email = email;
        this.profesion = profesion;
        this.actual_estudia = actual_estudia;
        this.edo_civil = edo_civil;
        this.cant_hijos = cant_hijos;
        this.discapacidad = discapacidad;
        this.enfermedad = enfermedad;
        this.pract_deporte = pract_deporte;
    }

    //Añadir getter y setter
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo_doc
     */
    public String getTipo_doc() {
        return tipo_doc;
    }

    /**
     * @param tipo_doc the tipo_doc to set
     */
    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    /**
     * @return the nro_doc
     */
    public int getNro_doc() {
        return nro_doc;
    }

    /**
     * @param nro_doc the nro_doc to set
     */
    public void setNro_doc(int nro_doc) {
        this.nro_doc = nro_doc;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the estatura
     */
    public float getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the fecha_nac
     */
    public String getFecha_nac() {
        return fecha_nac;
    }

    /**
     * @param fecha_nac the fecha_nac to set
     */
    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    /**
     * @return the dpto_nac
     */
    public String getDpto_nac() {
        return dpto_nac;
    }

    /**
     * @param dpto_nac the dpto_nac to set
     */
    public void setDpto_nac(String dpto_nac) {
        this.dpto_nac = dpto_nac;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /**
     * @return the tlf_contacto
     */
    public int getTlf_contacto() {
        return tlf_contacto;
    }

    /**
     * @param tlf_contacto the tlf_contacto to set
     */
    public void setTlf_contacto(int tlf_contacto) {
        this.tlf_contacto = tlf_contacto;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * @return the actual_estudia
     */
    public String getActual_estudia() {
        return actual_estudia;
    }

    /**
     * @param actual_estudia the actual_estudia to set
     */
    public void setActual_estudia(String actual_estudia) {
        this.actual_estudia = actual_estudia;
        
    }

    /**
     * @return the edo_civil
     */
    public String getEdo_civil() {
        return edo_civil;
    }

    /**
     * @param edo_civil the edo_civil to set
     */
    public void setEdo_civil(String edo_civil) {
        this.edo_civil = edo_civil;
    }

    /**
     * @return the cant_hijos
     */
    public int getCant_hijos() {
        return cant_hijos;
    }

    /**
     * @param cant_hijos the cant_hijos to set
     */
    public void setCant_hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    /**
     * @return the discapacidad
     */
    public String getDiscapacidad() {
        return discapacidad;
    }

    /**
     * @param discapacidad the discapacidad to set
     */
    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * @return the enfermedad
     */
    public String getEnfermedad() {
        return enfermedad;
    }

    /**
     * @param enfermedad the enfermedad to set
     */
    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    /**
     * @return the pract_deporte
     */
    public String getPract_deporte() {
        return pract_deporte;
    }

    /**
     * @param pract_deporte the pract_deporte to set
     */
    public void setPract_deporte(String pract_deporte) {
        this.pract_deporte = pract_deporte;
    }
    
    public void setEdad(Period edad) {
        this.edad = edad;
    }
    
    public Period getEdad() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(this.fecha_nac,formato);
        Period edad = Period.between(fecha, LocalDate.now());
        return edad;
    }
    
    public String Genero(){
        String mensaje;
        if (this.genero.toLowerCase().equals("f")){
            mensaje = "Es una mujer";
        }else{
            mensaje = "Es un hombre";
        }
        return mensaje;
    }
    
    public String Estudia(){
        String mensaje;
        if (this.actual_estudia.toLowerCase().equals("si") || this.actual_estudia.toLowerCase().equals("sí")){
            mensaje = "actualmente estudia";
        }else{
            mensaje = "actualmente no estudia";
        }
        return mensaje;
    }
    
    public String Discapacidad(){
        String mensaje;
        if (this.discapacidad.toLowerCase().equals("si") || this.discapacidad.toLowerCase().equals("sí")){
            mensaje = "tiene discapacidad";
        }else{
            mensaje = "no tiene discapacidad";
        }
        return mensaje;
    }
    
    public String Enfermedad(){
        String mensaje;
        if (this.enfermedad.toLowerCase().equals("si") || this.enfermedad.toLowerCase().equals("sí")){
            mensaje = "padece una enfermedad";
        }else{
            mensaje = "no tiene antecedentes clínicos";
        }
        return mensaje;
    }
    
    public String Deporte(){
        String mensaje;
        if (this.pract_deporte.toLowerCase().equals("si") || this.pract_deporte.toLowerCase().equals("sí")){
            mensaje = "practica deporte en su rutina";
        }else{
            mensaje = "no practica ningún deporte";
        }
        return mensaje;
        
    }
    
    //Creando la función que retorna la información de la PersonClass
    public String consultar_info(){
        return " >" + getNombre() + " esta indenficad@ con el tipo de documento " + getTipo_doc() + " bajo el número " + getNro_doc() + ",\n " + Genero() + " de " + getEstatura() + " m de estatura y de un peso de " + getPeso() + " kg,\n nacid@ en el departamento de " + getDpto_nac() + " en la fecha " + getFecha_nac() + ", tiene " + getEdad().getYears()+ " años,\n con residencia permanente en " + getDireccion() + ". Sus datos de contacto son:\n correo electrónico, " + getEmail() + " y número de teléfono, " + getTlf_contacto() + ".\n Es " + getProfesion()+ " y " + Estudia() + ". Es " + getEdo_civil() + " y tiene " + getCant_hijos() + " hijos;\n " + Discapacidad() + ", " + Enfermedad() + " y " + Deporte();
    }    

     
    
}

    

    

