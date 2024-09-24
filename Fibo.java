package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Fibo {
    // Método que imprime os primeiros N números da sequência de Fibonacci
    public void printFibonacci(int n) {
        long a = 0, b = 1;
        System.out.println("Fibonacci Sequence:");

        // Lida com os casos de N <= 0
        if (n <= 0) {
            System.out.println("N deve ser maior que 0");
            return;
        }

        // Imprime o primeiro número (0)
        System.out.print(a);

        // Itera e imprime os próximos N-1 números
        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            long temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println();
    }
}
