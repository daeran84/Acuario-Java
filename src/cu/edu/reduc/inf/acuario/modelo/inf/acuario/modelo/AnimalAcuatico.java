package cu.edu.reduc.inf.acuario.modelo.inf.acuario.modelo;

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
        float aceptacion = super.indiceDeAceptacion();
        if (this.getReproducidoEnCautiverio()) aceptacion += 0.1F;
        if (this.getParticipaEnEspectaculo()) aceptacion += 0.5F;
        aceptacion += this.getEdad() / 100.00;
        return aceptacion;
    }

    public String toString(){
        return this.getId() + "\n" + this.getNombre() + "\n" + this.getNombreCientifico() + "\n" + this.getEdad()
                + "\n" + this.getFamilia() + "\n" + this.getCategoria() + "\n" + this.getReproducidoEnCautiverio()
                + "\n" + this.getParticipaEnEspectaculo() + "\n" + this.getFechaDeInicioEspectaculo()
                + "\n" + this.getNombreDelEntrenador();
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

    public void setFechaDeInicioEspectaculo(Date value) { this.fechaDeInicioEspectaculo = value; }
    public Date getFechaDeInicioEspectaculo() { return this.fechaDeInicioEspectaculo; }

    public void setNombreDelEntrenador(String value) { this.nombreDelEntrenador = value; }
    public String getNombreDelEntrenador() { return this.nombreDelEntrenador; }

    //def ind_acep(self):
    //acept = EspecieAcuatica.ind_acep(self)
    //        if self.reproducido_en_cautiverio == 'Si':
    //acept += 0.1
    //        if self.espectaculo == 'Si':
    //acept += 0.5
    //acept += (self.edad / 100)
    //        return round(acept, 2) ///

    //public double indiceDeAceptacion() {

      //  if (getReproducidoEnCautiverio()){

        //}

    //}
}
