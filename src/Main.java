import cu.edu.reduc.inf.acuario.modelo.AnimalAcuatico;
import cu.edu.reduc.inf.acuario.modelo.Repositorio;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        Repositorio repo = new Repositorio();

        // Creando datos iniciales

        AnimalAcuatico animal1 = new AnimalAcuatico(1, "Delphinidae", "delfines",
                "mar", "Millie", 3, "Mamíferos", true,
                false, null, null);
        AnimalAcuatico animal2 = new AnimalAcuatico(2, "Otaria flavescens", "lobos marinos",
                "mar", "Bart", 3, "Mamíferos", true,
                true, null,
                "Pedro Hernandez Gonzalez");
        AnimalAcuatico animal3 = new AnimalAcuatico(7, "Spheniscidae", "otros",
                "mar", "Lili", 1, "aves", true, false,
                null, null);
        AnimalAcuatico animal4 = new AnimalAcuatico(8, "Spheniscidae", "otros",
                "mar", "Bily", 2, "aves", true, false,
                null, null);

        AnimalAcuatico animal5 = new AnimalAcuatico(7, "Spheniscidae", "otros",
                "mar", "Lili", 6, "aves", false, true,
                null, "pepe");

        repo.insertarAnimalAcuatico(animal1);
        repo.insertarAnimalAcuatico(animal2);
        repo.insertarAnimalAcuatico(animal3);
        repo.insertarAnimalAcuatico(animal4);
        for(int i = 0 , )
        System.out.println(repo.getListaDeAnimalesAcuaticos());
        repo.actualizarAnimalAcuatico(animal5.getId(), animal5);
        repo.eliminarAnimalAcuatico(2);
        System.out.println(repo.getListaDeAnimalesAcuaticos());
        System.out.println(repo.getListaDeAnimalesAcuaticos().get(0).indiceDeAceptacion());
    }
}