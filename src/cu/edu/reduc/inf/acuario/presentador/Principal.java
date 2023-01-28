package cu.edu.reduc.inf.acuario.presentador;

import cu.edu.reduc.inf.acuario.modelo.*;
import cu.edu.reduc.inf.acuario.vista.VistaPrincipal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal implements Runnable{
    SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
    Repositorio repositorio = new Repositorio();
    VistaPrincipal vista = new VistaPrincipal();
    GestionEspecieAcuatica gestionEspecieAcuatica = new GestionEspecieAcuatica(repositorio);
    GestionEntrenador gestionEntrenador = new GestionEntrenador(repositorio);
    GestionEspectaculo gestionEspectaculo = new GestionEspectaculo(repositorio);
    GestionReportes gestionReportes = new GestionReportes(repositorio);
    public void run() {
        // Cargando datos iniciales
        try {
            EspecieAcuatica animal1 = new AnimalAcuatico(1, "Delphinidae", "delfines",
                "mar", "Millie", 3, "Mamíferos", true,
                false, null, null);
            EspecieAcuatica animal2 = new AnimalAcuatico(2, "Otaria flavescens", "lobos marinos",
                    "mar", "Bart", 3, "Mamíferos", true,
                    true, this.fecha.parse("28/5/2006"), // ARREGLAR FECHA
                    "Pedro Hernandez Gonzalez");
            EspecieAcuatica animal3 = new AnimalAcuatico(7, "Spheniscidae", "otros",
                "mar", "Lili", 1, "aves", true, false,
                null, null);
            EspecieAcuatica animal4 = new AnimalAcuatico(8, "Spheniscidae", "otros",
                "mar", "Bily", 2, "aves", true, false,
                null, null);
            EspecieAcuatica animal5 = new AnimalAcuatico(9, "Delphinidae", "delfines",
                    "Mar", "Bob", 10, "Mamíferos", false,
                    true, fecha.parse("17/1/2017"), "Juan García Hernández");
            EspecieAcuatica animal6 = new AnimalAcuatico(10, "Delphinidae", "delfines",
                    "Mar", "Sparky", 9, "Mamíferos", false,
                    true, fecha.parse("17/1/2017"), "Elizabeth Perez Usbert");
            EspecieAcuatica animal7 = new AnimalAcuatico(11, "Delphinidae", "delfines",
                    "Mar", "May", 11, "Mamíferos", false,
                    true, fecha.parse("17/1/2017"), "Juan García Hernández");
            EspecieAcuatica animal8 = new AnimalAcuatico(12, "Delphinidae", "delfines",
                    "Mar", "Juno", 9, "Mamíferos", false,
                    true, fecha.parse("17/1/2017"), "Jesus Perez Mayo");

            PlantaAcuatica planta1 = new PlantaAcuatica(3, "Nymphaea odorata alba blanca",
                    "Nympháceas", "Rio", 26, false);
            PlantaAcuatica planta2 = new PlantaAcuatica(4, "Limnobium laevigatum",
                    "Hidrocaritáceas", "Rio", 7, false);
            PlantaAcuatica planta3 = new PlantaAcuatica(5, "Azolla filiculoides",
                    "Salviniáceas", "Rio", 13, false);
            PlantaAcuatica planta4 = new PlantaAcuatica(6, "Spirodela intermedia",
                    "Lemnáceas", "Rio", 21, false);

            repositorio.insertarEspecieAcuatica(animal1);
            repositorio.insertarEspecieAcuatica(animal2);
            repositorio.insertarEspecieAcuatica(animal3);
            repositorio.insertarEspecieAcuatica(animal4);
            repositorio.insertarEspecieAcuatica(animal5);
            repositorio.insertarEspecieAcuatica(animal6);
            repositorio.insertarEspecieAcuatica(animal7);
            repositorio.insertarEspecieAcuatica(animal8);
            repositorio.insertarEspecieAcuatica(planta1);
            repositorio.insertarEspecieAcuatica(planta2);
            repositorio.insertarEspecieAcuatica(planta3);
            repositorio.insertarEspecieAcuatica(planta4);

            Entrenador entrenador1 = new Entrenador("98102632132", "Elizabeth Perez Usbert",
                    "Eli",26, "F", fecha.parse("16/6/1998"), 5);
            Entrenador entrenador2 = new Entrenador("00041226321", "Pedro Hernandez Gonzalez",
                "Pepe", 24, "M", fecha.parse("12/4/2000"), 1);
            Entrenador entrenador3 = new Entrenador("83021965987", "Juan García Hernández",
                "García", 38, "M", fecha.parse("19/2/1983"), 10);
            Entrenador entrenador4 = new Entrenador("00032654214", "Maria Benitez Marín",
                "Marín", 24, "F", fecha.parse("26/3/2000"), 1);
            Entrenador entrenador5 = new Entrenador("95041926321", "Jesus Perez Mayo",
                    "Mayo", 29, "M", fecha.parse("19/4/1995"), 8);

            repositorio.insertarEntrenador(entrenador1);
            repositorio.insertarEntrenador(entrenador2);
            repositorio.insertarEntrenador(entrenador3);
            repositorio.insertarEntrenador(entrenador4);
            repositorio.insertarEntrenador(entrenador5);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        int opc = 0;
        int opcGestion = 0;
        do {
            opc = this.vista.principal();
            switch (opc){
                case 1:
                    //Gestion
                    do {
                        opcGestion = this.vista.gestion();
                        switch (opcGestion) {
                            case 1:
                                // Especies
                                this.gestionEspecieAcuatica.run();
                                break;

                            case 2:
                                // Entrenadores
                                this.gestionEntrenador.run();
                                break;

                            case 3:
                                // Espectaculos
                                this.gestionEspectaculo.run();
                                break;

                            default:
                                System.out.println("Debe seleccionar la opción por su número");
                                break;

                            case 4:
                                break;
                        }
                    }while (opcGestion != 4);
                case 2:
                    //Reportes
                    this.gestionReportes.run();
                    break;
                case 3:
                    //Salir
                    break;

                default:
                    System.out.println("Debe seleccionar la opción por su número");
                    break;
            }

        }while (opc != 3);
    }

}
