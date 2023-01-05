package cu.edu.reduc.inf.acuario.vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class VistaGestionEspectaculo {
    SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

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
        System.out.print("Codigo: ");
        return new Scanner(System.in).nextInt();
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
        System.out.print("Publico: ");
        return new Scanner(System.in).nextLine().toLowerCase().trim();
    }

    /*public List<String> getAnimalesQueEntrena(List<String> animales){
        System.out.println();
    }
    private List<String> animalesQueEntrena;*/


}
