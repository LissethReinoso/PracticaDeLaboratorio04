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
        VentanaTelefono ventana = new VentanaTelefono("TELEFONOS", 400, 100);
        //Creamos paneles
        Panel panelGeneral = new Panel();
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();

        //Crear botones
        Button boton1 = new Button("Registrar los telefonos");
        Button boton2 = new Button("Salir");

        //Introducir un texto que no se puede modificar
        Label titulo = new Label("MENÚ:");
        Label n = new Label("  ");

        //Añadimos el texto al panel
        panelGeneral.add(titulo);
        panelGeneral.add(n);

        //Añadir los paneles a la ventana
        ventana.add(panelGeneral);
        panelGeneral.add(panel1);
        panelGeneral.add(panel2);

        //añadir botones al panel 
        panel1.add(boton1);
        panel2.add(boton2);

    }

    public void VentanaT2() {
        VentanaTelefono ventana = new VentanaTelefono("REGISTRAR TELEFONOS",600, 600);
        //Paneles
        Panel panelGeneral = new Panel();
        Panel panel3 = new Panel();
        Panel panel4 = new Panel();

        //GridLayout para crear una matriz con componentes 
        GridLayout registro = new GridLayout(7, 2);
        
        //BorderLayout para ubicar los botones a un lado
        BorderLayout ub=new BorderLayout();
        
        //FlowLayout visualiza botones consecutivos
         FlowLayout b=new FlowLayout();
         
         
        //creamos los botones
        Button[] botones=new Button[8];
        botones[0] = new Button("Código:");
        botones[1] = new Button("Número:");
        botones[2] = new Button("Tipo:");
        botones[3] = new Button("Operadora:");
        botones[4] = new Button("Código:");
        botones[5] = new Button("Número:");
        botones[6] = new Button("Tipo:");
        botones[7] = new Button("Operadora:");
         
          //Ingresamos datos:
          TextField codigo1=new TextField(10);
          TextField numero1=new TextField(10);
          TextField tipo1=new TextField(10);
          TextField operadora1=new TextField(10);
          TextField codigo2=new TextField(10);
          TextField numero2=new TextField(10);
          TextField tipo2=new TextField(10);
          TextField operadora2=new TextField(10);
          
          panel4.add(codigo1);
          panel4.add(numero1);
          panel4.add(tipo1);
          panel4.add(operadora1);
          panel4.add(codigo2);
          panel4.add(numero2);
          panel4.add(tipo2);
          panel4.add(operadora2);
          
          
        //añadimos a la ventana los paneles
        
        panelGeneral.setLayout(b);
        panel3.setLayout(b);
        ventana.add(panelGeneral);
        
        panelGeneral.add(panel3,BorderLayout.WEST);
        panelGeneral.add(panel4);
        
        //Añade al panel los botones 
        panel3.add(botones[0]);
        panel3.add(botones[1]);
        panel3.add(botones[2]);
        panel3.add(botones[3]);
        panel3.add(botones[4]);
        panel3.add(botones[5]);
        panel3.add(botones[6]);
        panel3.add(botones[7]);
        
        
        
        
        
        
        
        
        
    }

}
