import cu.edu.reduc.inf.acuario.presentador.Principal;

public class Main {
    public static void main(String[] args) {
        Principal presentadorPrincipal = new Principal();
        //Thread principal = new Thread(presentadorPrincipal);
        presentadorPrincipal.run();

        //principal.start();
    }
}