package cu.edu.reduc.inf.acuario.modelo;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class AnimalAcuaticoTest {
    // SimpleDateFormat.getDateInstance().parse("28-may-2006")
    AnimalAcuatico animal1 = new AnimalAcuatico(1, "Delphinidae", "delfines",
            "mar", "Millie", 3, "Mamíferos", true,
            false, null, null);
    AnimalAcuatico animal2 = new AnimalAcuatico(2, "Otaria flavescens", "lobos marinos",
            "mar", "Bart", 3, "Mamíferos", true,
            true, SimpleDateFormat.getDateInstance().parse("28-may-2006"),
            "Pedro Hernandez Gonzalez");
    AnimalAcuatico animal3 = new AnimalAcuatico(7, "Spheniscidae", "otros",
            "mar", "Lili", 1, "aves", true, false,
            null, null);
    AnimalAcuatico animal4 = new AnimalAcuatico(8, "Spheniscidae", "otros",
            "mar", "Bily", 2, "aves", true, false,
            null, null);


    AnimalAcuaticoTest() throws ParseException {
    }

    @Test
    void inicializacionDeClase() {
        assertNotNull(animal1);
        assertNotNull(animal2);
        assertNotNull(animal3);
        assertNotNull(animal4);
    }

    @Test
    void propertyNombreCientifico(){
        assertEquals("Delphinidae", animal1.getNombreCientifico());
        assertEquals("Otaria flavescens", animal2.getNombreCientifico());
        assertEquals("Spheniscidae", animal3.getNombreCientifico());
        assertEquals("Spheniscidae", animal4.getNombreCientifico());
    }

    @Test
    void propertyFamilia(){
        assertEquals("delfines", animal1.getFamilia());
        assertEquals("lobos marinos", animal2.getFamilia());
        assertEquals("otros", animal3.getFamilia());
        assertEquals("otros", animal4.getFamilia());
    }

    @Test
    void propertyHabitatNatural(){
        assertEquals("mar", animal1.getHabitatNatural());
        assertEquals("mar", animal2.getHabitatNatural());
        assertEquals("mar", animal3.getHabitatNatural());
        assertEquals("mar", animal4.getHabitatNatural());
    }

    @Test
    void propertyNombre(){
        assertEquals("Millie", animal1.getNombre());
        assertEquals("Bart", animal2.getNombre());
        assertEquals("Lili", animal3.getNombre());
        assertEquals("Bily", animal4.getNombre());
    }

    @Test
    void propertyEdad(){
        assertEquals(3, animal1.getEdad());
        assertEquals(3, animal2.getEdad());
        assertEquals(1, animal3.getEdad());
        assertEquals(2, animal4.getEdad());
    }

    @Test
    void propertyCategoria(){
        assertEquals("Mamíferos", animal1.getCategoria());
        assertEquals("Mamíferos", animal2.getCategoria());
        assertEquals("aves", animal3.getCategoria());
        assertEquals("aves", animal4.getCategoria());
    }

    @Test
    void propertyReproducidoEnCautiverio(){
        assertTrue(animal1.getReproducidoEnCautiverio());
        assertTrue(animal2.getReproducidoEnCautiverio());
        assertTrue(animal3.getReproducidoEnCautiverio());
        assertTrue(animal4.getReproducidoEnCautiverio());
    }

    @Test
    void propertyParticipaEnEspectaculo(){
        assertFalse(animal1.getParticipaEnEspectaculo());
        assertTrue(animal2.getParticipaEnEspectaculo());
        assertFalse(animal3.getParticipaEnEspectaculo());
        assertFalse(animal4.getParticipaEnEspectaculo());
    }

    @Test
    void propertyFechaInicioEspectaculo() throws ParseException {
        assertNull(animal1.getFechaDeInicioEspectaculo());
        assertEquals(SimpleDateFormat.getDateInstance().parse("28-may-2006"), animal2.getFechaDeInicioEspectaculo());
        assertNull(animal3.getFechaDeInicioEspectaculo());
        assertNull(animal4.getFechaDeInicioEspectaculo());
    }

    @Test
    void propertyNombreDelEntrenador(){
        assertNull(animal1.getNombreDelEntrenador());
        assertEquals("Pedro Hernandez Gonzalez", animal2.getNombreDelEntrenador());
        assertNull(animal3.getNombreDelEntrenador());
        assertNull(animal4.getNombreDelEntrenador());
    }

}