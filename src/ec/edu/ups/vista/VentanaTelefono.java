/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.awt.Frame;

/**
 *
 * @author Lisseth Reinoso
 */
public class VentanaTelefono extends Frame {

   //Creamos la ventana
    
    public VentanaTelefono(String titulo, int ancho, int alto){
        this.setTitle(titulo);
        this.setSize(ancho,alto);
        this.setLocation(100,100);
        this.setVisible(true);
    }
}
