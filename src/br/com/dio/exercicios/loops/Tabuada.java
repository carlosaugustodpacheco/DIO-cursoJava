package br.com.dio.exercicios.loops;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada e qualquer numero inteiro entre 1 a 10.
O usuario deve informar de qual numero ele deseja ver a tabuada.
A saida deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();
        System.out.println("Tabuada de " + tabuada);

        for (int i=1 ; i <= 10 ; i++ ) {
            System.out.println( tabuada + " x " + i + " = " + (tabuada * i));

        }
    }
}
