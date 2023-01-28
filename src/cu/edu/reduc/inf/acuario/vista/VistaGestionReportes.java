package cu.edu.reduc.inf.acuario.vista;

import java.util.Scanner;

public class VistaGestionReportes {
    public int reportes(){
        int opc = 0;
        System.out.println("1- Familia de planta acuatica mas representada");
        System.out.println("2- Animales del entrenador");
        System.out.println("3- Salir");
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
}
