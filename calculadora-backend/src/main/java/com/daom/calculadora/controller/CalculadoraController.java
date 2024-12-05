package com.daom.calculadora.controller;

import com.daom.calculadora.models.CalculadoraDatos;
import com.daom.calculadora.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calcular")
@CrossOrigin(origins = "*")
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    @Autowired
    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/sumar")
    public int add(@RequestBody CalculadoraDatos request) {
        return calculadoraService.sumar(request.getA(), request.getB());
    }

    @PostMapping("/restar")
    public int subtract(@RequestBody CalculadoraDatos request) {
        return calculadoraService.restar(request.getA(), request.getB());
    }

    @PostMapping("/multiplicar")
    public int multiply(@RequestBody CalculadoraDatos request) {
        return calculadoraService.multiplicar(request.getA(), request.getB());
    }

    @PostMapping("/dividir")
    public int divide(@RequestBody CalculadoraDatos request) {
        return calculadoraService.dividir(request.getA(), request.getB());
    }
}
