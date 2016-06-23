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

/**
 *
 * @author JorgeIgnacio
 */
public class Ctr_FRM_VentanaNodos implements ActionListener{
    
    //Referencias de la clase
    FRM_VentanaPrincipal fRM_VentanaPrincipal;
    MetodosCliente metodosCliente;
    
    //Constructor de la clase    
    public Ctr_FRM_VentanaNodos(FRM_VentanaPrincipal fRM_VentanaPrincipal) {
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
            System.out.println("Entró");
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
               fRM_VentanaPrincipal.mensajeListaVacia();
            }
        }       

        
    }
    
}
