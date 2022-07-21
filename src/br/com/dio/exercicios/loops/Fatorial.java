package br.com.dio.exercicios.loops;
/*
Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario
Ex.: 5! = 120 ( 5*4*3*2*1)
 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;
        for (int i = fatorial ;i >= 1; i-- ) {
            multiplicacao = i * multiplicacao;
        }

        System.out.println(" O fatorial de " + fatorial + "! é " + multiplicacao);
    }
 }
