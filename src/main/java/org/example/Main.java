package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner ler = new Scanner(System.in);

        while (opcao != 7) {
            System.out.println("******************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
            System.out.println();
            System.out.println("1) Dólar >>> Peso argentino");
            System.out.println("2) Peso argentino >>> Dólar");
            System.out.println("3) Dólar >>> Real brasileiro");
            System.out.println("4) Real brasileiro >>> Dólar");
            System.out.println("5) Dólar >>> Peso colombiano");
            System.out.println("6) Peso colombiano >>> Dólar");
            System.out.println("7) Sair");
            System.out.println();
            System.out.print("Escolha uma opção válida: ");
            opcao = ler.nextInt();
            System.out.println("******************************************************");
            System.out.println();

            switch (opcao) {
                case 1:
                    converterMoeda("USD", "ARS", "Dólar", "Peso argentino");
                    break;
                case 2:
                    converterMoeda("ARS", "USD", "Peso argentino", "Dólar");
                    break;
                case 3:
                    converterMoeda("USD", "BRL", "Dólar", "Real Brasileiro");
                    break;
                case 4:
                    converterMoeda("BRL", "USD", "Real Brasileiro", "Dólar");
                    break;
                case 5:
                    converterMoeda("USD", "COP", "Dólar", "Peso colombiano");
                    break;
                case 6:
                    converterMoeda("COP", "USD", "Peso colombiano", "Dólar");
                    break;
                case 7:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();
        }
        ler.close();
    }

    private static void converterMoeda(String de, String para, String nomeOrigem, String nomeDestino) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Você escolheu: %s para %s%n", nomeOrigem, nomeDestino);
        System.out.printf("Digite o valor em %s: ", nomeOrigem);

        double valor = ler.nextDouble();

        double resultado = ConversorMoeda.converter(de, para, valor);
        if (resultado != -1) {
            System.out.printf("Valor convertido com sucesso: %.2f %s = %.2f %s%n", valor, de, resultado, para);
        } else {
            System.out.println("Erro ao realizar a conversão.");
        }
    }
}