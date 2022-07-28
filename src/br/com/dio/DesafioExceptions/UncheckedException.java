package br.com.dio.DesafioExceptions;

import javax.swing.*;

//Fazer a divisao de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida, informe um numero inteiro! " + e.getMessage());
                e.printStackTrace();
            } catch(ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossivel dividir numero por 0. " + e.getMessage());

            }
            finally {
                System.out.println("chegou no finally!");
            }
        } while(continueLooping);


        System.out.println("O codigo continua...");
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}

