/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;
import modelo.dao.PersonaDao;
import modelo.vo.PersonaVo;
import controlador.Coordinador;
/**
 *
 * @author Robinson
 */
//La clase Logica.java, contiene las reglas de negocio del sistema.
public class Logica {
    private Coordinador miCoordinador;
    
    public static boolean consultaPersona = false;
    public static boolean modificaPersona = false;
    public void setCoordinador(Coordinador miCoordinador) {this.miCoordinador = miCoordinador;}
    public void validarRegistro(PersonaVo miPersona) {

    PersonaDao miPersonaDao;
    
    if(miPersona.getIdPersona() > 99){
      miPersonaDao = new PersonaDao();
      miPersonaDao.registrarPersona(miPersona);
    }else{
        JOptionPane.showMessageDialog(null, "El documento de la persona debe tener mas de 3 digitos","Advertencia", JOptionPane.WARNING_MESSAGE);
    }
  }
     public PersonaVo validarConsulta(String codigoPersona) {
         
     PersonaDao miPersonaDao;
       try{
          int codigo = Integer.parseInt(codigoPersona);
            if(codigo > 99){
              miPersonaDao = new PersonaDao();
              consultaPersona = true;
              return miPersonaDao.buscarPersona(codigo);
            }else{
                JOptionPane.showMessageDialog(null, "El documento de la persona debe tener mas de 3 digitos","Advertencia", JOptionPane.WARNING_MESSAGE);
                consultaPersona = false;    
            }
            
        }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, " Debe ingresar un dato numerico", "Error", JOptionPane.ERROR_MESSAGE);
                consultaPersona = false;
            
            }catch(Exception e){
              JOptionPane.showMessageDialog(null, "se a presentado un error","Error", JOptionPane.ERROR_MESSAGE);
            consultaPersona = false;        
            }
            return null; 
       }
     
       public void validarModificacion(PersonaVo miPersona) {
         
           PersonaDao miPersonaDao;
           if(miPersona.getNombrePersona().length()> 5){
              miPersonaDao = new PersonaDao();
              miPersonaDao.modificarPersona(miPersona);
              modificaPersona = true;
           }else{
             JOptionPane.showMessageDialog(null, "El documento de la persona debe tener mas de 3 digitos","Advertencia", JOptionPane.WARNING_MESSAGE);
             modificaPersona = false;
           
           }
       }
       
       public void validarEliminacion(String codigo) {
         PersonaDao miPersonaDao = new PersonaDao();
         miPersonaDao.eliminarPersona(codigo);
         
       }
}

