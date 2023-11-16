package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class FiltroRecomendacao {
     public void filtra(Estrelas estrelas) {
        if (estrelas.getEstrelas() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (estrelas.getEstrelas() >= 2 && estrelas.getEstrelas() < 4) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println(" Coloque na sua lista para assistir depois");
        }
    }
}

