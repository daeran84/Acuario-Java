package cu.edu.reduc.inf.acuario.vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class VistaGestionEspecieAcuatica {
    SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

    public int gestionEspecieAcuarica(){
        int opc = 0;

        System.out.println("Gestion de Especie Acuatica");
        System.out.println("1- Insertar Especie Acuatica");
        System.out.println("2- Actualizar Especie Acuatica");
        System.out.println("3- Eliminar Especie Acuatica");
        System.out.println("4- Listar Especie Acuatica");
        System.out.println("5- Salir");

        opc = new Scanner(System.in).nextInt();

        return opc;
    }

    public int getTipoEspecie(){
        int opc = 0;
        System.out.println("Tipo de especie acuatica");
        System.out.println("1- Animal acuatico");
        System.out.println("2- Planta acuatica");

        opc = new Scanner(System.in).nextInt();

        return opc;

    }

    // Gestor de datos

    public int getId(){
        System.out.print("ID: ");
        return new Scanner(System.in).nextInt();
    }

    public String getNombreCientifico(){
        System.out.print("Nombre cientifico: ");
        return new Scanner(System.in).nextLine().trim();
    }

    public String getFamilia(){
        System.out.print("Familia: ");
        return new Scanner(System.in).nextLine().trim();
    }

    public String HabitatNatural(){
        System.out.print("Habitat natural: ");
        return new Scanner(System.in).nextLine().trim();
    }

    public String getNombre(){
        System.out.print("Nombre: ");
        return new Scanner(System.in).nextLine().trim();
    }

    public int getEdad(){
        System.out.print("Edad: ");
        return new Scanner(System.in).nextInt();
    }

    public String getCategoria(){
        System.out.print("Categoria: ");
        return new Scanner(System.in).nextLine().trim();
    }

    public boolean getReproducidoEnCautiverio(){
        System.out.print("Reproducido en cautiverio?(S/N): ");
        do {
            String in = new Scanner(System.in).nextLine().toLowerCase().trim();
            if (in.equals("s")) {
                return true;
            }
            if (in.equals("n")) {
                return false;
            }
            System.out.println("Debe responder s para 'Si' o n para 'No'");
        }while (true);

    }

    public boolean getParticipaEnEspectaculos(){
        System.out.print("Participa en espectaculos?(S/N): ");
        do {
            String in = new Scanner(System.in).nextLine().toLowerCase().trim();
            if (in.equals("s")) {
                return true;
            }
            if (in.equals("n")) {
                return false;
            }
            System.out.println("Debe responder s para 'Si' o n para 'No'");
        }while (true);

    }

    public Date getFechaDeInicio() throws ParseException {
        System.out.println("Fecha de inicio en los Espectaculos: ");
        return fecha.parse(new Scanner(System.in).nextLine().trim());
    }

    public String getNombreDelEntrenador(){
        System.out.println("Nombre y apellidos del entrenador");
        return new Scanner(System.in).nextLine().trim();
    }

    public int getNumeroDeEjemplares(){
        System.out.print("Cantidad de ejemplares: ");
        return new Scanner(System.in).nextInt();
    }

    public boolean getDeAguasProfundas(){
        System.out.print("Es de aguas profundas?(S/N): ");
        do {
            String in = new Scanner(System.in).nextLine().toLowerCase().trim();
            if (in.equals("s")) {
                return true;
            }
            if (in.equals("n")) {
                return false;
            }
            System.out.println("Debe responder s para 'Si' o n para 'No'");
        }while (true);
    }
}
