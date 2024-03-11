/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import controlador.Coordinador;
/**
 *
 * @author Robinson
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
    private Coordinador miCoordinador;
    private JTextArea areaIntroduccion;
    private JLabel labelTitulo, labelSelection;
    private JButton botonRegistrar, botonBuscar;
    public String textoIntroduccion = "";
    
    
    public VentanaPrincipal(){
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      botonRegistrar = new JButton();
      botonRegistrar.setBounds(100, 280, 120, 25);
      botonRegistrar.setText("Registrar");
      
      botonBuscar = new JButton();
      botonBuscar.setBounds(240, 280, 120, 25);
      botonBuscar.setText("Buscar");
      
      labelTitulo = new JLabel();
      labelTitulo.setText("PATRON MVC");
      labelTitulo.setBounds(60, 40, 380, 30);
      labelTitulo.setFont(new java.awt.Font("Verdana", 1, 15));
      
      labelSelection = new JLabel();
      labelSelection.setText("Escoja la operacion que desea realizar");
      labelSelection.setBounds(75, 240, 250, 25);
      
      textoIntroduccion = "Esta aplicacion presenta un ejemplo practico del patron"
              + " de diseño MVC.\n\n"
              + "permite registrar, actualizar, buscar y eliminar registros de la tabla Persona "
              + " tambien son vinculados algunos conceptos de los patrones Value Object y Data Acces Object\n";
      
      areaIntroduccion = new JTextArea();
      areaIntroduccion.setBounds(50, 90, 380, 140);
      areaIntroduccion.setEditable(false);
      areaIntroduccion.setFont(new java.awt.Font("Verdana", 0, 14));
      areaIntroduccion.setLineWrap(true);
      areaIntroduccion.setText(textoIntroduccion);
      areaIntroduccion.setWrapStyleWord(true);
      areaIntroduccion.setBorder(javax.swing.BorderFactory.createBevelBorder(
              javax.swing.border.BevelBorder.LOWERED, null, null, null,
              new java.awt.Color(0, 0, 0)));
      
      botonRegistrar.addActionListener(this);
      botonBuscar.addActionListener(this);
      
      add(botonBuscar);
      add(botonRegistrar);
      add(labelSelection);
      add(labelTitulo);
      add(areaIntroduccion);
      
      setSize(480, 350);
      setTitle("Patron de diseño MVC");
      setLocationRelativeTo(null);
      setResizable(false);
      setLayout(null);
    }
    
    public void setCoordinador(Coordinador miCoordinador){
      this.miCoordinador = miCoordinador;
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()== botonRegistrar){
         miCoordinador.mostrarVentanaRegistro();
      }
      if(e.getSource()== botonBuscar){
        miCoordinador.mostrarVentanaConsulta();
      }
    
    }
}
