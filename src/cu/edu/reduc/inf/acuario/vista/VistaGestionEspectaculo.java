package cu.edu.reduc.inf.acuario.vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class VistaGestionEspectaculo {
    SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
    Scanner scanner = new Scanner(System.in);

    public int gestionEspectaculo(){

        System.out.println("Gestion Espectaculos");
        System.out.println("1- Insertar espectaculo");
        System.out.println("2- Actualizar espectaculo");
        System.out.println("3- Eliminar espectaculo");
        System.out.println("4- Listar espectaculo");
        System.out.println("5- Salir");

        return new Scanner(System.in).nextInt();
    }

    public int getCodigo(){
        try {
            System.out.print("Codigo: ");
            return new Scanner(System.in).nextInt();
        }catch (InputMismatchException e){
            throw new RuntimeException(e);
        }
    }

    public String getnombre(){
        System.out.print("Nombre: ");
        return new Scanner(System.in).nextLine().trim();
    }

    public Date getFechaDeInicio() throws ParseException {
        System.out.print("Fecha de inicio(dd/MM/yyyy): ");
        return fecha.parse(new Scanner(System.in).nextLine().trim());
    }

    public int getDuracion(){
        System.out.print("Duracion(min): ");
        return new Scanner(System.in).nextInt();
    }

    public String getPublico(){
        System.out.print("Publico(niños, jóvenes, adultos o todas las edades): ");
        return new Scanner(System.in).nextLine().toLowerCase().trim();
    }
    public List<String> getAnimalesQueParticipan(){
        int opcAnimales = 0;
        List<String> animales = new ArrayList<>();
        do {
            System.out.println("1 - Agregar animal acuatico");
            System.out.println("2 - Salir");
            opcAnimales = scanner.nextInt();
            switch (opcAnimales){
                case 1:
                    System.out.print("Nombre del animal acuatico: ");
                    animales.add(scanner.nextLine());
                    break;
                case 2:
                    return animales;
            }
        }while (true);
    }

}
