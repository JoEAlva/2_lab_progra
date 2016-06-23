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
    Cliente principal;
    
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
            principal = new Cliente(Integer.parseInt(vectorInformacion[0]), vectorInformacion[1], Integer.parseInt(vectorInformacion[2]), vectorInformacion[3], vectorInformacion[4], null); 
        }else {
            //Debería ser comparado con la prioridad y ésta almacenada en un jComboBox
            if(vectorInformacion[3].equals("Normal")) {
                agregarAlFinal(vectorInformacion);
            }else {
                Cliente temporal = new Cliente(Integer.parseInt(vectorInformacion[0]), vectorInformacion[1], Integer.parseInt(vectorInformacion[2]), vectorInformacion[3], vectorInformacion[4], null);
                temporal.setSiguiente(principal);
                principal = temporal;
            }
        }    
        
    }//Fin crear
    
    public int contar() {
        
        Cliente temporal = principal;
        try {
            if(temporal.getSiguiente() == null) {
                return 0;
            }
        }catch(NullPointerException e) {
            System.err.println("Error: " + e);
            return 0;
        }
        int cont = 0;
        while(temporal.getSiguiente()!=null) {
            temporal = temporal.getSiguiente();
            cont++;
        }
        cont++;
        temporal = null;
        return cont; 
    }
    
    public String imprimir() {
        
        String valores = "";
        Cliente temporal = principal;
        
        while(temporal.getSiguiente()!=null) {
            valores+=temporal.getCedula()+" "+temporal.getNombre()+" "+temporal.getEdad()+" "+temporal.getTipoServicio()+" "+temporal.getPrioridad()+"\n";
            temporal = temporal.getSiguiente();
        }
        valores+=temporal.getCedula()+" "+temporal.getNombre()+"-"+temporal.getEdad()+"-"+temporal.getTipoServicio()+"-"+temporal.getPrioridad();
        return valores;
        
    }
    
    public boolean comprobarLista() {
        boolean b = false;
        Cliente temporal = principal;
        if(principal == null) {
            b = true;
        }
        return b;
    }
    
    
    
    public void agregarAlFinal(String vectorInformacion[]) {
        
        Cliente temporal = devolverUltimoCliente();
        temporal.setSiguiente(new Cliente(Integer.parseInt(vectorInformacion[1]),
                                          vectorInformacion[0],
                                          Integer.parseInt(vectorInformacion[1]),
                                          vectorInformacion[2],
                                          vectorInformacion[3],
                                          null));
   
    }//Fin agregarAlFinal
    
    public void ultimoPrioridadAlta(String vectorInformacion[]) {
        
        Cliente temporal = devolverUltimoPrioridadAlta();
        temporal.setSiguiente(new Cliente(Integer.parseInt(vectorInformacion[1]),
                                          vectorInformacion[0],
                                          Integer.parseInt(vectorInformacion[1]),
                                          vectorInformacion[2],
                                          vectorInformacion[3],
                                          null));
        
    }
    
    public Cliente devolverUltimoCliente() {
        
        Cliente temporal = principal;
        while(temporal.getSiguiente()!=null) {
            temporal = temporal.getSiguiente();
        }
        return temporal; 
        
    }//Fin devolverUltimoCliente
    
    public Cliente devolverUltimoPrioridadAlta() {
        
        Cliente temporal = principal;
        while(temporal.getSiguiente()!= null && temporal.getSiguiente().getPrioridad().equals("Alta")) {
            temporal = temporal.getSiguiente();
            System.out.println("Nombre"+temporal.getNombre());
        }
        return temporal;
        
    }//Fin devolverUltimoPrioridadAlta
    
    public Cliente devolverPenultimoNodo() {
        
        Cliente temporal = principal;
        while(temporal.getSiguiente().getSiguiente() != null) {
            temporal = temporal.getSiguiente();
        }
        
        return temporal;
        
    }
    
    public void eliminarPrimero() {
        
        Cliente temporal = principal;
        principal = temporal.getSiguiente();
        
    }
    
    public String atenderCliente() {
        
        String valores = "";
        Cliente temporal = principal; 
        valores+=temporal.getNombre()+"-"+temporal.getEdad()+"-"+temporal.getTipoServicio()+"-"+temporal.getPrioridad();
        return valores;
        
    }
    
//    public void modificar(int datoModificar, int datoNuevo) {
//        
//        Cliente temporal = principal;
//        while(temporal.getDato() != datoModificar) {
//            temporal = temporal.getSiguiente();
//        }
//        temporal.setDato(datoNuevo);
//        
//    }
//        
    /**
     * Borra un nodo de la lista, tomando en cuenda el dato que ingresa
     * @param datoEliminar 
     */
    
