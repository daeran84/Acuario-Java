package cu.edu.reduc.inf.acuario.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Espectaculo {

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private int codigo;
    private String nombre;
    private Date fechaDeInicio;
    private int duracion;
    private String publico;
    private List<String> animalesQueParticipan;

    public Espectaculo(int codigo, String nombre, Date fechaDeInicio, int duracion, String publico, List<String> animalesQueParticipan) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaDeInicio = fechaDeInicio;
        this.duracion = duracion;
        this.publico = publico;
        this.animalesQueParticipan = animalesQueParticipan;
    }

    public String toString(){
        return "Espectaculo - " + "Codigo: " + this.getCodigo() + ", Nombre: " + this.getNombre() + ", Fecha de inicio: "
                + dateFormat.format(this.getFechaDeInicio()) + ", Duracion: " + this.getDuracion() + ", " +
                "Publico: " + this.getPublico() + ",\n Animales que participan: " + this.getAnimalesQueParticipan();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int value) {
        this.codigo = value;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String value) {
        this.nombre = value;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date value) {
        this.fechaDeInicio = value;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int value) {
        this.duracion = value;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String value) {
        this.publico = value;
    }

    public List<String> getAnimalesQueParticipan() {
        return animalesQueParticipan;
    }

    public void setAnimalesQueParticipan(List<String> value) {
        this.animalesQueParticipan = value;
    }
}
