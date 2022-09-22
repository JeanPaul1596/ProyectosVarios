/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import dao.DatosReservacion;
import dao.ReservacionRepositorio;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author jeanp
 */
@Named(value = "buscar")
@RequestScoped
public class Buscar extends DatosReservacion{
    private String identificacionBuscar;
    private ReservacionRepositorio reservacionrepositorio = new ReservacionRepositorio();

    public String getIdentificacionBuscar() {
        return identificacionBuscar;
    }

    public void setIdentificacionBuscar(String identificacionBuscar) {
        this.identificacionBuscar = identificacionBuscar;
    }

    /**
     * Creates a new instance of Buscar
     */
    public Buscar() {
    }
    
    public String buscarIdentificacion(){
        DatosReservacion datosreservacion = reservacionrepositorio.leerPersona(this.getIdentificacionBuscar());
        this.setIdPersona(datosreservacion.getIdPersona());
        this.setNombre(datosreservacion.getNombre());
        this.setApellido1(datosreservacion.getApellido1());
        this.setApellido2(datosreservacion.getApellido2());
        this.setIdentificacion(datosreservacion.getIdentificacion());
        this.setNacionalidad(datosreservacion.getNacionalidad());
        this.setNumerodepersonas(datosreservacion.getNumerodepersonas());
        this.setDias(datosreservacion.getDias());
        this.setIdentificacionBuscar("");
        return "buscar";
    }
    
    public String eliminarPersona(){
        reservacionrepositorio.eliminarPersona(this);
        return "buscar";
    }
    
    public String actualizarPersona(){
        reservacionrepositorio.actualizarPersona(this);
        return "buscar";
    }
}
