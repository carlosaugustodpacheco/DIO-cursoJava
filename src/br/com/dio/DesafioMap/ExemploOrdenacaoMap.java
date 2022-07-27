package br.com.dio.DesafioMap;

import java.util.*;

/*
Dadas as seguintes informacoes sobre meus livros favoritos e seus atores,
crie um dicionario e ordene este dicionario:
exibindo (Nome Autor - Nome Livro);

Autor: Hawking, Stephen - Livro = nome: Uma breve historia do Tempo, paginas: 256
Autor: Duhigg, Charles - Livro = nome: O poder do habito, paginas: 408
Autor: Harari, Yuval Noah - Livro = nome: 21 Licoes para o seculo 21, paginas: 432

 */
public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatoria\t --");

        Map<String, Livro> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen", new Livro("Uma breve historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do habito", 408));
            put("Harari, Yuval", new Livro("21 Licoes para o seculo 21", 432));
        }};

        for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem insercao\t --");

        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do habito", 408));
            put("Harari, Yuval", new Livro("21 Licoes para o seculo 21", 432));
        }};

        for(Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabetica autores\t --");

        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabetica nomes dos livros\t --");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());





    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}