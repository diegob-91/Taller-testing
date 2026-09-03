package com.example.clasetesting2.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clasetesting2.DTO.NumerosDTO;
import com.example.clasetesting2.Services.SumaService;

@RestController
@RequestMapping("/api/persona")
public class SaludoController {

    @PostMapping("/enviar")
    public int saludarPOST(@RequestBody NumerosDTO numerosDTO) {

        SumaService suma = new SumaService();

        int resultado = suma.sumar(numerosDTO);

        return resultado;
    }
}