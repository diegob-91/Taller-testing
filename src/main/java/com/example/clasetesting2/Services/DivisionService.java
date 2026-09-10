package com.example.clasetesting2.Services;

import org.springframework.stereotype.Service;

import com.example.clasetesting2.DTO.NumerosDTO;

@Service
public class DivisionService {

    public int dividir(NumerosDTO numerosDto) {

        if (numerosDto.getNumero2() == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }

        return numerosDto.getNumero1() / numerosDto.getNumero2();
    }
}