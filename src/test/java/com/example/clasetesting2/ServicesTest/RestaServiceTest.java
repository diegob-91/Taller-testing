package com.example.clasetesting2.ServicesTest;

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

        assert resultado == 6 :
            "La resta de 10 y 4 debería ser 6, pero fue " + resultado;
    }
}