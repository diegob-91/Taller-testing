package com.example.clasetesting2.ServicesTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.example.clasetesting2.DTO.CalculoAvanzadoDTO;
import com.example.clasetesting2.DTO.ResultadoCalculoDTO;
import com.example.clasetesting2.Services.CalculoAvanzadoService;

public class CalculoAvanzadoServiceTest {

    private final CalculoAvanzadoService service =
        new CalculoAvanzadoService();

    @Test
    void testCalculoAvanzadoCorrecto() {

        CalculoAvanzadoDTO datos = new CalculoAvanzadoDTO();
        datos.setNumero1(100);
        datos.setNumero2(20);
        datos.setPorcentaje(10);

        ResultadoCalculoDTO resultado = service.calcular(datos);

        assertEquals(120, resultado.getSuma());
        assertEquals(80, resultado.getResta());
        assertEquals(2000, resultado.getMultiplicacion());
        assertEquals(5, resultado.getDivision());
        assertEquals(10, resultado.getPorcentajeCalculado());
        assertEquals("POSITIVO", resultado.getClasificacion());
    }

    @Test
    void testClasificacionNegativa() {

        CalculoAvanzadoDTO datos = new CalculoAvanzadoDTO();
        datos.setNumero1(20);
        datos.setNumero2(100);
        datos.setPorcentaje(50);

        ResultadoCalculoDTO resultado = service.calcular(datos);

        assertEquals(-80, resultado.getResta());
        assertEquals("NEGATIVO", resultado.getClasificacion());
    }

    @Test
    void testClasificacionCero() {

        CalculoAvanzadoDTO datos = new CalculoAvanzadoDTO();
        datos.setNumero1(50);
        datos.setNumero2(50);
        datos.setPorcentaje(100);

        ResultadoCalculoDTO resultado = service.calcular(datos);

        assertEquals(0, resultado.getResta());
        assertEquals(50, resultado.getPorcentajeCalculado());
        assertEquals("CERO", resultado.getClasificacion());
    }

    @Test
    void testPorcentajeLimiteCero() {

        CalculoAvanzadoDTO datos = new CalculoAvanzadoDTO();
        datos.setNumero1(100);
        datos.setNumero2(10);
        datos.setPorcentaje(0);

        ResultadoCalculoDTO resultado = service.calcular(datos);

        assertEquals(0, resultado.getPorcentajeCalculado());
    }

    @Test
    void testPorcentajeMayorACien() {

        CalculoAvanzadoDTO datos = new CalculoAvanzadoDTO();
        datos.setNumero1(100);
        datos.setNumero2(20);
        datos.setPorcentaje(101);

        assertThrows(
            IllegalArgumentException.class,
            () -> service.calcular(datos)
        );
    }

    @Test
    void testPorcentajeNegativo() {

        CalculoAvanzadoDTO datos = new CalculoAvanzadoDTO();
        datos.setNumero1(100);
        datos.setNumero2(20);
        datos.setPorcentaje(-1);

        assertThrows(
            IllegalArgumentException.class,
            () -> service.calcular(datos)
        );
    }

    @Test
    void testDivisionPorCero() {

        CalculoAvanzadoDTO datos = new CalculoAvanzadoDTO();
        datos.setNumero1(100);
        datos.setNumero2(0);
        datos.setPorcentaje(10);

        assertThrows(
            IllegalArgumentException.class,
            () -> service.calcular(datos)
        );
    }

    @Test
    void testNumerosGrandes() {

        CalculoAvanzadoDTO datos = new CalculoAvanzadoDTO();
        datos.setNumero1(10000);
        datos.setNumero2(100);
        datos.setPorcentaje(100);

        ResultadoCalculoDTO resultado = service.calcular(datos);

        assertEquals(10100, resultado.getSuma());
        assertEquals(9900, resultado.getResta());
        assertEquals(1000000, resultado.getMultiplicacion());
        assertEquals(100, resultado.getDivision());
        assertEquals(10000, resultado.getPorcentajeCalculado());
        assertEquals("POSITIVO", resultado.getClasificacion());
    }
}