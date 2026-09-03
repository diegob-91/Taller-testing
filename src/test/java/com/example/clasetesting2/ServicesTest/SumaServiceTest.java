package com.example.clasetesting2.ServicesTest;

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

        assert resultado == 5 :
            "La suma de 2 y 3 debería ser 5, pero fue " + resultado;
    }
}