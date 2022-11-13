import modelo.AnimalAcuatico;

public class Main {
    public static void main(String[] args) {

        AnimalAcuatico all = new AnimalAcuatico();
        all.setId(23);
        all.setNombreCientifico("Pocus varuatus");
        all.setFamilia("Variatus Mehitus");
        all.setHabitatNatural("MellHorne");

        System.out.println(all.getFamilia());
    }
}