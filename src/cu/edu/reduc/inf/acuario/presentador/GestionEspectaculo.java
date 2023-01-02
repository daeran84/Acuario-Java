package cu.edu.reduc.inf.acuario.presentador;

import cu.edu.reduc.inf.acuario.modelo.Repositorio;
import cu.edu.reduc.inf.acuario.vista.VistaGestionEspectaculo;

public class GestionEspectaculo implements Runnable{
    VistaGestionEspectaculo vista = new VistaGestionEspectaculo();
    Repositorio repo;
    public GestionEspectaculo(Repositorio repositorio) {
        this.repo = repositorio;
    }

    @Override
    public void run() {

        int opc = 0;
        do {
            opc = this.vista.gestionEspectaculo();
            switch (opc){
                case 1:
                    //insertar espectaculo
                    System.out.println("insertar espectaculo");
                    break;
                case 2:
                    //actualizar espectaculo
                    System.out.println("actualizar espectaculo");
                    break;
                case 3:
                    //eliminar espectaculo
                    System.out.println("Eliminar espectaculo");
                    break;
                case 4:
                    //listar espectaculos
                    System.out.println("listar espectaculos");
                case 5:
                    break;
                default:
                    System.out.println("Inserte una opcion del menu");
            }
        }while(opc != 5);


    }
}
