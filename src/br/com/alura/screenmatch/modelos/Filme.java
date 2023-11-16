package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Estrelas;

public class Filme extends Titulo implements Estrelas {
    private String diretor;

    // Abaixo criamos um Construtor, se assemelha à um método mas não é;
    // Nesse caso, o construtor exige que a criação de um filme tenha um parêmetro;
    // Nesse caso, o parâmetro é o próprio nome do objeto
    public Filme(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);

    }
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getEstrelas() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + "(" + getAnoDeLancamento() + ")";
    }
}
