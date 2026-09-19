package com.example.clasetesting2.ServicesTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.clasetesting2.DTO.NumerosDTO;
import com.example.clasetesting2.Services.MultiplicacionService;

public class MultiplicacionServiceTest {

    @Test
    void testMultiplicar() {

        NumerosDTO numerosDto = new NumerosDTO();
        numerosDto.setNumero1(10);
        numerosDto.setNumero2(5);

        MultiplicacionService multiplicacionService = new MultiplicacionService();

        int resultado = multiplicacionService.multiplicar(numerosDto);

        assertEquals(50, resultado);
    }

    @Test
    void testMultiplicarPorCero() {

        NumerosDTO numerosDto = new NumerosDTO();
        numerosDto.setNumero1(10);
        numerosDto.setNumero2(0);

        MultiplicacionService multiplicacionService = new MultiplicacionService();

        int resultado = multiplicacionService.multiplicar(numerosDto);

        assertEquals(0, resultado);
    }
}