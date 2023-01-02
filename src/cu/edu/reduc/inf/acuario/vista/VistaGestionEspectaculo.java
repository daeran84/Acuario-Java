package cu.edu.reduc.inf.acuario.vista;

import java.util.Scanner;

public class VistaGestionEspectaculo {

    public int gestionEspectaculo(){

        System.out.println("Gestion Espectaculos");
        System.out.println("1- Insertar espectaculo");
        System.out.println("2- Actualizar espectaculo");
        System.out.println("3- Eliminar espectaculo");
        System.out.println("4- Listar espectaculo");
        System.out.println("5- Salir");

        return new Scanner(System.in).nextInt();
    }
}
