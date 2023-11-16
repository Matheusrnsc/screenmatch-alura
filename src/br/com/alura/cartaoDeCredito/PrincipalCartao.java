package br.com.alura.cartaoDeCredito;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalCartao {
    public static void main(String[] args) {
        ArrayList<CalculoCartao> carrinho = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int continua = 1;
        System.out.println("Digite o limite do cartão: ");
        double limite = input.nextDouble();


        while (continua == 1) {
            var user = new CalculoCartao();
            System.out.println("Digite a descrição do produto: ");
            String descr = input.next();
            user.setDescricao(descr);
            System.out.println("Digite o valor do produto: ");
            double valor = input.nextDouble();
            user.setValor(valor);
            if (valor > limite) {
                System.out.println("Limite insuficiente");
                if (valor > limite) {

                    break;
                } else {
                    System.out.println("Compra realizada!");
                    limite = limite - valor;
                    user.setLimite(limite);
                    carrinho.add(user);
                }
                System.out.println("Digite 0 para sair ou 1 para continuar");
                Scanner cont = new Scanner(System.in);
                continua = cont.nextInt();
                if (continua == 0) {
                    System.out.println("Compras realizadas: *************");
                    {
                        for (CalculoCartao item : carrinho) {
                            System.out.println((item));
                        }
                        System.out.println("********************************");
                        System.out.println("Limite do cartão: " + limite);
                        break;
                    }
                }
            }
        }
    }
}