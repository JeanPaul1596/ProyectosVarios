/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import dao.Persona;
import dao.PersonaRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "verPersonas")
@RequestScoped
public class VerPersonas extends Persona {
    private List<Persona> listaPersonas = new ArrayList<Persona>();

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }
    
    public VerPersonas() {
    }
    
    @PostConstruct
    public void init(){
        listaPersonas = PersonaRepositorio.getListaPersonas();
    }
    
}
