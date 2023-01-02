package cu.edu.reduc.inf.acuario.presentador;

import cu.edu.reduc.inf.acuario.modelo.AnimalAcuatico;
import cu.edu.reduc.inf.acuario.modelo.EspecieAcuatica;
import cu.edu.reduc.inf.acuario.modelo.PlantaAcuatica;
import cu.edu.reduc.inf.acuario.modelo.Repositorio;
import cu.edu.reduc.inf.acuario.vista.VistaGestionEspecieAcuatica;

import java.text.ParseException;
import java.util.Date;

public class GestionEspecieAcuatica implements Runnable{
    Repositorio repo;
    public GestionEspecieAcuatica(Repositorio repositorio) {
        this.repo = repositorio;
    }

    public void run() {
        VistaGestionEspecieAcuatica vistaGestionEspecieAcuatica = new VistaGestionEspecieAcuatica();
        int opc = 0;
        do {
            opc = vistaGestionEspecieAcuatica.gestionEspecieAcuarica();
            switch (opc){
                case 1:
                    //Insertar especie
                    int tipoEspecie = vistaGestionEspecieAcuatica.getTipoEspecie();
                    if(tipoEspecie == 1) {
                        //Animal Acuatico
                        int id = vistaGestionEspecieAcuatica.getId();
                        String nombre = vistaGestionEspecieAcuatica.getNombre();
                        String nombreCientifico = vistaGestionEspecieAcuatica.getNombreCientifico();
                        String familia = vistaGestionEspecieAcuatica.getFamilia();
                        String habitat = vistaGestionEspecieAcuatica.HabitatNatural();
                        int edad = vistaGestionEspecieAcuatica.getEdad();
                        String categoria = vistaGestionEspecieAcuatica.getCategoria();
                        boolean reproducidoEnCautiverio = vistaGestionEspecieAcuatica.getReproducidoEnCautiverio();
                        boolean participaEnEspectaculo = vistaGestionEspecieAcuatica.getParticipaEnEspectaculos();
                        Date inicio = null;
                        String entrenador = null;
                        if (participaEnEspectaculo) {
                            try {
                                inicio = vistaGestionEspecieAcuatica.getFechaDeInicio();
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                            entrenador = vistaGestionEspecieAcuatica.getNombreDelEntrenador();
                        }
                        EspecieAcuatica animal = new AnimalAcuatico(id, nombre, nombreCientifico, familia, habitat, edad,
                                categoria, reproducidoEnCautiverio, participaEnEspectaculo, inicio, entrenador);
                        repo.insertarEspecieAcuatica(animal);
                    }
                    if(tipoEspecie == 2) {
                        //Planta Acuatica
                        int id = vistaGestionEspecieAcuatica.getId();
                        String nombreCientifico = vistaGestionEspecieAcuatica.getNombreCientifico();
                        String familia = vistaGestionEspecieAcuatica.getFamilia();
                        String habitat = vistaGestionEspecieAcuatica.HabitatNatural();
                        int cantidadDeEjemplares = vistaGestionEspecieAcuatica.getNumeroDeEjemplares();
                        boolean deAguasProfundas = vistaGestionEspecieAcuatica.getDeAguasProfundas();
                        EspecieAcuatica planta = new PlantaAcuatica(id, nombreCientifico, familia, habitat,
                                cantidadDeEjemplares, deAguasProfundas);
                        repo.insertarEspecieAcuatica(planta);
                    }
                    break;

                case 2:
                    //Actualizar especie
                    int id = vistaGestionEspecieAcuatica.getId();
                    if (!repo.existeIdDeEspecie(id)){
                        System.out.println("No hay una especie acuatica registrada con ese ID");
                        break;
                    }
                    int ind = repo.indiceDeEspecieAcuatica(id);
                    EspecieAcuatica especie = repo.getListaDeEspecieAcuatica().get(id);
                    if(especie instanceof AnimalAcuatico) {
                        //Animal Acuatico
                        String nombre = vistaGestionEspecieAcuatica.getNombre();
                        String nombreCientifico = vistaGestionEspecieAcuatica.getNombreCientifico();
                        String familia = vistaGestionEspecieAcuatica.getFamilia();
                        String habitat = vistaGestionEspecieAcuatica.HabitatNatural();
                        int edad = vistaGestionEspecieAcuatica.getEdad();
                        String categoria = vistaGestionEspecieAcuatica.getCategoria();
                        boolean reproducidoEnCautiverio = vistaGestionEspecieAcuatica.getReproducidoEnCautiverio();
                        boolean participaEnEspectaculo = vistaGestionEspecieAcuatica.getParticipaEnEspectaculos();
                        Date inicio = null;
                        String entrenador = null;
                        if (participaEnEspectaculo) {
                            try {
                                inicio = vistaGestionEspecieAcuatica.getFechaDeInicio();
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                            entrenador = vistaGestionEspecieAcuatica.getNombreDelEntrenador();
                        }
                        EspecieAcuatica animal = new AnimalAcuatico(id, nombre, nombreCientifico, familia, habitat, edad,
                                categoria, reproducidoEnCautiverio, participaEnEspectaculo, inicio, entrenador);
                        repo.actualizarEspecieAcuatica(id, animal);
                    }
                    if(especie instanceof PlantaAcuatica) {
                        //Planta Acuatica
                        String nombreCientifico = vistaGestionEspecieAcuatica.getNombreCientifico();
                        String familia = vistaGestionEspecieAcuatica.getFamilia();
                        String habitat = vistaGestionEspecieAcuatica.HabitatNatural();
                        int cantidadDeEjemplares = vistaGestionEspecieAcuatica.getNumeroDeEjemplares();
                        boolean deAguasProfundas = vistaGestionEspecieAcuatica.getDeAguasProfundas();
                        EspecieAcuatica planta = new PlantaAcuatica(id, nombreCientifico, familia, habitat,
                                cantidadDeEjemplares, deAguasProfundas);
                        repo.actualizarEspecieAcuatica(ind, planta);
                    }

                    break;
                case 3:
                    //Eliminar especie
                    id = vistaGestionEspecieAcuatica.getId();
                    if (!repo.existeIdDeEspecie(id)){
                        System.out.println("No hay una especie acuatica registrada con ese ID");
                        break;
                    }
                    ind = repo.indiceDeEspecieAcuatica(id);
                    repo.eliminarAnimalAcuatico(ind);

                    break;
                case 4:
                    //Listar Especie
                    for (EspecieAcuatica esp : repo.getListaDeEspecieAcuatica()){
                        System.out.println(esp);
                    }
                    break;
                case 5:
                    //Salir

                    break;
            }
        }while (opc != 5);

    }
}
