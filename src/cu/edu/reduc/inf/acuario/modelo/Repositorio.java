package cu.edu.reduc.inf.acuario.modelo;
import com.sun.istack.internal.NotNull;
import cu.edu.reduc.inf.acuario.modelo.EspecieAcuatica;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private ArrayList<EspecieAcuatica> listaDeEspecieAcuatica = new ArrayList<>();

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
        return false; //"No existe ese animal acuatico en la lista!\n" + "Lo agrego?\n" + "(si/no)";
    }

    public void eliminarAnimalAcuatico(int id){
        this.getListaDeEspecieAcuatica().remove(this.indiceDeEspecieAcuatica(id));
    }


    // Set & Get

    public ArrayList<EspecieAcuatica> getListaDeEspecieAcuatica() {return listaDeEspecieAcuatica;}


}

