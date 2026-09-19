package com.example.clasetesting2.ServicesTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.clasetesting2.DTO.NumerosDTO;
import com.example.clasetesting2.Services.RestaService;

public class RestaServiceTest {

    @Test
    void restaTest() {

        NumerosDTO numerosDTO = new NumerosDTO();
        numerosDTO.setNumero1(10);
        numerosDTO.setNumero2(4);

        RestaService resta = new RestaService();

        int resultado = resta.restar(numerosDTO);

        assertEquals(6, resultado);
    }

    @Test
    void testRestaConResultadoNegativo() {

        NumerosDTO numerosDTO = new NumerosDTO();
        numerosDTO.setNumero1(5);
        numerosDTO.setNumero2(10);

        RestaService resta = new RestaService();

        int resultado = resta.restar(numerosDTO);

        assertEquals(-5, resultado);
    }
}