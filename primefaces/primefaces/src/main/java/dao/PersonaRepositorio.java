/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;


public class PersonaRepositorio {
    private static List<Persona> listaPersonas = new ArrayList<>();

    public static List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public static void setListaPersonas(List<Persona> listaPersonas) {
        PersonaRepositorio.listaPersonas = listaPersonas;
    }

    public static void agregarPersona(Persona persona){
        listaPersonas.add(persona);
    }
}
