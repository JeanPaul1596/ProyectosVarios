
package dao;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
/**
 *
 * @author emily
 */
@Named(value = "contacto")
@Dependent
public class Contacto {
 private String nombCompCon;
    private String emailCon;
    private String telefonoCon;
    private String asunto;
    private String mensaje;

    public String getNombCompCon() {
        return nombCompCon;
    }

    public void setNombCompCon(String nombCompCon) {
        this.nombCompCon = nombCompCon;
    }

    public String getEmailCon() {
        return emailCon;
    }

    public void setEmailCon(String emailCon) {
        this.emailCon = emailCon;
    }

    public String getTelefonoCon() {
        return telefonoCon;
    }

    public void setTelefonoCon(String telefonoCon) {
        this.telefonoCon = telefonoCon;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    public Contacto() {
    }
}
