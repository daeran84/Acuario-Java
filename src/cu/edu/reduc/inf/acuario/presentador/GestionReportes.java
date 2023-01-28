package cu.edu.reduc.inf.acuario.presentador;

import cu.edu.reduc.inf.acuario.modelo.Repositorio;
import cu.edu.reduc.inf.acuario.vista.VistaGestionReportes;

public class GestionReportes implements Runnable{

    VistaGestionReportes vista = new VistaGestionReportes();
    Repositorio repo;

    public GestionReportes(Repositorio repositorio) {
        this.repo = repositorio;
    }

    @Override
    public void run() {
        int opcreportes = 0;
        do {
            opcreportes = this.vista.reportes();
            switch (opcreportes) {
                case 1:
                    //Familia de planta acuatica mas representada
                    System.out.println(repo.plantaMasRepresentada());
                    break;
                case 2:
                    //Animales por entrenador dado
                    repo.animalesDelEntrenador(vista.getCi());
                    break;
                case 3:
                    //Salir
                    break;
                case 4:
                    //
                    break;
                default:
                    System.out.println("Debe selecionar una opcion del menu");
                    break;
            }

        } while (opcreportes != 3);
    }
}
