package br.com.dio.DesafioSet;

import java.util.*;

/* Dadas as seguintes informacoes sobre minhas series favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episodio);

Serie 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Serie 2 = Nome: dark, genero: drama, tempoEpisodio: 60
Serie 1 = Nome: that '70s show, genero: comedia, tempoEpisodio: 25

 */
public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatoria\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70s show", "comedia", 25));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem insercao\t--");
         Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
             add(new Serie("got", "fantasia", 60));
             add(new Serie("dark", "drama", 60));
             add(new Serie("that 70s show", "comedia", 25));
         }};
          for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
              + serie.getGenero() + " - " + serie.getTempoEpisodio());

          System.out.println("--\tOrdem Natural (Tempo Episodio)\t--");
          Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisodio());


                 System.out.println("--\tOrdem Nome/Genero/Tempo Episodio)\t--");
                 Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
                 minhasSeries3.addAll(minhasSeries);
               for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                   + serie.getGenero() + " - " + serie.getTempoEpisodio());











    }
}


class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());

        if (tempoEpisodio != 0) return tempoEpisodio;

        return  this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
         if (nome !=0) return nome;

       int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero !=0) return genero;
        
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
