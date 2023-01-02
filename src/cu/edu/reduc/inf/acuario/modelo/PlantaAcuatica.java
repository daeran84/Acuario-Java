package cu.edu.reduc.inf.acuario.modelo;

import java.text.DecimalFormat;

public class PlantaAcuatica extends EspecieAcuatica{
    private int numeroDeEjemplares;
    private boolean esDeAguasProfundas;

    public PlantaAcuatica(int id, String nombreCientifico, String familia, String habitatNatural,
                          int numeroDeEjemplares, boolean esDeAguasProfundas) {
        super(id, nombreCientifico, familia, habitatNatural);
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.esDeAguasProfundas = esDeAguasProfundas;
    }

    public float indiceDeAceptacion(){
        float aceptacion = super.indiceDeAceptacion();
        if (this.getEsDeAguasProfundas()) aceptacion += 0.5F;
        aceptacion += this.getNumeroDeEjemplares() / 100.00;
        return aceptacion;
    }

    public String toString(){
        return "Planta Acuática - ID: " + this.getId() + " Nombre Cientifíco: " + this.getNombreCientifico()
                + " Familia: " + this.getFamilia() + "Cantidad de ejempalres: "
                + this.getNumeroDeEjemplares() + "De aguas profundas: " + this.getEsDeAguasProfundas() + "\n";
    }

    public long getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int value) {
        this.numeroDeEjemplares = value;
    }

    public boolean getEsDeAguasProfundas() {
        return esDeAguasProfundas;
    }

    public void setEsDeAguasProfundas(boolean value) {
        this.esDeAguasProfundas = value;
    }
}
