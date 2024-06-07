package org.example.Entities;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConvertidorDeUnidadesTest {
    private final ConvertidorDeUnidades convertidor = new ConvertidorDeUnidades();

    @Test
    public void pruebaMetroAPulgada1() {
        assertEquals(39.3701, convertidor.metroAPulgada(1), 0.0001);
    }

    @Test
    public void pruebaMetroAPulgada2() {
        assertEquals(78.7402, convertidor.metroAPulgada(2), 0.0001);
    }

    @Test
    public void pruebaMetroAPulgada3() {
        assertEquals(118.1103, convertidor.metroAPulgada(3), 0.0001);
    }


}