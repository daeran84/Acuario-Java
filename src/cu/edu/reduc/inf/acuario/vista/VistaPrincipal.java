package cu.edu.reduc.inf.acuario.vista;

import java.util.Scanner;

public class VistaPrincipal {
    public int principal(){
        int opc = 0;
        System.out.println("1- Gestion");
        System.out.println("2- Reportes");
        System.out.println("3- Salir");
        System.out.print(": ");

        opc = new Scanner(System.in).nextInt();

        return opc;

    }

    public int gestion(){
        int opc = 0;
        System.out.println("1- Especie Acuatica");
        System.out.println("2- Entrenadores");
        System.out.println("3- Espectaculos");
        System.out.println("4- Atras");
        System.out.print(": ");

        opc = new Scanner(System.in).nextInt();

        return opc;
    }
}
