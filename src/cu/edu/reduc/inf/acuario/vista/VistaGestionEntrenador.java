package cu.edu.reduc.inf.acuario.vista;

import java.util.Scanner;

public class VistaGestionEntrenador {

    public int gestionEntrenador(){
        int opc = 0;
        System.out.println("Gestion de los entrenadores:");
        System.out.println("1- Insertar Entrenador");
        System.out.println("2- Actualizar Entrenador");
        System.out.println("3- Eliminar Entrenador");
        System.out.println("4- Listar Entrenadores");
        System.out.println("5- Salir");

        opc = new Scanner(System.in).nextInt();

        return opc;

    }
}
