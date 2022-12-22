package cu.edu.reduc.inf.acuario.modelo;
import com.sun.istack.internal.NotNull;
import cu.edu.reduc.inf.acuario.modelo.EspecieAcuatica;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private ArrayList<EspecieAcuatica> listaDeEspecieAcuatica = new ArrayList<>();

    // Functions for Lists
    // Species list
    /* REFERENCIA DEL PROYECTO EN PYTHON

    def ind_especie(self, id_esp):  # OK
        for i in range(len(self.__lista_especies)):
            if self.__lista_especies[i].es_id_especie(id_esp):
            return i
    def eliminar_especie(self, id_esp):  # OK
        ind = self.ind_especie(id_esp)
        if ind is None:
            raise Exception('Ese registro no existe')
        self.__lista_especies.remove(self.__lista_especies[ind])
    */

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

    public boolean actualizarEspecieAcuatica(int id, EspecieAcuatica especieAcuatica){
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

