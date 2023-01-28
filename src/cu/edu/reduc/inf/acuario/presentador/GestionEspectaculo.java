package cu.edu.reduc.inf.acuario.presentador;

import cu.edu.reduc.inf.acuario.modelo.Espectaculo;
import cu.edu.reduc.inf.acuario.modelo.Repositorio;
import cu.edu.reduc.inf.acuario.vista.VistaGestionEspectaculo;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

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
                    try {
                        int codigo = vista.getCodigo();
                        String nombre = vista.getnombre();
                        Date fechaDeInicio = vista.getFechaDeInicio();
                        int duracion = vista.getDuracion();
                        String publico = vista.getPublico();
                        List<String> animalesQueParticipan = vista.getAnimalesQueParticipan();

                        repo.insertarEspectaculo(new Espectaculo(codigo, nombre, fechaDeInicio, duracion, publico,
                                animalesQueParticipan));

                    }catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    //actualizar espectaculo
                    try {
                        int codigo = vista.getCodigo();
                        String nombre = vista.getnombre();
                        Date fechaDeInicio = vista.getFechaDeInicio();
                        int duracion = vista.getDuracion();
                        String publico = vista.getPublico();
                        List<String> animalesQueParticipan = vista.getAnimalesQueParticipan();

                        repo.actualizarEspectaculo(new Espectaculo(codigo, nombre, fechaDeInicio, duracion, publico,
                                animalesQueParticipan));

                    }catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    //eliminar espectaculo
                    repo.eliminarEspectaculo(vista.getCodigo());
                    break;
                case 4:
                    //listar espectaculos
                    for (Espectaculo espectaculo: repo.getListaDeEspectaculos()){
                        System.out.println(espectaculo);
                    }
                case 5:
                    break;
                default:
                    System.out.println("Inserte una opcion del menu");
            }
        }while(opc != 5);


    }
}
