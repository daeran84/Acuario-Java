package cu.edu.reduc.inf.acuario.modelo;
import cu.edu.reduc.inf.acuario.modelo.EspecieAcuatica;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private ArrayList<AnimalAcuatico> listaDeAnimalesAcuaticos = new ArrayList<>();
    public Repositorio() {

    }

    // Functions for Lists
    // Species list

    //def ind_especie(self, id_esp):  # OK
    //    for i in range(len(self.__lista_especies)):
    //        if self.__lista_especies[i].es_id_especie(id_esp):
    //        return i

    public boolean existeIdDeEspecie(int id){
        for (int i = 0; i < this.getListaDeAnimalesAcuaticos().size(); i++){
            if (this.getListaDeAnimalesAcuaticos().get(i).esIdDeEspecie(id)); {return true;}
        }
        return false;

    }

    // Set & Get

    public ArrayList<AnimalAcuatico> getListaDeAnimalesAcuaticos() {
        return this.listaDeAnimalesAcuaticos;
    }


}

