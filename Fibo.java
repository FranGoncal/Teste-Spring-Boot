package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Fibo {

    // Método que retorna os primeiros N números da sequência de Fibonacci
    public List<Long> getFibonacci(int n) {
        List<Long> fibonacciNumbers = new ArrayList<>();
        long a = 0, b = 1;

        // Lida com os casos de N <= 0
        if (n <= 0) {
            return fibonacciNumbers; // Retorna lista vazia
        }

        // Adiciona o primeiro número (0)
        fibonacciNumbers.add(a);

        // Adiciona os próximos N-1 números
        for (int i = 1; i < n; i++) {
            fibonacciNumbers.add(b);
            long temp = b;
            b = a + b;
            a = temp;
        }
        return fibonacciNumbers;
    }
}