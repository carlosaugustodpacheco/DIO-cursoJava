package br.com.dio.DesafioExceptions;

import javax.swing.*;
import java.io.*;

// Imprimir um arquivo no console.
public class CheckedExceptions {
    public static void main(String[] args)  {
        String nomeDoArquivo = "escalacao-do-palmeiras.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch(FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que voce deseja imprimir." + e.getCause());
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro inesperado, contate o suporte." + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("Chegou no finally.");
        }

        System.out.println("Apesar da exception ou nao, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }

}
