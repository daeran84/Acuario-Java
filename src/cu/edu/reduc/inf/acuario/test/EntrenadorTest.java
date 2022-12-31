package cu.edu.reduc.inf.acuario.test;

import cu.edu.reduc.inf.acuario.modelo.Entrenador;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EntrenadorTest {
    SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

    Entrenador entrenador1 = new Entrenador("98102632132", "Elizabeth Perez Usbert",
            "Eli",26, "F", fecha.parse("16/6/1998"), 5);
    Entrenador entrenador2 = new Entrenador("00041226321", "Pedro Hernandez Gonzalez",
            "Pepe", 24, "M", fecha.parse("12/4/2000"), 1);
    Entrenador entrenador3 = new Entrenador("83021965987", "Juan García Hernández",
            "García", 38, "M", fecha.parse("19/2/1983"), 10);
    Entrenador entrenador4 = new Entrenador("00032654214", "Maria Benitez Marín",
            "Marín", 24, "F", fecha.parse("26/3/2000"), 1);

    EntrenadorTest() throws ParseException {
    }

    @Test
    void inicializacionDeClase() {
        assertNotNull(entrenador1);
        assertNotNull(entrenador2);
        assertNotNull(entrenador3);
        assertNotNull(entrenador4);
    }

    @Test
    void esCiDeEntrenador() {
        assertTrue(entrenador1.esCiDeEntrenador("98102632132"));
        assertTrue(entrenador2.esCiDeEntrenador("00041226321"));
        assertTrue(entrenador3.esCiDeEntrenador("83021965987"));
        assertTrue(entrenador4.esCiDeEntrenador("00032654214"));
    }

    @Test
    void esNombreDeEntrenador() {
        assertEquals(entrenador1.getNombreApellidos(), "Elizabeth Perez Usbert");
        assertEquals(entrenador2.getNombreApellidos(), "Pedro Hernandez Gonzalez");
        assertEquals(entrenador3.getNombreApellidos(), "Juan García Hernández");
        assertEquals(entrenador4.getNombreApellidos(), "Maria Benitez Marín");
    }

    @Test
    void getCi() {
        assertEquals(entrenador1.getCi(), "98102632132");
        assertEquals(entrenador2.getCi(), "00041226321");
        assertEquals(entrenador3.getCi(), "83021965987");
        assertEquals(entrenador4.getCi(), "00032654214");
    }

    @Test
    void setCi() {
        entrenador1.setCi("98102645687");
        assertEquals(entrenador1.getCi(), "98102645687");
        entrenador2.setCi("00041226513");
        assertEquals(entrenador2.getCi(), "00041226513");
        entrenador3.setCi("83021987946");
        assertEquals(entrenador3.getCi(), "83021987946");
        entrenador4.setCi("00032615467");
        assertEquals(entrenador4.getCi(), "00032615467");
    }

    @Test
    void getNombreApellidos() {
        assertEquals(entrenador1.getNombreApellidos(), "Elizabeth Perez Usbert");
        assertEquals(entrenador2.getNombreApellidos(), "Pedro Hernandez Gonzalez");
        assertEquals(entrenador3.getNombreApellidos(), "Juan García Hernández");
        assertEquals(entrenador4.getNombreApellidos(), "Maria Benitez Marín");
    }

    @Test
    void setNombreApellidos() {
        entrenador1.setNombreApellidos("Pepe Cojo");
        assertEquals(entrenador1.getNombreApellidos(), "Pepe Cojo");
        entrenador2.setNombreApellidos("Chucho Valdes");
        assertEquals(entrenador2.getNombreApellidos(), "Chucho Valdes");
        entrenador3.setNombreApellidos("Maria Juana");
        assertEquals(entrenador3.getNombreApellidos(), "Maria Juana");
        entrenador4.setNombreApellidos("La Cubanita");
        assertEquals(entrenador4.getNombreApellidos(), "La Cubanita");
    }

    @Test
    void getNombreArtistico() {
        assertEquals(entrenador1.getNombreArtistico(), "Eli");
        assertEquals(entrenador2.getNombreArtistico(), "Pepe");
        assertEquals(entrenador3.getNombreArtistico(), "García");
        assertEquals(entrenador4.getNombreArtistico(), "Marín");
    }

    @Test
    void setNombreArtistico() {
        entrenador1.setNombreArtistico("Elle");
        assertEquals(entrenador1.getNombreArtistico(), "Elle");
        entrenador2.setNombreArtistico("Pepin");
        assertEquals(entrenador2.getNombreArtistico(), "Pepin");
        entrenador3.setNombreArtistico("Garry");
        assertEquals(entrenador3.getNombreArtistico(), "Garry");
        entrenador4.setNombreArtistico("Marie");
        assertEquals(entrenador4.getNombreArtistico(), "Marie");
    }

    @Test
    void getEdad() {
        assertEquals(entrenador1.getEdad(), 26);
        assertEquals(entrenador2.getEdad(), 24);
        assertEquals(entrenador3.getEdad(), 38);
        assertEquals(entrenador4.getEdad(), 24);
    }

    @Test
    void setEdad() {
        entrenador1.setEdad(25);
        assertEquals(entrenador1.getEdad(), 25);
        entrenador2.setEdad(20);
        assertEquals(entrenador2.getEdad(), 20);
        entrenador3.setEdad(30);
        assertEquals(entrenador3.getEdad(), 30);
        entrenador4.setEdad(28);
        assertEquals(entrenador4.getEdad(), 28);
    }

    @Test
    void getSexo() {
        assertEquals(entrenador1.getSexo(), "F");
        assertEquals(entrenador2.getSexo(), "M");
        assertEquals(entrenador3.getSexo(), "M");
        assertEquals(entrenador4.getSexo(), "F");
    }

    @Test
    void getFechaDeNacimiento() throws ParseException {
        assertEquals(entrenador1.getFechaDeNacimiento(), fecha.parse("16/6/1998"));
        assertEquals(entrenador2.getFechaDeNacimiento(), fecha.parse("12/4/2000"));
        assertEquals(entrenador3.getFechaDeNacimiento(), fecha.parse("19/2/1983"));
        assertEquals(entrenador4.getFechaDeNacimiento(), fecha.parse("26/3/2000"));
    }

    @Test
    void getAniosDeExperiencia() {
        assertEquals(entrenador1.getAniosDeExperiencia(), 5);
        assertEquals(entrenador2.getAniosDeExperiencia(), 1);
        assertEquals(entrenador3.getAniosDeExperiencia(), 10);
        assertEquals(entrenador4.getAniosDeExperiencia(), 1);
    }

    @Test
    void setAniosDeExperiencia() {
        entrenador1.setAniosDeExperiencia(4);
        assertEquals(entrenador1.getAniosDeExperiencia(), 4);
        entrenador2.setAniosDeExperiencia(2);
        assertEquals(entrenador2.getAniosDeExperiencia(), 2);
        entrenador3.setAniosDeExperiencia(8);
        assertEquals(entrenador3.getAniosDeExperiencia(), 8);
        entrenador4.setAniosDeExperiencia(2);
        assertEquals(entrenador4.getAniosDeExperiencia(), 2);
    }
}