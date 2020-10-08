package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero de tiradas");
        int tiradas = scanner.nextInt();
        int[] frecuencia = new int[8];

        Random aleatorio = new Random();

        for (int d = 0; d < tiradas; d++) {
            int dado1 = aleatorio.nextInt(6);
            dado1 += 1;
            int dado2 = aleatorio.nextInt(6);
            dado2 += 1;
            ++frecuencia[dado1 + dado2 - 2];
        }
        for (int d = 1; d < 7; d++) {
            System.out.println(d+1 + " ha salido "+ frecuencia[d]+ " veces");
        }
    }
}