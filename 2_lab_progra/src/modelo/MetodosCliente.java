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
public class MetodosCliente {
    
    //Referencias de la clase
    Persona principal;
    
    //Variables
    boolean primeroPrioridadAlta = true;

    public MetodosCliente() {
        this.principal = principal;
    }
    
    /**
     * 
     * @param vectorInformacion datos del cliente almacenados en un vector 
     */
    public void agregarCliente(String vectorInformacion[]) {
        
        if(principal == null) {
            principal = new Persona(vectorInformacion[0], Integer.parseInt(vectorInformacion[1]), vectorInformacion[2], null); 
        }else {
                agregarAlFinal(vectorInformacion);
        }    
        
    }//Fin crear
    
    public void ordenarMayorAMenor()
    {
        int cantidadNodos=devolverCantidadNodos();
        String tmpNom;
        int tmpEdad;
        String numReg;;
        Persona auxiliar = principal;
        for(int contador=0;contador<cantidadNodos;contador++)
        {
            auxiliar = principal;
            while(auxiliar.getSiguiente() != null)
            {
                if(auxiliar.getEdad() < auxiliar.getSiguiente().getEdad())
                {
                    tmpNom = auxiliar.nombre;
                    auxiliar.nombre = auxiliar.siguiente.nombre;
                    auxiliar.siguiente.nombre = tmpNom;
                    
                    tmpEdad = auxiliar.edad;
                    auxiliar.edad = auxiliar.siguiente.edad;
                    auxiliar.siguiente.edad = tmpEdad;
                    
                    numReg = auxiliar.numeroComprobante;
                    auxiliar.numeroComprobante = auxiliar.siguiente.numeroComprobante;
                    auxiliar.siguiente.numeroComprobante = numReg;
                }
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
    
    public void ordenarMenorAMayor()
    {
        int cantidadNodos=devolverCantidadNodos();
        String tmpNom;
        int tmpEdad;
        String numReg;
        
        Persona auxiliar = principal;
        
        for(int contador=0;contador<cantidadNodos;contador++)
        {
            auxiliar = principal;
            while(auxiliar.getSiguiente() != null)
            {
                if(auxiliar.getEdad() > auxiliar.getSiguiente().getEdad())
                {
                    tmpNom = auxiliar.nombre;
                    auxiliar.nombre = auxiliar.siguiente.nombre;
                    auxiliar.siguiente.nombre = tmpNom;
                    
                    tmpEdad = auxiliar.edad;
                    auxiliar.edad = auxiliar.siguiente.edad;
                    auxiliar.siguiente.edad = tmpEdad;
                    
                    numReg = auxiliar.numeroComprobante;
                    auxiliar.numeroComprobante = auxiliar.siguiente.numeroComprobante;
                    auxiliar.siguiente.numeroComprobante = numReg;
                }
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
    
    public int devolverCantidadNodos()
    {
        int contador=1;
        Persona auxiliar = principal;
        while(auxiliar.getSiguiente()!=null)
        {
            contador++;
            auxiliar = auxiliar.getSiguiente();
        }
        
        return contador;
    }
    
    public String imprimir() {
        
        String valores = "";
        Persona temporal = principal;
        if(temporal != null) {
            while(temporal.getSiguiente()!=null) {
            valores+=temporal.getNombre()+" "+temporal.getEdad()+" "+temporal.getNumeroComprobante()+"\n";
            temporal = temporal.getSiguiente();
        }
        valores+=temporal.getNombre()+"-"+temporal.getEdad()+"-"+temporal.getNumeroComprobante();
        }else {
            valores+="";
        }
        
        return valores;
        
    }
    
    public boolean comprobarLista() {
        boolean b = false;
        Persona temporal = principal;
        if(principal == null) {
            b = true;
        }
        return b;
    }
    
    
    
    public void agregarAlFinal(String vectorInformacion[]) {
        
        Persona temporal = devolverUltimoCliente();
        temporal.setSiguiente(new Persona(vectorInformacion[0],
                                          Integer.parseInt(vectorInformacion[1]),
                                          vectorInformacion[2],
                                          null));
   
    }//Fin agregarAlFinal

    
    public Persona devolverUltimoCliente() {
        
        Persona temporal = principal;
        while(temporal.getSiguiente()!=null) {
            temporal = temporal.getSiguiente();
        }
        return temporal; 
        
    }//Fin devolverUltimoCliente
    
    public Persona devolverPenultimoNodo() {
        
        Persona temporal = principal;
        while(temporal.getSiguiente().getSiguiente() != null) {
            temporal = temporal.getSiguiente();
        }
        
        return temporal;
        
    }
    
    public void eliminarPrimero() {
        
        Persona temporal = principal;
        principal = temporal.getSiguiente();
        
    }
    
    public String atenderCliente() {
        
        String valores = "";
        Persona temporal = principal; 
        valores+=temporal.getNombre()+"-"+temporal.getEdad()+"-"+temporal.getTipoServicio();
        return valores;
        
    }

    
}//Fin de la clase MetodosCliente
