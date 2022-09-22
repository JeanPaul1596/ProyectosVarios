/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import dao.Datos;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author jeanp
 */
@Named(value = "form")
@RequestScoped
public class Form implements Serializable{

    private Datos datos = new Datos();

    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }
    
   
     public void save() {        
        FacesMessage msg = new FacesMessage("¡Muchas gracias!","Nos pondremos en contacto");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
}
