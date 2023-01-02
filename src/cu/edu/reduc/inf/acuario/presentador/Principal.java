package cu.edu.reduc.inf.acuario.presentador;

import cu.edu.reduc.inf.acuario.modelo.AnimalAcuatico;
import cu.edu.reduc.inf.acuario.modelo.Entrenador;
import cu.edu.reduc.inf.acuario.modelo.EspecieAcuatica;
import cu.edu.reduc.inf.acuario.modelo.Repositorio;
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
    public void run() {
        // Cargando datos iniciales

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


        repositorio.insertarEspecieAcuatica(animal1);
        repositorio.insertarEspecieAcuatica(animal2);
        repositorio.insertarEspecieAcuatica(animal3);
        repositorio.insertarEspecieAcuatica(animal4);

        try {
            Entrenador entrenador1 = new Entrenador("98102632132", "Elizabeth Perez Usbert",
                    "Eli",26, "F", fecha.parse("16/6/1998"), 5);

            Entrenador entrenador2 = new Entrenador("00041226321", "Pedro Hernandez Gonzalez",
                "Pepe", 24, "M", fecha.parse("12/4/2000"), 1);
            Entrenador entrenador3 = new Entrenador("83021965987", "Juan García Hernández",
                "García", 38, "M", fecha.parse("19/2/1983"), 10);
            Entrenador entrenador4 = new Entrenador("00032654214", "Maria Benitez Marín",
                "Marín", 24, "F", fecha.parse("26/3/2000"), 1);
            repositorio.insertarEntrenador(entrenador1);
            repositorio.insertarEntrenador(entrenador2);
            repositorio.insertarEntrenador(entrenador3);
            repositorio.insertarEntrenador(entrenador4);

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
