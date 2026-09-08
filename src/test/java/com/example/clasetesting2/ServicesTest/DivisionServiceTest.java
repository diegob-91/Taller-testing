package com.example.clasetesting2.ServicesTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.clasetesting2.DTO.NumerosDTO;
import com.example.clasetesting2.Services.DivisionService;

public class DivisionServiceTest {

    @Test
    void testDividir() {

        NumerosDTO numerosDto = new NumerosDTO();
        numerosDto.setNumero1(10);
        numerosDto.setNumero2(5);

        DivisionService divisionService = new DivisionService();

        int resultado = divisionService.dividir(numerosDto);

        assertEquals(2, resultado);
    }
}