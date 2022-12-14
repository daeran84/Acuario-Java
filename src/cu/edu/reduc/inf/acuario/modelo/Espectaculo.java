package cu.edu.reduc.inf.acuario.modelo;

import java.awt.*;
import java.util.Date;
import java.util.List;

public class Espectaculo {

    private int codigo;
    private String nombre;
    private Date fechaDeInicio;
    private int duracion;
    private String publico;
    private List<String> animalesQueEntrena;

    public Espectaculo(int codigo, String nombre, Date fechaDeInicio, int duracion, String publico, List<String> animalesQueEntrena) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaDeInicio = fechaDeInicio;
        this.duracion = duracion;
        this.publico = publico;
        this.animalesQueEntrena = animalesQueEntrena;
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

    public List<String> getAnimalesQueEntrena() {
        return animalesQueEntrena;
    }

    public void setAnimalesQueEntrena(List<String> value) {
        this.animalesQueEntrena = value;
    }
}
