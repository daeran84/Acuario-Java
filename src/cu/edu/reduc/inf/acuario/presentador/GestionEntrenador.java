package cu.edu.reduc.inf.acuario.presentador;

import cu.edu.reduc.inf.acuario.modelo.Repositorio;
import cu.edu.reduc.inf.acuario.vista.VistaGestionEntrenador;
import cu.edu.reduc.inf.acuario.vista.VistaGestionEspecieAcuatica;

public class GestionEntrenador implements Runnable{
    Repositorio repo;
    public GestionEntrenador(Repositorio repositorio) {
        this.repo = repositorio;
    }

    @Override
    public void run() {
        VistaGestionEntrenador vista = new VistaGestionEntrenador();
        int opc = 0;

        do {
            opc = vista.gestionEntrenador();
            switch (opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while (opc != 5);


    }
}
