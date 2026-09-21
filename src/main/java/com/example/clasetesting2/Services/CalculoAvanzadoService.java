package com.example.clasetesting2.Services;

import org.springframework.stereotype.Service;

import com.example.clasetesting2.DTO.CalculoAvanzadoDTO;
import com.example.clasetesting2.DTO.ResultadoCalculoDTO;

@Service
public class CalculoAvanzadoService {

    public ResultadoCalculoDTO calcular(CalculoAvanzadoDTO datos) {

        if (datos.getNumero2() == 0) {
            throw new IllegalArgumentException("El numero2 no puede ser cero");
        }

        if (datos.getPorcentaje() < 0 || datos.getPorcentaje() > 100) {
            throw new IllegalArgumentException(
                "El porcentaje debe estar entre 0 y 100"
            );
        }

        int suma = datos.getNumero1() + datos.getNumero2();
        int resta = datos.getNumero1() - datos.getNumero2();
        int multiplicacion = datos.getNumero1() * datos.getNumero2();
        int division = datos.getNumero1() / datos.getNumero2();

        int porcentajeCalculado =
            (datos.getNumero1() * datos.getPorcentaje()) / 100;

        String clasificacion;

        if (resta > 0) {
            clasificacion = "POSITIVO";
        } else if (resta < 0) {
            clasificacion = "NEGATIVO";
        } else {
            clasificacion = "CERO";
        }

        return new ResultadoCalculoDTO(
            suma,
            resta,
            multiplicacion,
            division,
            porcentajeCalculado,
            clasificacion
        );
    }
}