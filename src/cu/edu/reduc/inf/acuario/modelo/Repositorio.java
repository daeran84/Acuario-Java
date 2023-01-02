package cu.edu.reduc.inf.acuario.modelo;
import com.sun.istack.internal.NotNull;
import cu.edu.reduc.inf.acuario.modelo.EspecieAcuatica;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Repositorio {
    private ArrayList<EspecieAcuatica> listaDeEspecieAcuatica = new ArrayList<>();



    private ArrayList<Entrenador> listaEntrenadores = new ArrayList<>();

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

    public boolean actualizarEspecieAcuatica(int id, EspecieAcuatica especieAcuatica){ //REVISAR FUNCION
        for (int i = 0; i < this.getListaDeEspecieAcuatica().size(); i++){
            if (this.getListaDeEspecieAcuatica().get(i).esIdDeEspecie(id)) {
                this.listaDeEspecieAcuatica.set( i, especieAcuatica);
                System.out.println("Animal acuatico actualizado");
            }
        }
        return false;
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


    // Set & Get

    public ArrayList<EspecieAcuatica> getListaDeEspecieAcuatica() {return listaDeEspecieAcuatica;}

    public ArrayList<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }


}

