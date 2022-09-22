/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import dao.DatosReservacion;
import dao.ReservacionRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author jeanp
 */
@Named(value = "verDatosReservacion")
@RequestScoped
public class VerDatosReservacion extends DatosReservacion{
    private List<DatosReservacion> datosreservacion = new ArrayList<DatosReservacion>();

    public List<DatosReservacion> getListaPersonas() {
        return datosreservacion;
    }
    /**
     * Creates a new instance of VerPersonas
     */
    public VerDatosReservacion() {
    }
    
    @PostConstruct
    public void init(){
        ReservacionRepositorio reservacionrepositorio = new ReservacionRepositorio();
        this.datosreservacion = reservacionrepositorio.leerPersonas();
    }
    
}

