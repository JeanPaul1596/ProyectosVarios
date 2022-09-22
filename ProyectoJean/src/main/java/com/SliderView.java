/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import org.primefaces.event.SlideEndEvent;

/**
 *
 * @author jeanp
 */
@Named(value = "sliderView")
@RequestScoped
public class SliderView {

    
    private int number7 = 1;
    
 
   
  
 
 
    
    public int getNumber7() {
        return number7;
    }
 
    public void setNumber7(int number7) {
        this.number7 = number7;
    }
 
    
        
    public void onSlideEnd(SlideEndEvent event) {
        FacesMessage message = new FacesMessage("Muchas gracias", "Su calificación es: " + event.getValue());
        FacesContext.getCurrentInstance().addMessage(null, message);
    } 
}

