package cu.edu.reduc.inf.acuario.presentador;

import cu.edu.reduc.inf.acuario.modelo.AnimalAcuatico;
import cu.edu.reduc.inf.acuario.modelo.EspecieAcuatica;
import cu.edu.reduc.inf.acuario.modelo.PlantaAcuatica;
import cu.edu.reduc.inf.acuario.modelo.Repositorio;
import cu.edu.reduc.inf.acuario.vista.VistaGestionEspecieAcuatica;

import java.text.ParseException;
import java.util.Date;

public class GestionEspecieAcuatica implements Runnable{
    VistaGestionEspecieAcuatica vista = new VistaGestionEspecieAcuatica();
    Repositorio repo;
    public GestionEspecieAcuatica(Repositorio repositorio) {
        this.repo = repositorio;
    }

    public void run() {
        int opc = 0;
        do {
            opc = this.vista.gestionEspecieAcuarica();
            switch (opc){
                case 1:
                    //Insertar especie
                    int tipoEspecie = this.vista.getTipoEspecie();
                    if(tipoEspecie == 1) {
                        //Animal Acuatico
                        int id = this.vista.getId();
                        String nombre = this.vista.getNombre();
                        String nombreCientifico = this.vista.getNombreCientifico();
                        String familia = this.vista.getFamilia();
                        String habitat = this.vista.HabitatNatural();
                        int edad = this.vista.getEdad();
                        String categoria = this.vista.getCategoria();
                        boolean reproducidoEnCautiverio = this.vista.getReproducidoEnCautiverio();
                        boolean participaEnEspectaculo = this.vista.getParticipaEnEspectaculos();
                        Date inicio = null;
                        String entrenador = null;
                        if (participaEnEspectaculo) {
                            try {
                                inicio = this.vista.getFechaDeInicio();
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                            entrenador = this.vista.getNombreDelEntrenador();
                        }
                        EspecieAcuatica animal = new AnimalAcuatico(id, nombre, nombreCientifico, familia, habitat, edad,
                                categoria, reproducidoEnCautiverio, participaEnEspectaculo, inicio, entrenador);
                        this.repo.insertarEspecieAcuatica(animal);
                    }
                    if(tipoEspecie == 2) {
                        //Planta Acuatica
                        int id = this.vista.getId();
                        String nombreCientifico = this.vista.getNombreCientifico();
                        String familia = this.vista.getFamilia();
                        String habitat = this.vista.HabitatNatural();
                        int cantidadDeEjemplares = this.vista.getNumeroDeEjemplares();
                        boolean deAguasProfundas = this.vista.getDeAguasProfundas();
                        EspecieAcuatica planta = new PlantaAcuatica(id, nombreCientifico, familia, habitat,
                                cantidadDeEjemplares, deAguasProfundas);
                        this.repo.insertarEspecieAcuatica(planta);
                    }
                    break;

                case 2:
                    //Actualizar especie
                    int id = this.vista.getId();
                    if (!this.repo.existeIdDeEspecie(id)){
                        System.out.println("No hay una especie acuatica registrada con ese ID");
                        break;
                    }
                    int ind = this.repo.indiceDeEspecieAcuatica(id);
                    EspecieAcuatica especie = this.repo.getListaDeEspecieAcuatica().get(id);
                    if(especie instanceof AnimalAcuatico) {
                        //Animal Acuatico
                        String nombre = this.vista.getNombre();
                        String nombreCientifico = this.vista.getNombreCientifico();
                        String familia = this.vista.getFamilia();
                        String habitat = this.vista.HabitatNatural();
                        int edad = this.vista.getEdad();
                        String categoria = this.vista.getCategoria();
                        boolean reproducidoEnCautiverio = this.vista.getReproducidoEnCautiverio();
                        boolean participaEnEspectaculo = this.vista.getParticipaEnEspectaculos();
                        Date inicio = null;
                        String entrenador = null;
                        if (participaEnEspectaculo) {
                            try {
                                inicio = this.vista.getFechaDeInicio();
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                            entrenador = this.vista.getNombreDelEntrenador();
                        }
                        EspecieAcuatica animal = new AnimalAcuatico(id, nombre, nombreCientifico, familia, habitat, edad,
                                categoria, reproducidoEnCautiverio, participaEnEspectaculo, inicio, entrenador);
                        this.repo.actualizarEspecieAcuatica(id, animal);
                    }
                    if(especie instanceof PlantaAcuatica) {
                        //Planta Acuatica
                        String nombreCientifico = this.vista.getNombreCientifico();
                        String familia = this.vista.getFamilia();
                        String habitat = this.vista.HabitatNatural();
                        int cantidadDeEjemplares = this.vista.getNumeroDeEjemplares();
                        boolean deAguasProfundas = this.vista.getDeAguasProfundas();
                        EspecieAcuatica planta = new PlantaAcuatica(id, nombreCientifico, familia, habitat,
                                cantidadDeEjemplares, deAguasProfundas);
                        this.repo.actualizarEspecieAcuatica(ind, planta);
                    }

                    break;
                case 3:
                    //Eliminar especie
                    id = this.vista.getId();
                    if (!this.repo.existeIdDeEspecie(id)){
                        System.out.println("No hay una especie acuatica registrada con ese ID");
                        break;
                    }
                    ind = this.repo.indiceDeEspecieAcuatica(id);
                    this.repo.eliminarAnimalAcuatico(ind);

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
