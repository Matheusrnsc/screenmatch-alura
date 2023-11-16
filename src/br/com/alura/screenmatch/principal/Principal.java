package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Interstellar", 2014);
        //meuFilme.setNome("Interstellar");
       // meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(169);
        System.out.println("Duração em minutos; " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFicaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        // System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        // USAR MÉTODO GET TOTAL DE AVALIAÇÕES System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
       // lost.setAnoDeLancamento(2000);
        lost.exibeFicaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração em minutos: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2023);
        //outroFilme.setNome("Avatar");
        //outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);


        var toystory = new Filme("Toy Story", 1995);
        //toystory.setNome("Toy Story");
        //toystory.setAnoDeLancamento(1995);
        toystory.setDuracaoEmMinutos(81);
        toystory.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(toystory);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);





    }
}
