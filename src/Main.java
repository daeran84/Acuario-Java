import cu.edu.reduc.inf.acuario.modelo.AnimalAcuatico;
import cu.edu.reduc.inf.acuario.modelo.EspecieAcuatica;
import cu.edu.reduc.inf.acuario.modelo.Repositorio;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        Repositorio repo = new Repositorio();

        // Creando datos iniciales

        EspecieAcuatica animal1 = new AnimalAcuatico(1, "Delphinidae", "delfines",
                "mar", "Millie", 3, "Mamíferos", true,
                false, null, null);
        EspecieAcuatica animal2 = new AnimalAcuatico(2, "Otaria flavescens", "lobos marinos",
                "mar", "Bart", 3, "Mamíferos", true,
                true, null,
                "Pedro Hernandez Gonzalez");
        EspecieAcuatica animal3 = new AnimalAcuatico(7, "Spheniscidae", "otros",
                "mar", "Lili", 1, "aves", true, false,
                null, null);
        EspecieAcuatica animal4 = new AnimalAcuatico(8, "Spheniscidae", "otros",
                "mar", "Bily", 2, "aves", true, false,
                null, null);

        EspecieAcuatica animal5 = new AnimalAcuatico(7, "Spheniscidae", "otros",
                "mar", "Lili", 6, "aves", false, true,
                null, "pepe");

        repo.insertarEspecieAcuatica(animal1);
        repo.insertarEspecieAcuatica(animal2);
        repo.insertarEspecieAcuatica(animal3);
        repo.insertarEspecieAcuatica(animal4);

        System.out.println(repo.getListaDeEspecieAcuatica());
        repo.actualizarEspecieAcuatica(animal5.getId(), animal5);
        repo.eliminarAnimalAcuatico(2);
        System.out.println(repo.getListaDeEspecieAcuatica());
        System.out.println(repo.getListaDeEspecieAcuatica().get(0).indiceDeAceptacion());
    }
}