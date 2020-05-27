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
        VentanaTelefono ventana = new VentanaTelefono("REGISTRAR TELEFONOS", 400, 200);
        //Paneles
        Panel panelGneral = new Panel();
        Panel panel3 = new Panel();
        Panel panel4 = new Panel();
        

    }

}
