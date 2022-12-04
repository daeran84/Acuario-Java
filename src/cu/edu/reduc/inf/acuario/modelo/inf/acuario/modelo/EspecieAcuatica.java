package cu.edu.reduc.inf.acuario.modelo.inf.acuario.modelo;

import java.text.DecimalFormat;
import java.util.Objects;

public class EspecieAcuatica{
    private int id;
    private String nombreCientifico;
    private String familia;
    private String habitatNatural;
    public EspecieAcuatica(int id, String nombreCientifico, String familia, String habitatNatural){
        this.id = id;
        this.nombreCientifico = nombreCientifico;
        this.familia = familia;
        this.habitatNatural = habitatNatural;
    }

    public  float indiceDeAceptacion() {
        if (Objects.equals(this.habitatNatural, "rio")) {
            return 0.75F;
        }
        return 0.9F;
    }
    public int getId() { return this.id; }
    public void setId(int value) { this.id = value; }

    public String getNombreCientifico() { return this.nombreCientifico; }
    public void setNombreCientifico(String value) { this.nombreCientifico = value; }

    public String getFamilia() { return this.familia; }
    public void setFamilia(String value) { this.familia = value; }

    public String getHabitatNatural() { return this.habitatNatural; }
    public void setHabitatNatural(String value) { this.habitatNatural = value; }

    public boolean esIdDeEspecie(int id) {return this.id == id;}

}
