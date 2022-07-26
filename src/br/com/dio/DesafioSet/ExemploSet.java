package br.com.dio.DesafioSet;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {


        System.out.println("Crie um conjunto e adicione as notas: ");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //System.out.println("Adicione na lista a nota 8.0 na posicao 4 ");
        //System.out.println("Substitua a nota 5.0 pela nota 6.0:  ");

        System.out.println("Confira se a nota 5.0 esta no conjunto: " + notas.contains(5d));
        //System.out.println("Exiba a terceira nota adicionada ");

        System.out.println("Exiba a menor nota " + Collections.min(notas));
        System.out.println("Exiba a maior nota " + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
            System.out.println("Exiba a soma dos valores " + soma);

            System.out.println("Exiba a media dos valores " + soma/ notas.size());

            System.out.println("Remova a nota 0:");
            notas.remove(0d);
            System.out.println(notas);

            //System.out.println("Remova a nota da posicao 0");

            System.out.println("Remova as notas menores que 7 e exiba a lista: ");
            Iterator<Double> iterator1 = notas.iterator();
            while(iterator1.hasNext()) {
                Double next1 = iterator1.next();
                if (next1 < 7) iterator1.remove();
            }
                System.out.println(notas);

            Set<Double> notas2 = new LinkedHashSet<>();
            notas2.add(7d);
            notas2.add(8.5);
            notas2.add(9.3);
            notas2.add(5d);
            notas2.add(7d);
            notas2.add(0d);
            notas2.add(3.6);
            System.out.println(notas2);

            System.out.println("Exiba todas as notas na ordem crescente: ");
            Set<Double> notas3 = new TreeSet<>(notas2);
            System.out.println(notas3);

            System.out.println("Apague todo o conjunto");
            notas.clear();

            System.out.println("Confgira se o conjunto esta vazio" + notas2.isEmpty());
        }

    }
