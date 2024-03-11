/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.vo;

/**
 *
 * @author Robinson
 */

//La clase PersonaVo.java contiene los setter y getter de las 5 variables de los atributos de Persona.
public class PersonaVo {
    private Integer idPersona;
    private String nombrePersona;
    private Integer edadPersona;
    private String profesionPersona;
    private Integer telefonoPersona;

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public Integer getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(Integer edadPersona) {
        this.edadPersona = edadPersona;
    }

    public String getProfesionPersona() {
        return profesionPersona;
    }

    public void setProfesionPersona(String profesionPersona) {
        this.profesionPersona = profesionPersona;
    }

    public Integer getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(Integer telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }    
}
