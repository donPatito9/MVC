/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Logica;
import vista.VentanaBuscar;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;
/**
 *
 * @author Robinson
 */

/*Finalmente, la clase Principal.java iniciará el sistema instanciando las clases de la vista, el modelo y 
el controlador.*/

public class Principal {
    
  Logica miLogica;
  VentanaPrincipal miVentanaPrincipal;
  VentanaBuscar miVentanaBuscar;
  VentanaRegistro miVentanaRegistro;
  Coordinador miCoordinador;
  
  
    public static void main(String[] args) {
        // TODO code application logic here
        Principal miPrincipal = new Principal();
        miPrincipal.iniciar();
    }
    
    private void iniciar(){
        
      miVentanaPrincipal = new VentanaPrincipal();
      miVentanaRegistro = new VentanaRegistro();
      miVentanaBuscar = new VentanaBuscar();
      miLogica = new Logica();
      miCoordinador = new Coordinador();
      
      miVentanaPrincipal.setCoordinador(miCoordinador);
      miVentanaRegistro.setCoordinador(miCoordinador);
      miVentanaBuscar.setCoordinador(miCoordinador);
      miLogica.setCoordinador(miCoordinador);
      //miCoordinador.setCoordinador(miCoordinador);
      
      miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
      miCoordinador.setMiVentanaRegistro(miVentanaRegistro);
      miCoordinador.setMiVentanaBuscar(miVentanaBuscar);
      miCoordinador.setMiLogica(miLogica);
      
      miVentanaPrincipal.setVisible(true);
      
    }
}
