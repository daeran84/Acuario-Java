package cu.edu.reduc.inf.acuario.presentador;

import cu.edu.reduc.inf.acuario.vista.VistaPresentadorPrincipal;

import java.util.Scanner;

public class PresentadorPrincipal implements Runnable{
    public void run() {
        VistaPresentadorPrincipal vistaPresentadorPrincipal = new VistaPresentadorPrincipal();
        GestionEspecieAcuatica gestionEspecieAcuatica = new GestionEspecieAcuatica();
        Thread gestEspAc = new Thread(gestionEspecieAcuatica);
        System.out.println("estas en el presentador principal");
        Scanner scanner = new Scanner(System.in);

        int opc = 0;
        int opcGestion = 0;
        do {
            opc = vistaPresentadorPrincipal.principal();
            switch (opc){
                case 1:
                    //Gestion
                    do {
                        opcGestion = vistaPresentadorPrincipal.gestion();
                        switch (opcGestion) {
                            case 1:
                                // Especies
                                gestEspAc.start();
                                break;

                            case 2:
                                // Entrenadores
                                System.out.println("Not implemented yet");
                                break;

                            case 3:
                                // Espectaculos

                            default:
                                System.out.println("Debe seleccionar la opción por su número");

                                break;
                        }
                    }while (opcGestion != 6);
                case 2:
                    //Reportes
                    break;

                default:
                    System.out.println("Debe seleccionar la opción por su número");

            }

        }while (opc != 3);
    }






}
