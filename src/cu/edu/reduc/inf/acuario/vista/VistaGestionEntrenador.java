package cu.edu.reduc.inf.acuario.vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class VistaGestionEntrenador {
    SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
    public int gestionEntrenador(){
        int opc = 0;

        System.out.println("Gestion de los entrenadores:");
        System.out.println("1- Insertar Entrenador");
        System.out.println("2- Actualizar Entrenador");
        System.out.println("3- Eliminar Entrenador");
        System.out.println("4- Listar Entrenadores");
        System.out.println("5- Salir");
        System.out.print(": ");

        opc = new Scanner(System.in).nextInt();

        return opc;
    }
    public String getCi(){
        do {
            System.out.print("CI: ");
            String ci = new Scanner(System.in).nextLine().trim();
            if (ci.chars().allMatch(Character::isDigit) && ci.length() == 11) {
                return ci;
            }
            System.out.println("El CI debe tener 11 digitos y contener solo numeros");
        }while (true);
    }

    public String getNombreApellidos(){
        System.out.print("Nombre y apellidos: ");
        return new Scanner(System.in).nextLine().trim();
    }

    public String getNombreArtistico(){
        System.out.print("Nombre artistico: ");
        return new Scanner(System.in).nextLine().trim();
    }

    public int getAniosDeExperiencia(){
        System.out.print("Años de esperiencia: ");
        return new Scanner(System.in).nextInt();
    }

}
