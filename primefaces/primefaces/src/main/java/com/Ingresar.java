/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import dao.Persona;
import dao.PersonaRepositorio;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "ingresar")
@RequestScoped
public class Ingresar extends Persona {
    
    /**
     * Creates a new instance of Ingresar
     */
    public Ingresar() {
    }
    
    public String guardarInformacion(){
        PersonaRepositorio.agregarPersona(this);
        return "verPersonas";
    }
    
}
