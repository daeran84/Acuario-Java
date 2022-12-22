package cu.edu.reduc.inf.acuario.test;

import cu.edu.reduc.inf.acuario.modelo.AnimalAcuatico;
import cu.edu.reduc.inf.acuario.modelo.EspecieAcuatica;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class AnimalAcuaticoTest {
    // SimpleDateFormat.getDateInstance().parse("28-may-2006")
    EspecieAcuatica animal1 = new AnimalAcuatico(1, "Delphinidae", "delfines",
            "mar", "Millie", 3, "Mamíferos", true,
            false, null, null);
    EspecieAcuatica animal2 = new AnimalAcuatico(2, "Otaria flavescens", "lobos marinos",
            "mar", "Bart", 3, "Mamíferos", true,
            true, SimpleDateFormat.getDateInstance().parse("28-may-2006"),
            "Pedro Hernandez Gonzalez");
    EspecieAcuatica animal3 = new AnimalAcuatico(7, "Spheniscidae", "otros",
            "mar", "Lili", 1, "aves", true, false,
            null, null);
    EspecieAcuatica animal4 = new AnimalAcuatico(8, "Spheniscidae", "otros",
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
        assertEquals("Millie", ((AnimalAcuatico) animal1).getNombre());
        assertEquals("Bart", ((AnimalAcuatico)animal2).getNombre());
        assertEquals("Lili", ((AnimalAcuatico)animal3).getNombre());
        assertEquals("Bily", ((AnimalAcuatico)animal4).getNombre());
    }

    @Test
    void propertyEdad(){
        assertEquals(3, ((AnimalAcuatico) animal1).getEdad());
        assertEquals(3, ((AnimalAcuatico) animal2).getEdad());
        assertEquals(1, ((AnimalAcuatico) animal3).getEdad());
        assertEquals(2, ((AnimalAcuatico) animal4).getEdad());
    }

    @Test
    void propertyCategoria(){
        assertEquals("Mamíferos", ((AnimalAcuatico) animal1).getCategoria());
        assertEquals("Mamíferos", ((AnimalAcuatico)animal2).getCategoria());
        assertEquals("aves", ((AnimalAcuatico) animal3).getCategoria());
        assertEquals("aves", ((AnimalAcuatico) animal4).getCategoria());
    }

    @Test
    void propertyReproducidoEnCautiverio(){
        assertTrue(((AnimalAcuatico) animal1).getReproducidoEnCautiverio());
        assertTrue(((AnimalAcuatico) animal2).getReproducidoEnCautiverio());
        assertTrue(((AnimalAcuatico) animal3).getReproducidoEnCautiverio());
        assertTrue(((AnimalAcuatico) animal4).getReproducidoEnCautiverio());
    }

    @Test
    void propertyParticipaEnEspectaculo(){
        assertFalse(((AnimalAcuatico) animal1).getParticipaEnEspectaculo());
        assertTrue(((AnimalAcuatico) animal2).getParticipaEnEspectaculo());
        assertFalse(((AnimalAcuatico) animal3).getParticipaEnEspectaculo());
        assertFalse(((AnimalAcuatico) animal4).getParticipaEnEspectaculo());
    }

    @Test
    void propertyFechaInicioEspectaculo() throws ParseException {
        assertNull(((AnimalAcuatico) animal1).getFechaDeInicioEspectaculo());
        assertEquals(SimpleDateFormat.getDateInstance().parse("28-may-2006"),
                ((AnimalAcuatico) animal2).getFechaDeInicioEspectaculo());
        assertNull(((AnimalAcuatico) animal3).getFechaDeInicioEspectaculo());
        assertNull(((AnimalAcuatico) animal4).getFechaDeInicioEspectaculo());
    }

    @Test
    void propertyNombreDelEntrenador(){
        assertNull(((AnimalAcuatico) animal1).getNombreDelEntrenador());
        assertEquals("Pedro Hernandez Gonzalez", ((AnimalAcuatico) animal2).getNombreDelEntrenador());
        assertNull(((AnimalAcuatico) animal3).getNombreDelEntrenador());
        assertNull(((AnimalAcuatico) animal4).getNombreDelEntrenador());
    }

    @Test
    void indiceDeAceptacion(){
        assertEquals(1.03, ((AnimalAcuatico) animal1).indiceDeAceptacion());
        assertEquals(1.53, ((AnimalAcuatico) animal2).indiceDeAceptacion());
        assertEquals(1.01, ((AnimalAcuatico) animal3).indiceDeAceptacion());
        assertEquals(1.02, ((AnimalAcuatico) animal4).indiceDeAceptacion());
    }

}