package br.com.alura.exercicios;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalBuscador {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner pegaCep = new Scanner(System.in);
        String pegaCepStr = "";
        while(!(pegaCepStr.length() == 8)) {
            System.out.println("Digite seu CEP de 8 dígitos sem espaços e sem pontuações, por exemplo: 71670725");
            System.out.println("Ou digite 'Sair' para sair ");
            pegaCepStr= pegaCep.next();
            if (pegaCepStr.equalsIgnoreCase("sair")){
                break;
            }
            Buscador user = new Buscador();
            user.setCep(Integer.valueOf(pegaCepStr));
            user.voltaCep();
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(user.voltaCep());
        }
    }
}
