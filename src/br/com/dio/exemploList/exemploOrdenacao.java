package br.com.dio.exemploList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exemploOrdenacao {
    /* Dados os seguintes informacoes sobre meus gatos, crie uma lista
    e ordene esta lista exibindo
    (nome - idade - cor);

    gato 1= nome: mingau, idade: 8, cor: siames
    gato 2 = nome: cre, idade: 2, cor: branco
    gato 3 = nome: mingau, idade 9, cor: preto
     */
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Mingau", 8, "siames"));
            add(new Gato("Cre", 2, "branco"));
            add(new Gato("Mingau", 18, "preto"));
        }};
        System.out.println("--\tOrdem de Insercao\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Aleatoria\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem natural (nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem idade\t---");
    //    Collections.sort(meusGatos, new Comparatoridade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
        //    Collections.sort(meusGatos, new Comparatoridade());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/cor/idade\t---");
        System.out.println("--\tOrdem cor\t---");
        //    Collections.sort(meusGatos, new Comparatoridade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}
    class ComparatorCor implements Comparator<Gato> {

        @Override
        public int compare(Gato o1, Gato o2) {
            return o1.getCor().compareToIgnoreCase(o2.getCor());
        }
    }
        class ComparatorNomeCorIdade implements Comparator<Gato> {

            @Override
            public int compare(Gato o1, Gato o2) {
                int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
                if (nome != 0) return nome;

                int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
                if (cor !=0) return cor;

                return Integer.compare(o1.getIdade(), o2.getIdade());
            }
        }

