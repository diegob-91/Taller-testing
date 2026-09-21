package com.example.clasetesting2.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultadoCalculoDTO {

    private int suma;
    private int resta;
    private int multiplicacion;
    private int division;
    private int porcentajeCalculado;
    private String clasificacion;
}