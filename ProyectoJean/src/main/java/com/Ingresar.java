/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import dao.DatosReservacion;
import dao.ReservacionRepositorio;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author jeanp
 */
@Named(value = "ingresar")
@RequestScoped
public class Ingresar extends DatosReservacion {

    /**
     * Creates a new instance of Ingresar
     */
    public Ingresar() {
    }
    
    public String guardarInformacion(){
        ReservacionRepositorio reservacionrepositorio = new ReservacionRepositorio();
        reservacionrepositorio.crearPersona(this);
        return "VerDatosReservacion";
    }
}

