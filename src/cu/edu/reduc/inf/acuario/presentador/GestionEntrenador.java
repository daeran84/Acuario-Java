package cu.edu.reduc.inf.acuario.presentador;

import cu.edu.reduc.inf.acuario.modelo.Entrenador;
import cu.edu.reduc.inf.acuario.modelo.Repositorio;
import cu.edu.reduc.inf.acuario.vista.VistaGestionEntrenador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.util.Date;

public class GestionEntrenador implements Runnable{
    VistaGestionEntrenador vista = new VistaGestionEntrenador();
    Repositorio repo;
    public GestionEntrenador(Repositorio repositorio) {
        this.repo = repositorio;
    }
    SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public void run() {

        int opc = 0;

        do {
            opc = this.vista.gestionEntrenador();
            switch (opc){
                case 1:
                    //Insertar Entrenador
                    try {
                    String ci = vista.getCi();
                    String nombre = vista.getNombreApellidos();
                    String nombreArtistico = vista.getNombreArtistico();

                    String sexo;
                    int i = ci.charAt(9);
                    if (i % 2 == 0){
                        sexo = "M";
                    }else sexo = "F";
                    System.out.println("Sexo: " + sexo);

                    int anno = Integer.parseInt(String.valueOf(ci.charAt(0)) + String.valueOf(ci.charAt(1)));
                    if (anno > 23){
                        anno = Integer.parseInt("19" + String.valueOf(ci.charAt(0)) + String.valueOf(ci.charAt(1)));
                    }else {
                        anno = Integer.parseInt("20" + String.valueOf(ci.charAt(0)) + String.valueOf(ci.charAt(1)));
                    }

                    int mes = Integer.parseInt(String.valueOf(ci.charAt(2)) + String.valueOf(ci.charAt(3)));
                    int dia = Integer.parseInt(String.valueOf(ci.charAt(4)) + String.valueOf(ci.charAt(5)));
                    Date fechaDeNacimiento = fecha.parse(String.valueOf(dia) + "/" + String.valueOf(mes) + "/"
                            + String.valueOf(anno));
                    System.out.println("Fecha de nacimiento: " + fecha.format(fechaDeNacimiento));

                    LocalDate today = LocalDate.now();
                    System.out.println(today);
                    LocalDate birthday = LocalDate.of( anno, Month.of(mes), dia);
                    Period p = Period.between(birthday, today);
                    int edad = p.getYears();
                    System.out.println("Edad: " + edad);

                    int experiencia = vista.getAniosDeExperiencia();

                    repo.insertarEntrenador(new Entrenador(ci, nombre, nombreArtistico, edad, sexo, fechaDeNacimiento,
                            experiencia));
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 2:
                    //Actualizar Entrenador
                    String ci = vista.getCi();
                    if (!repo.existeCiDeEntrenador(ci)){
                        System.out.println("No existe un entrenador con ese CI");
                        break;
                    }
                    try {
                        String nombre = vista.getNombreApellidos();
                        String nombreArtistico = vista.getNombreArtistico();

                        String sexo;
                        int i = ci.charAt(9);
                        if (i % 2 == 0){
                            sexo = "M";
                        }else sexo = "F";
                        System.out.println("Sexo: " + sexo);

                        int anno = Integer.parseInt(String.valueOf(ci.charAt(0)) + String.valueOf(ci.charAt(1)));
                        if (anno > 23){
                            anno = Integer.parseInt("19" + String.valueOf(ci.charAt(0)) + String.valueOf(ci.charAt(1)));
                        }else {
                            anno = Integer.parseInt("20" + String.valueOf(ci.charAt(0)) + String.valueOf(ci.charAt(1)));
                        }

                        int mes = Integer.parseInt(String.valueOf(ci.charAt(2)) + String.valueOf(ci.charAt(3)));
                        int dia = Integer.parseInt(String.valueOf(ci.charAt(4)) + String.valueOf(ci.charAt(5)));
                        Date fechaDeNacimiento = fecha.parse(String.valueOf(dia) + "/" + String.valueOf(mes) + "/"
                                + String.valueOf(anno));
                        System.out.println("Fecha de nacimiento: " + fecha.format(fechaDeNacimiento));

                        LocalDate today = LocalDate.now();
                        LocalDate birthday = LocalDate.of( anno, Month.of(mes), dia);
                        Period p = Period.between(birthday, today);
                        int edad = p.getYears();
                        System.out.println("Edad: " + edad);

                        int experiencia = vista.getAniosDeExperiencia();

                        repo.actualizarEntrenador(new Entrenador(ci, nombre, nombreArtistico, edad, sexo, fechaDeNacimiento,
                                experiencia));
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 3:
                    //Eliminar Entrenador
                    repo.eliminarAnimalAcuatico(repo.indEntrenador(vista.getCi()));
                    break;

                case 4:
                    //Listar Entrenadores
                    for(Entrenador entrenador : repo.getListaEntrenadores())
                        System.out.println(entrenador);
                    break;

                case 5:
                    //Salir
                    break;

            }
        }while (opc != 5);


    }
}
