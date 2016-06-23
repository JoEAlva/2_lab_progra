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
public class Cliente {
    
    public int cedula = 0;
    public String nombre = "";
    public int edad = 0;
    public String tipoServicio = "";
    public String prioridad = "";
    
    public Cliente siguiente;

    public Cliente(int cedula, String nombre, int edad, String tipoServicio, String prioridad, Cliente siguiente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoServicio = tipoServicio;
        this.prioridad = prioridad;
        this.siguiente = siguiente;
    }
    
    public Cliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cliente siguiente) {
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
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
}//Fin de la clase Cliente
