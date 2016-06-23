/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JorgeIgnacio
 */
public class Persona {
    
    public String nombre = "";
    public int edad = 0;
    public String numeroComprobante = "";
    
    public Persona siguiente;

    public Persona(String nombre, int edad, String tipoServicio, Persona siguiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroComprobante = tipoServicio;
        this.siguiente = siguiente;
    }
    
    public Persona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Persona siguiente) {
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoServicio() {
        return numeroComprobante;
    }

    public void setTipoServicio(String tipoServicio) {
        this.numeroComprobante = tipoServicio;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    
}//Fin de la clase Persona
