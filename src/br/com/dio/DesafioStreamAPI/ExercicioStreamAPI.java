package br.com.dio.DesafioStreamAPI;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1","0","4","1","2","3","9","6","5");

//        System.out.println("Imprima todos os elementos dessa lista de string: ");
//
//        numerosAleatorios.forEach(System.out::println);
//
//        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um set:");
//
//        Set<String> collectSet = numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

//        System.out.println("Transforme esta lista de String em uma lsita de numeros inteiros.");
//       List<Integer> collectList =
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista:");
//
//        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
//        System.out.println(listParesMaioresQue2);

//        System.out.println("Mostre a media dos numeros: ");
//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(System.out::println);


        System.out.println("Remova os valores impares: ");

    numerosAleatoriosInteger.removeIf(integer -> integer % 2 !=0);
        System.out.println(numerosAleatoriosInteger);
    }

    }

