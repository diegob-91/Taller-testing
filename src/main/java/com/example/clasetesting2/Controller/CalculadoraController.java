package com.example.clasetesting2.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clasetesting2.DTO.NumerosDTO;
import com.example.clasetesting2.Services.DivisionService;
import com.example.clasetesting2.Services.MultiplicacionService;
import com.example.clasetesting2.Services.RestaService;
import com.example.clasetesting2.Services.SumaService;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {

    private final SumaService sumaService;
    private final RestaService restaService;
    private final MultiplicacionService multiplicacionService;
    private final DivisionService divisionService;

    public CalculadoraController(
        SumaService sumaService,
        RestaService restaService,
        MultiplicacionService multiplicacionService,
        DivisionService divisionService) {

    this.sumaService = sumaService;
    this.restaService = restaService;
    this.multiplicacionService = multiplicacionService;
    this.divisionService = divisionService;
}

    @PostMapping("/suma")
public int sumarPOST(@RequestBody NumerosDTO numerosDTO) {
    return sumaService.sumar(numerosDTO);
}

@PostMapping("/resta")
public int restarPOST(@RequestBody NumerosDTO numerosDTO) {
    return restaService.restar(numerosDTO);
}

@PostMapping("/multiplicacion")
public int multiplicarPOST(@RequestBody NumerosDTO numerosDTO) {
    return multiplicacionService.multiplicar(numerosDTO);
}

@PostMapping("/division")
public int dividirPOST(@RequestBody NumerosDTO numerosDTO) {
    return divisionService.dividir(numerosDTO);
}
}