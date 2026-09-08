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
@RequestMapping("/api/persona")
public class SaludoController {

    private final SumaService sumaService;
    private final RestaService restaService;
    private final MultiplicacionService multiplicacionService;
    private final DivisionService divisionService;

    public SaludoController(
        SumaService sumaService,
        RestaService restaService,
        MultiplicacionService multiplicacionService,
        DivisionService divisionService) {

    this.sumaService = sumaService;
    this.restaService = restaService;
    this.multiplicacionService = multiplicacionService;
    this.divisionService = divisionService;
}

    @PostMapping("/enviar")
    public int saludarPOST(@RequestBody NumerosDTO numerosDTO) {

        int resultado = sumaService.sumar(numerosDTO);

        return resultado;
    }

    @PostMapping("/resta")
public int restarPOST(@RequestBody NumerosDTO numerosDTO) {

    int resultado = restaService.restar(numerosDTO);

    return resultado;
}
    @PostMapping("/multiplicacion")
public int multiplicarPOST(@RequestBody NumerosDTO numerosDTO) {

    int resultado = multiplicacionService.multiplicar(numerosDTO);

    return resultado;
}
    @PostMapping("/division")
public int dividirPOST(@RequestBody NumerosDTO numerosDTO) {

    int resultado = divisionService.dividir(numerosDTO);

    return resultado;
}

}