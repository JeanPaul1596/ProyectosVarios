
package dao;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author emily
 */
@Named(value = "datosCitas")
@RequestScoped
public class DatosCitas {
    /*CITAS*/
    private int IdCitas;
    private String NombreCompleto;
    private String Cedula;
    private String Email;
    private int Telefono;
    private String NombreMascota;
    private String FechaNaci;
    private String Sexo;
    private String TipoMascota;
    private String Raza;
    private String Fecha;
    private String Hora;
    private String Descripcion;
    /*DOMICILIO*/
    private int IdCitas1;
     private String NombreCompleto1;
    private String Cedula1;
    private String Email1;
    private int Telefono1;
    private String NombreMascota1;
    private String FechaNaci1;
    private String Sexo1;
    private String TipoMascota1;
    private String Raza1;
    private String Fecha1;
    private String Hora1;
    private String Descripcion1;
    private String Provincia1;
    private String Canton1;
    private String Distrito1;
    private String Senales1;
    /*ESTETICA*/
    private int IdEstetica;
    private String NombreCompleto2;
    private String Cedula2;
    private String Email2;
    private int Telefono2;
    private String NombreMascota2;
    private String FechaNaci2;
    private String Sexo2;
    private String TipoMascota2;
    private String Raza2;
    private String Fecha2;
    private String Hora2;
    private String Descripcion2;
    private String Motivo;

    public int getIdCitas() {
        return IdCitas;
    }

    public void setIdCitas(int IdCitas) {
        this.IdCitas = IdCitas;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombreMascota() {
        return NombreMascota;
    }

    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }

    public String getFechaNaci() {
        return FechaNaci;
    }

    public void setFechaNaci(String FechaNaci) {
        this.FechaNaci = FechaNaci;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getTipoMascota() {
        return TipoMascota;
    }

    public void setTipoMascota(String TipoMascota) {
        this.TipoMascota = TipoMascota;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getIdCitas1() {
        return IdCitas1;
    }

    public void setIdCitas1(int IdCitas1) {
        this.IdCitas1 = IdCitas1;
    }

    public String getNombreCompleto1() {
        return NombreCompleto1;
    }

    public void setNombreCompleto1(String NombreCompleto1) {
        this.NombreCompleto1 = NombreCompleto1;
    }

    public String getCedula1() {
        return Cedula1;
    }

    public void setCedula1(String Cedula1) {
        this.Cedula1 = Cedula1;
    }

    public String getEmail1() {
        return Email1;
    }

    public void setEmail1(String Email1) {
        this.Email1 = Email1;
    }

    public int getTelefono1() {
        return Telefono1;
    }

    public void setTelefono1(int Telefono1) {
        this.Telefono1 = Telefono1;
    }

    public String getNombreMascota1() {
        return NombreMascota1;
    }

    public void setNombreMascota1(String NombreMascota1) {
        this.NombreMascota1 = NombreMascota1;
    }

    public String getFechaNaci1() {
        return FechaNaci1;
    }

    public void setFechaNaci1(String FechaNaci1) {
        this.FechaNaci1 = FechaNaci1;
    }

    public String getSexo1() {
        return Sexo1;
    }

    public void setSexo1(String Sexo1) {
        this.Sexo1 = Sexo1;
    }

    public String getTipoMascota1() {
        return TipoMascota1;
    }

    public void setTipoMascota1(String TipoMascota1) {
        this.TipoMascota1 = TipoMascota1;
    }

    public String getRaza1() {
        return Raza1;
    }

    public void setRaza1(String Raza1) {
        this.Raza1 = Raza1;
    }

    public String getFecha1() {
        return Fecha1;
    }

    public void setFecha1(String Fecha1) {
        this.Fecha1 = Fecha1;
    }

    public String getHora1() {
        return Hora1;
    }

    public void setHora1(String Hora1) {
        this.Hora1 = Hora1;
    }

    public String getDescripcion1() {
        return Descripcion1;
    }

    public void setDescripcion1(String Descripcion1) {
        this.Descripcion1 = Descripcion1;
    }

    public String getProvincia1() {
        return Provincia1;
    }

    public void setProvincia1(String Provincia1) {
        this.Provincia1 = Provincia1;
    }

    public String getCanton1() {
        return Canton1;
    }

    public void setCanton1(String Canton1) {
        this.Canton1 = Canton1;
    }

    public String getDistrito1() {
        return Distrito1;
    }

    public void setDistrito1(String Distrito1) {
        this.Distrito1 = Distrito1;
    }

    public String getSenales1() {
        return Senales1;
    }

    public void setSenales1(String Senales1) {
        this.Senales1 = Senales1;
    }

    public int getIdEstetica() {
        return IdEstetica;
    }

    public void setIdEstetica(int IdEstetica) {
        this.IdEstetica = IdEstetica;
    }

    public String getNombreCompleto2() {
        return NombreCompleto2;
    }

    public void setNombreCompleto2(String NombreCompleto2) {
        this.NombreCompleto2 = NombreCompleto2;
    }

    public String getCedula2() {
        return Cedula2;
    }

    public void setCedula2(String Cedula2) {
        this.Cedula2 = Cedula2;
    }

    public String getEmail2() {
        return Email2;
    }

    public void setEmail2(String Email2) {
        this.Email2 = Email2;
    }

    public int getTelefono2() {
        return Telefono2;
    }

    public void setTelefono2(int Telefono2) {
        this.Telefono2 = Telefono2;
    }

    public String getNombreMascota2() {
        return NombreMascota2;
    }

    public void setNombreMascota2(String NombreMascota2) {
        this.NombreMascota2 = NombreMascota2;
    }

    public String getFechaNaci2() {
        return FechaNaci2;
    }

    public void setFechaNaci2(String FechaNaci2) {
        this.FechaNaci2 = FechaNaci2;
    }

    public String getSexo2() {
        return Sexo2;
    }

    public void setSexo2(String Sexo2) {
        this.Sexo2 = Sexo2;
    }

    public String getTipoMascota2() {
        return TipoMascota2;
    }

    public void setTipoMascota2(String TipoMascota2) {
        this.TipoMascota2 = TipoMascota2;
    }

    public String getRaza2() {
        return Raza2;
    }

    public void setRaza2(String Raza2) {
        this.Raza2 = Raza2;
    }

    public String getFecha2() {
        return Fecha2;
    }

    public void setFecha2(String Fecha2) {
        this.Fecha2 = Fecha2;
    }

    public String getHora2() {
        return Hora2;
    }

    public void setHora2(String Hora2) {
        this.Hora2 = Hora2;
    }

    public String getDescripcion2() {
        return Descripcion2;
    }

    public void setDescripcion2(String Descripcion2) {
        this.Descripcion2 = Descripcion2;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public DatosCitas() {
    }

}
