package cu.edu.reduc.inf.acuario.modelo;
import com.sun.istack.internal.NotNull;
import cu.edu.reduc.inf.acuario.modelo.EspecieAcuatica;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private ArrayList<AnimalAcuatico> listaDeAnimalesAcuaticos = new ArrayList<>();

    // Functions for Lists
    // Species list

    public boolean existeIdDeEspecie(int id){
        for (int i = 0; i < this.getListaDeAnimalesAcuaticos().size(); i++){
            if (this.getListaDeAnimalesAcuaticos().get(i).esIdDeEspecie(id)) { return true;}
        }
        return false;
    }
    /*
    def ind_especie(self, id_esp):  # OK
        for i in range(len(self.__lista_especies)):
            if self.__lista_especies[i].es_id_especie(id_esp):
            return i
    */
    public int indiceDeAnimalAcuatico(int id){
        for (int i = 0; i < this.getListaDeAnimalesAcuaticos().size(); i++){
            if (this.getListaDeAnimalesAcuaticos().get(i).esIdDeEspecie(id)) {
                return i;
            }
        }
        return -1;
    }
    // AnimalAcuatico list functions
    public boolean insertarAnimalAcuatico(AnimalAcuatico animal){
        if (!this.existeIdDeEspecie(animal.getId())) {this.listaDeAnimalesAcuaticos.add(animal); return true;}
        else return false; //System.out.println("Animal con ese ID ya existe en la lista");
    }

    public boolean actualizarAnimalAcuatico(int id, AnimalAcuatico animal){
        for (int i = 0; i < this.getListaDeAnimalesAcuaticos().size(); i++){
            if (this.getListaDeAnimalesAcuaticos().get(i).esIdDeEspecie(id)) {
                this.listaDeAnimalesAcuaticos.set( i, animal);
                return true; //"Animal acuatico actualizado";
            }
        }
        return false; //"No existe ese animal acuatico en la lista!\n" + "Lo agrego?\n" + "(si/no)";
    }

    public void eliminarAnimalAcuatico(int id){
        this.getListaDeAnimalesAcuaticos().remove(this.indiceDeAnimalAcuatico(id));
    }

    /*

    def eliminar_especie(self, id_esp):  # OK
        ind = self.ind_especie(id_esp)
        if ind is None:
            raise Exception('Ese registro no existe')
        self.__lista_especies.remove(self.__lista_especies[ind])
    */



    // Set & Get

    public ArrayList<AnimalAcuatico> getListaDeAnimalesAcuaticos() {
        return this.listaDeAnimalesAcuaticos;
    }


}

