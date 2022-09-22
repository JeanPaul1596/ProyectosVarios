
package com;
import dao.DatosCitas;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author emily
 */
@Named(value = "citasMago")
@RequestScoped
public class CitasMago implements Serializable {
 
        private DatosCitas datosCitas = new DatosCitas();
    

    public DatosCitas getDatosCitas() {
        return datosCitas;
    }

    public void setDatosCitas(DatosCitas datosCitas) {
        this.datosCitas = datosCitas;
    }
     
   
     
    public void save() {        
        FacesMessage msg = new FacesMessage("Éxito", "Cita agendada");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
   
}