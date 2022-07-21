package br.com.dio.exercicios.loops;

/*
Faca um programa que peca N numeros inteiros,
calcule e mostre a quantidade numeros pares
e a quantidade de numeros impares.
 */

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;
            //count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade par:" + quantPares);
        System.out.println("Quantidade impar:" + quantImpares);

    }
}
