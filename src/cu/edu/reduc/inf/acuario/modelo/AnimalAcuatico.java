package cu.edu.reduc.inf.acuario.modelo;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalAcuatico extends EspecieAcuatica{

    private String nombre;
    private int edad;
    private String categoria;
    private boolean reproducidoEnCautiverio;
    private boolean participaEnEspectaculo;
    private Date fechaDeInicioEspectaculo;
    private String nombreDelEntrenador;


    // Constructor

    public AnimalAcuatico(int id, String nombreCientifico, String familia, String habitatNatural, String nombre,
                          int edad, String categoria, boolean reproducidoEnCautiverio, boolean participaEnEspectaculo,
                          Date fechaDeInicioEspectaculo, String nombreDelEntrenador) {
        super(id, nombreCientifico, familia, habitatNatural);

        this.nombre = nombre;
        this.edad = edad;
        this.categoria = categoria;
        this.reproducidoEnCautiverio = reproducidoEnCautiverio;
        this.participaEnEspectaculo = participaEnEspectaculo;
        this.fechaDeInicioEspectaculo = fechaDeInicioEspectaculo;
        this.nombreDelEntrenador = nombreDelEntrenador;
    }

    public float indiceDeAceptacion(){
        DecimalFormat d = new DecimalFormat("0.00");
        float aceptacion = super.indiceDeAceptacion();
        if (this.getReproducidoEnCautiverio()) aceptacion += 0.10F;
        if (this.getParticipaEnEspectaculo()) aceptacion += 0.50F;
        aceptacion += this.getEdad() / 100.00F;
        return aceptacion;
    }

    public String toString(){
        return "Animal Acuático - ID: " + this.getId() + ", Nombre: " + this.getNombre() + ", Nombre Cientifíco: "
                + this.getNombreCientifico() + ", Edad: " + this.getEdad() + ", Familia: " + this.getFamilia()
                + ", Categoria: " + this.getCategoria() + ", Reproducido en cautiverio: " + this.getReproducidoEnCautiverio()
                + ", Participa en Espectaculos: " + this.getParticipaEnEspectaculo()
                + ", \nFecha de inicio de participacion en Espectaculos:" + this.getFechaDeInicioEspectaculo()
                + ", Entrenador: " + this.getNombreDelEntrenador() + "\n";
    }

    public void setNombre(String value) { this.nombre = value; }
    public String getNombre() { return this.nombre; }

    public void setEdad(int value) { this.edad = value; }
    public int getEdad() { return this.edad; }

    public void setCategoria(String value) { this.categoria = value; }
    public String getCategoria() { return this.categoria; }

    public void setReproducidoEnCautiverio(boolean value) { this.reproducidoEnCautiverio = value; }
    public boolean getReproducidoEnCautiverio() { return this.reproducidoEnCautiverio; }

    public void setParticipaEnEspectaculo(boolean value) { this.participaEnEspectaculo = value; }
    public boolean getParticipaEnEspectaculo() { return this.participaEnEspectaculo; }

    public void setFechaDeInicioEspectaculo(String value) throws ParseException {
        this.fechaDeInicioEspectaculo = SimpleDateFormat.getDateInstance().parse(value);
    }
    public Date getFechaDeInicioEspectaculo() { return this.fechaDeInicioEspectaculo; }

    public void setNombreDelEntrenador(String value) { this.nombreDelEntrenador = value; }
    public String getNombreDelEntrenador() { return this.nombreDelEntrenador; }

}
