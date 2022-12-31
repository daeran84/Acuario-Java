import cu.edu.reduc.inf.acuario.modelo.AnimalAcuatico;
import cu.edu.reduc.inf.acuario.modelo.EspecieAcuatica;
import cu.edu.reduc.inf.acuario.presentador.PresentadorPrincipal;

public class Main {
    public static void main(String[] args) {
        PresentadorPrincipal presentadorPrincipal = new PresentadorPrincipal();
        Thread principal = new Thread(presentadorPrincipal);

        principal.start();
    }
}