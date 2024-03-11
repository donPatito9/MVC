/*
  Como podemos observar en la estructura, dividimos el sistema en 3 grandes bloques, el controlador, 
  la vista y el modelo (que se encuentra subdividido en modelo, modelo.conexion, modelo.dao y 
  modelo.vo). Dentro del controlador, se encuentra la clase cliente Principal.java.
 */
package controlador;
 
import modelo.Logica;
import modelo.vo.PersonaVo;
import vista.VentanaBuscar;
import vista.VentanaRegistro;
import vista.VentanaPrincipal;

/**
 *
 * @author Robinson
 */
//La clase Coordinador.java será quien se comunique entre la lógica del modelo y las vistas.
public class Coordinador {
    
    private Logica miLogica;
    private VentanaPrincipal miVentanaPrincipal;
    private VentanaBuscar miVentanaBuscar;
    private VentanaRegistro miVentanaRegistro;
    
    public VentanaPrincipal getMiVentanaPrincipal() { return miVentanaPrincipal;}
    public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal){this.miVentanaPrincipal = miVentanaPrincipal;}
    
    public VentanaRegistro getMiVentanaRegistro(){return miVentanaRegistro;}
    public void setMiVentanaRegistro(VentanaRegistro miVentanaRegistro){this.miVentanaRegistro = miVentanaRegistro;}
    
    public VentanaBuscar getMiVentanaBuscar(){return miVentanaBuscar;}
    public void setMiVentanaBuscar(VentanaBuscar miVentanaBuscar){this.miVentanaBuscar = miVentanaBuscar;}

    public Logica getMiLogica(){return miLogica;}
    public void setMiLogica(Logica miLogica){this.miLogica = miLogica;}

    public void mostrarVentanaRegistro(){miVentanaRegistro.setVisible(true);}
    public void mostrarVentanaConsulta() {miVentanaBuscar.setVisible(true);}
                                                                                                                                                 
    public void registrarPersona(PersonaVo miPersona) {miLogica.validarRegistro(miPersona);}
    public PersonaVo buscarPersona(String codigoPersona) {return miLogica.validarConsulta(codigoPersona);}
    
    public void modificarPersona(PersonaVo miPersona) {miLogica.validarModificacion(miPersona);}
    public void eliminarPersona(String codigo) {miLogica.validarEliminacion(codigo);}

    

}





