package cu.edu.reduc.inf.acuario.test;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {

        int getEdad = 4;
        DecimalFormat d = new DecimalFormat("0.00");
        float aceptacion = 0.9F;
        System.out.println(aceptacion);
        aceptacion += 0.1F;
        System.out.println(aceptacion);
        aceptacion += 0.54684268F;
        System.out.println(aceptacion);
        aceptacion += getEdad / 100F;
        System.out.println(d.format(aceptacion));

    }
}
