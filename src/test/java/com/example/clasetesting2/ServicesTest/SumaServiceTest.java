package com.example.clasetesting2.ServicesTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.clasetesting2.DTO.NumerosDTO;
import com.example.clasetesting2.Services.SumaService;

public class SumaServiceTest {

    @Test
    void testSuma() {

        NumerosDTO numerosDTO = new NumerosDTO();
        numerosDTO.setNumero1(2);
        numerosDTO.setNumero2(3);

        SumaService sumaService = new SumaService();

        int resultado = sumaService.sumar(numerosDTO);

        assertEquals(5, resultado);
    }

    @Test
    void testSumaConCeros() {

        NumerosDTO numerosDTO = new NumerosDTO();
        numerosDTO.setNumero1(0);
        numerosDTO.setNumero2(0);

        SumaService sumaService = new SumaService();

        int resultado = sumaService.sumar(numerosDTO);

        assertEquals(0, resultado);
    }
}