/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**
 *
 * @author Lisseth Reinoso
 */
public class VentanasTelefono {

    public void VentanasT() {
        
        //Creamos el panel 
        VentanaTelefono ventana=new VentanaTelefono("TELEFONOS", 400,200);
        Panel panelGeneral=new Panel();
        Panel panel1=new Panel();
        Panel panel2=new Panel();
        
       //GridLayout p=new GridLayout(2,2);
       //Para dimensionar el panel con borderLayout
      // BorderLayout orden=new BorderLayout();
       
       
       //Crear botones
       Button boton1=new Button("Registrar los telefonos");
       Button boton2=new Button("Salir");
       //FlowLayout posicionar botones
     //  FlowLayout opcionesMenu=new FlowLayout();
       
       
       
       //Introducir un texto que no se puede modificar
      Label titulo= new Label("MENÚ");
      
        //Permite la edición de un texto
      // TextField textot1=new TextField();
       
       //textot1.setText("Introduzca el número:");
       
       
       //añade el panel a a la ventana
       //panel1.setLayout(orden);
       //panel1.setLayout(orden);
       
       //Añadir dimensionalidad al panel
       
       ventana.add(panelGeneral);
       panelGeneral.add(panel1);
       panelGeneral.add(panel2);
       
      // panelGeneral.add(titulo);
       //añadir botones al panel 
       panel1.add(boton1);
       //panelGeneral.add(boton2,BorderLayout.EAST);
       panel2.add(boton2);
       
       
       
    }
    
    public void VentanaT2(){
        VentanaTelefono ventana=new VentanaTelefono("REGISTRAR TELEFONOS", 400,200);
        //Paneles
        
        
    }
    
   
   
    
}
