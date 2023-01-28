package cu.edu.reduc.inf.acuario.modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Repositorio {
    private ArrayList<EspecieAcuatica> listaDeEspecieAcuatica = new ArrayList<>();
    private ArrayList<Entrenador> listaEntrenadores = new ArrayList<>();
    private ArrayList<Espectaculo> listaDeEspectaculos = new ArrayList<>();

    public boolean existeIdDeEspecie(int id){
        for (int i = 0; i < this.getListaDeEspecieAcuatica().size(); i++){
            if (this.getListaDeEspecieAcuatica().get(i).esIdDeEspecie(id)) { return true;}
        }
        return false;
    }

    public int indiceDeEspecieAcuatica(int id){
        for (int i = 0; i < this.getListaDeEspecieAcuatica().size(); i++){
            if (this.getListaDeEspecieAcuatica().get(i).esIdDeEspecie(id)) {
                return i;
            }
        }
        return -1;
    }

    public void insertarEspecieAcuatica(EspecieAcuatica especieAcuatica){
        if (!this.existeIdDeEspecie(especieAcuatica.getId())) {
            this.listaDeEspecieAcuatica.add(especieAcuatica);
            System.out.println("Agregado a la lista satisfactoriamente");
        }
        else System.out.println("Animal con ese ID ya existe en la lista");
    }

    public void actualizarEspecieAcuatica(int id, EspecieAcuatica especieAcuatica) { //REVISAR FUNCION
        for (int i = 0; i < this.getListaDeEspecieAcuatica().size(); i++) {
            if (this.getListaDeEspecieAcuatica().get(i).esIdDeEspecie(id)) {
                this.listaDeEspecieAcuatica.set(i, especieAcuatica);
            }
        }
    }

    public void eliminarAnimalAcuatico(int id){
        this.getListaDeEspecieAcuatica().remove(this.indiceDeEspecieAcuatica(id));
    }

    // Lista Entrenadores

    public int indEntrenador(String ci){
        for (int i = 0; i < this.getListaEntrenadores().size(); i++){
            if(Objects.equals(this.getListaEntrenadores().get(i).getCi(), ci)){
                return i;
            }
        }
        return -1;
    }

    public boolean existeCiDeEntrenador(String ci){
        for (Entrenador entrenador : this.getListaEntrenadores()){
            if(Objects.equals(entrenador.getCi(), ci)){
                return true;
            }
        }
        return false;
    }

    public void actualizarEntrenador(Entrenador entrenador){
        for (int i = 0; i < this.getListaEntrenadores().size(); i++){
            if (this.getListaEntrenadores().get(i).esCiDeEntrenador(entrenador.getCi())) {
                this.listaEntrenadores.set( i, entrenador);
                System.out.println("Entrenador actualizado");
            }
        }
    }

    public void insertarEntrenador(Entrenador entrenador){
        if (!this.existeCiDeEntrenador(entrenador.getCi())) {
            this.listaEntrenadores.add(entrenador);
            System.out.println("Agregado a la lista satisfactoriamente");
        }
        else System.out.println("un entrenador con ese CI ya existe en la lista");
    }

    public void eliminarEntrenador(String ci){
        int ind = this.indEntrenador(ci);
        if (this.existeCiDeEntrenador(ci)){
            this.listaEntrenadores.remove(ind);
            System.out.println("Entrenador eliminado satisfactoriamente");
        }
        else {
            System.out.println("No existe un entrenador en la lista con ese CI");
        }
    }

    // Lista Espectaculos

    public int idDeEspectaculo(int codigo){
        for (int i = 0; i < this.getListaDeEspectaculos().size(); i++){
            if (this.getListaDeEspectaculos().get(i).getCodigo() == codigo) {
                 return i;
            }
        }
        return -1;
    }

    public boolean existeIdDeEspectaculo(int codigo){
        for (Espectaculo espectaculo : this.getListaDeEspectaculos()){
            if(Objects.equals(espectaculo.getCodigo(), codigo)){
                return true;
            }
        }
        return false;
    }

    public void insertarEspectaculo(Espectaculo espectaculo){
        if (!this.existeIdDeEspectaculo(espectaculo.getCodigo())) {
            this.listaDeEspectaculos.add(espectaculo);
            System.out.println("Agregado a la lista satisfactoriamente");
        }
        else System.out.println("Un espectaculo con ese codigo ya existe en la lista");

    }

    public void actualizarEspectaculo(Espectaculo espectaculo){
        int ind = this.idDeEspectaculo(espectaculo.getCodigo());
        if (ind != -1){
            this.listaDeEspectaculos.set( ind, espectaculo);
            System.out.println("Espectaculo actualizado");
        }
        else System.out.println("No existe un espectaculo con ese codigo en la lista");
    }

    public void eliminarEspectaculo(int codigo){
        int ind = this.idDeEspectaculo(codigo);
        if (ind != -1){
            this.listaDeEspectaculos.remove(ind);
            System.out.println("Espectaculo eliminado");
        }
        else System.out.println("No existe un espectaculo con ese codigo en la lista");
    }

    // Incisos

    public List<PlantaAcuatica> listaDePlantas(){
        List<PlantaAcuatica> listaDePlantas = new ArrayList<>();
        for (int i = 0; i < this.getListaDeEspecieAcuatica().size(); i++){
            if (this.getListaDeEspecieAcuatica().get(i) instanceof PlantaAcuatica) {
                listaDePlantas.add(((PlantaAcuatica)this.getListaDeEspecieAcuatica().get(i)));
            }
        }
        return listaDePlantas;
    }

    public List<AnimalAcuatico> listaDeAnimales(){
        List<AnimalAcuatico> listaDeAnimales = new ArrayList<>();
        for (int i = 0; i < this.getListaDeEspecieAcuatica().size(); i++){
            if (this.getListaDeEspecieAcuatica().get(i) instanceof AnimalAcuatico) {
                listaDeAnimales.add(((AnimalAcuatico)this.getListaDeEspecieAcuatica().get(i)));
            }
        }
        return listaDeAnimales;
    }

    public String plantaMasRepresentada(){
        float indiceMayor = 0;
        int ind = 0;
        List<PlantaAcuatica> list = this.listaDePlantas();
        for (int i = 0; i< list.size(); i++){
            if (indiceMayor < list.get(i).indiceDeAceptacion()){
                indiceMayor = list.get(i).indiceDeAceptacion();
                ind = i;
            }
        }
        return listaDePlantas().get(ind).getFamilia();
    }

    public void animalesDelEntrenador(String ci){
        String entrenador = this.getListaEntrenadores().get(this.indEntrenador(ci)).getNombreApellidos();
        for( AnimalAcuatico animal : this.listaDeAnimales()){
            if (Objects.equals(animal.getNombreDelEntrenador(), entrenador)){
                System.out.println(animal);
            }
        }
    }


    // Set & Get

    public ArrayList<EspecieAcuatica> getListaDeEspecieAcuatica() {return listaDeEspecieAcuatica;}

    public ArrayList<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }

    public ArrayList<Espectaculo> getListaDeEspectaculos() {
        return listaDeEspectaculos;
    }

}

