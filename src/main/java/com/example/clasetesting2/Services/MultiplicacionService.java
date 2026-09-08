package com.example.clasetesting2.Services;

import org.springframework.stereotype.Service;

import com.example.clasetesting2.DTO.NumerosDTO;

@Service
public class MultiplicacionService {

    public int multiplicar(NumerosDTO numerosDto) {

        return numerosDto.getNumero1() * numerosDto.getNumero2();
    }
}