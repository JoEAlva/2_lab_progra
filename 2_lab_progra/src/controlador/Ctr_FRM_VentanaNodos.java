/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.sun.imageio.plugins.jpeg.JPEG;
import vista.FRM_VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MetodosCliente;
import vista.FRM_Reportes;

/**
 *
 * @author JorgeIgnacio
 */
public class Ctr_FRM_VentanaNodos implements ActionListener{
    
    //Referencias de la clase
    FRM_VentanaPrincipal fRM_VentanaPrincipal;
    MetodosCliente metodosCliente;
    FRM_Reportes fRM_Reportes;

    
    //Constructor de la clase    
    public Ctr_FRM_VentanaNodos(FRM_VentanaPrincipal fRM_VentanaPrincipal, FRM_Reportes fRM_Reportes) {
        this.fRM_Reportes = fRM_Reportes;
        this.fRM_VentanaPrincipal = fRM_VentanaPrincipal;
        metodosCliente = new MetodosCliente();
    }

    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("MayorMenor")) {
            metodosCliente.ordenarMayorAMenor();
            fRM_VentanaPrincipal.limpiarInterfaz();
            fRM_VentanaPrincipal.imprimirEnTextArea(metodosCliente.imprimir());
        }
        
        if(e.getActionCommand().equals("MenorMayor")) {
            metodosCliente.ordenarMenorAMayor();
            fRM_VentanaPrincipal.limpiarInterfaz();
            fRM_VentanaPrincipal.imprimirEnTextArea(metodosCliente.imprimir());
        }
        
        if(e.getActionCommand().equals("GenerarFicha")) {
            metodosCliente.agregarCliente(fRM_VentanaPrincipal.getDatos());
            fRM_VentanaPrincipal.limpiarInterfaz();
            
            fRM_VentanaPrincipal.imprimirEnTextArea(metodosCliente.imprimir());
            
        }
        
        if(e.getActionCommand().equals("LlamarCliente")) {
            fRM_VentanaPrincipal.atendientoCliente(metodosCliente.atenderCliente());
            metodosCliente.eliminarPrimero();
            if(!metodosCliente.comprobarLista()) {
                fRM_VentanaPrincipal.imprimirEnTextArea(metodosCliente.imprimir());
            }else
            {
               fRM_VentanaPrincipal.limpiarTabla();
               fRM_VentanaPrincipal.mensajeListaVacia();
            }
        }
        
        if(e.getActionCommand().equals("Eliminar")) {
            metodosCliente.eliminarCliente(Integer.parseInt(fRM_VentanaPrincipal.getCedula()));
            if(!metodosCliente.comprobarLista()) {
                fRM_VentanaPrincipal.limpiarInterfaz();
                fRM_VentanaPrincipal.imprimirEnTextArea(metodosCliente.imprimir());
            }else
            {
               fRM_VentanaPrincipal.limpiarTabla();
               fRM_VentanaPrincipal.mensajeListaVacia();
            }
        }
        
        if(e.getActionCommand().equals("Modificar")) {
            
            metodosCliente.modificar(Integer.parseInt(fRM_VentanaPrincipal.getCedula()), fRM_VentanaPrincipal.getDatosModificar());
            if(!metodosCliente.comprobarLista()) {
                fRM_VentanaPrincipal.limpiarInterfaz();
                fRM_VentanaPrincipal.imprimirEnTextArea(metodosCliente.imprimir());
            }else
            {
               fRM_VentanaPrincipal.limpiarTabla();
               fRM_VentanaPrincipal.mensajeListaVacia();
            }
        }
        
        if(e.getActionCommand().equals("Reportes"))
        {
            fRM_Reportes.setVisible(true);
        }   
        
    }
    
}
