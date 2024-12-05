package com.daom.calculadora.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("NO ES POSIBLE DIVIDIR POR ZERO");
        }
        return a / b;
    }
}
