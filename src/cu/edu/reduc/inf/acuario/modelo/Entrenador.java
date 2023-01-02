package cu.edu.reduc.inf.acuario.modelo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Entrenador {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private String ci;
    private String nombreApellidos;
    private String nombreArtistico;
    private int edad;
    private String sexo;
    private Date fechaDeNacimiento;
    private int aniosDeExperiencia;

    public Entrenador(String ci, String nombreApellidos, String nombreArtistico, int edad, String sexo,
                      Date fechaDeNacimiento, int aniosDeExperiencia) {
        this.ci = ci;
        this.nombreApellidos = nombreApellidos;
        this.nombreArtistico = nombreArtistico;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.aniosDeExperiencia = aniosDeExperiencia;
    }
    public boolean esCiDeEntrenador(String ci) {return this.getCi().equals(ci);}

    public boolean esNombreDeEntrenador(String nombre) {return this.getNombreApellidos().equals(nombre);}

    public String toString(){
        return "Entrenador - " + "CI: " + getCi() + ", Nombre: " + getNombreApellidos() + ", Nombre artístico: "
                + this.getNombreArtistico() + ", Edad: " + this.getEdad() + ", Sexo: " + this.getSexo()
                + ", Fecha de nacimiento: " + dateFormat.format(this.getFechaDeNacimiento()) + ", Años de experiencia: "
                + this.getAniosDeExperiencia();
    }

    // Set & Get
    public String getCi() {
        return ci;
    }

    public void setCi(String value) {
        this.ci = value;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String value) {
        this.nombreApellidos = value;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String value) {
        this.nombreArtistico = value;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int value) {
        this.edad = value;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String value) {
        this.sexo = value;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date value) {
        this.fechaDeNacimiento = value;
    }

    public int getAniosDeExperiencia() {
        return aniosDeExperiencia;
    }

    public void setAniosDeExperiencia(int value) {
        this.aniosDeExperiencia = value;
    }

}
