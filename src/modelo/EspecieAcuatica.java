package modelo;

import java.util.Objects;

public class EspecieAcuatica{
    private int id;
    private String nombreCientifico;
    private String familia;
    private String habitatNatural;

    //public EspecieAcuatica(int id, String nombreCientifico, String familia, Boolean habitatNatural){
    //    this.id = id;
    //    this.nombreCientifico = nombreCientifico;
    //    this.familia = familia;
    //   this.habitatNatural = habitatNatural;
    //}

    public int getId() { return id; }
    public void setId(int value) { this.id = value; }

    public String getNombreCientifico() { return nombreCientifico; }
    public void setNombreCientifico(String value) { this.nombreCientifico = value; }

    public String getFamilia() { return familia; }
    public void setFamilia(String value) { this.familia = value; }

    public String getHabitatNatural() { return habitatNatural; }
    public void setHabitatNatural(String value) { this.habitatNatural = value; }

    //def es_id_especie(self, id):
    //        return int(self.id) == int(id)

    //def ind_acep(self):
    //        if self.habitat_natural == 'Mar':
    //        return 0.9
    //        if self.habitat_natural == 'Rio':
    //        return 0.75

    public boolean esIdDeEspecie(int id) {return this.id == id;}

    public double indiceDeAceptacion() {
        if (Objects.equals(this.habitatNatural, "mar")){ return 0.9; }
        if (Objects.equals(this.habitatNatural, "rio")) { return 0.75; }
        
    }
}
