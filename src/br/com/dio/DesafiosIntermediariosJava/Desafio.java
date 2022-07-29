package br.com.dio.DesafiosIntermediariosJava;
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.io.IOException;
import java.util.Scanner;

public class  Desafio {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int n = leitor.nextInt();

//TODO: Complete os espaços em branco com uma possível solução para o desafio

        while (n >= 1){
            if (n >= 0) {
                soma+= n ;
                cont++;
            }
            n = leitor.nextInt();
        }
        double media = (double) soma/cont         ;
        System.out.println(String.format("%.2f", media     ));
    }
}