//    public void eliminar(int datoEliminar)
//    {
//        Cliente auxiliar = principal;
//        boolean haEliminado=false;
//        if(auxiliar.dato==datoEliminar)
//        {
//            primero=primero.siguiente;
//            haEliminado=true;
//        }
//        else
//        {
//            auxiliar=devolverUltimoCliente();
//            if(auxiliar.dato==datoEliminar)
//            {
//                auxiliar=devolverAntepenultimoNodo();
//                auxiliar.siguiente=null;
//                haEliminado=true;
//            }
//        }
//        if(!haEliminado)
//        {
//            Nodo temporal;
//            auxiliar=devolverNodoAnterior(datoEliminar);
//            temporal=auxiliar.siguiente.siguiente;
//            auxiliar.siguiente=temporal;
//        }
//    }
//    
//    public Cliente nodoAnterior(int buscarNodo) {
//        Cliente temporal = principal;
//        while(temporal.getSiguiente().getDato() != buscarNodo) {
//            temporal = temporal.getSiguiente();
//        }
//        
//        return temporal;
//    }
    
    
 /**
  * Ordena la cola de mayor a menor, tomando en cuenda la edad
  */
public void ordenarMayorAMenor()
    {
        int cantidadNodos=devolverCantidadNodos();
        
        int tempCedula;
        String tmpNom;
        int tmpEdad;
        String tmpTipoServicio;
        String tmpPrioridad;
        
        Cliente auxiliar = principal;
        
        for(int contador=0;contador<cantidadNodos;contador++)
        {
            auxiliar = principal;
            while(auxiliar.getSiguiente() != null)
            {
                if(auxiliar.getEdad() < auxiliar.getSiguiente().getEdad())
                {
                    
                    tempCedula = auxiliar.cedula;
                    auxiliar.cedula = auxiliar.siguiente.cedula;
                    auxiliar.siguiente.cedula = tempCedula;
                    
                    tmpNom = auxiliar.nombre;
                    auxiliar.nombre = auxiliar.siguiente.nombre;
                    auxiliar.siguiente.nombre = tmpNom;
                    
                    tmpEdad = auxiliar.edad;
                    auxiliar.edad = auxiliar.siguiente.edad;
                    auxiliar.siguiente.edad = tmpEdad;
                    
                    tmpTipoServicio = auxiliar.tipoServicio;
                    auxiliar.tipoServicio = auxiliar.siguiente.tipoServicio;
                    auxiliar.siguiente.tipoServicio = tmpTipoServicio;
                    
                    tmpPrioridad = auxiliar.prioridad;
                    auxiliar.prioridad = auxiliar.siguiente.prioridad;
                    auxiliar.siguiente.prioridad = tmpPrioridad;                    
                   
                }
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }

/**
 * Ordena la cola de Menor a mayor, tomando en cuenta la edad
 */
public void ordenarMenorAMayor()
    {
        int cantidadNodos=devolverCantidadNodos();
        
        int tempCedula;
        String tmpNom;
        int tmpEdad;
        String tmpTipoServicio;
        String tmpPrioridad;
                
        Cliente auxiliar = principal;
        
        for(int contador=0;contador<cantidadNodos;contador++)
        {
            auxiliar = principal;
            while(auxiliar.getSiguiente() != null)
            {
                if(auxiliar.getEdad() > auxiliar.getSiguiente().getEdad())
                {
                    tempCedula = auxiliar.cedula;
                    auxiliar.cedula = auxiliar.siguiente.cedula;
                    auxiliar.siguiente.cedula = tempCedula;
                    
                    tmpNom = auxiliar.nombre;
                    auxiliar.nombre = auxiliar.siguiente.nombre;
                    auxiliar.siguiente.nombre = tmpNom;
                    
                    tmpEdad = auxiliar.edad;
                    auxiliar.edad = auxiliar.siguiente.edad;
                    auxiliar.siguiente.edad = tmpEdad;
                    
                    tmpTipoServicio = auxiliar.tipoServicio;
                    auxiliar.tipoServicio = auxiliar.siguiente.tipoServicio;
                    auxiliar.siguiente.tipoServicio = tmpTipoServicio;
                    
                    tmpPrioridad = auxiliar.prioridad;
                    auxiliar.prioridad = auxiliar.siguiente.prioridad;
                    auxiliar.siguiente.prioridad = tmpPrioridad;
                    
                }
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }

    public int devolverCantidadNodos()
    {
        int contador=1;
        Cliente auxiliar = principal;
        while(auxiliar.getSiguiente()!=null)
        {
            contador++;
            auxiliar = auxiliar.getSiguiente();
        }
        
        return contador;
    }

    
}//Fin de la clase MetodosCliente
