package org.example.Entities;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConvertidorDeUnidadesTest {
    private final ConvertidorDeUnidades convertidor = new ConvertidorDeUnidades();

    @Test
    public void pruebaMetroAPulgada() {
        assertEquals(118.1103, convertidor.metroAPulgada(3), 0.0001);
    }

    @Test
    public void pruebaPulgadaAMetro() {
        assertEquals(0.0254, convertidor.pulgadaAMetro(1), 0.0001);
    }

    @Test
    public void pruebaMetroAMilla() {
        assertEquals(0.000621371, convertidor.metroAMilla(1), 0.000000001);
    }

}