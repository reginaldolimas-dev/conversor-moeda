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
                    System.out.println("Você escolheu: Dólar para Peso argentino");
                    break;
                case 2:
                    System.out.println("Você escolheu: Peso argentino para Dólar");
                    break;
                case 3:
                    System.out.println("Você escolheu: Dólar para Real brasileiro");
                    break;
                case 4:
                    System.out.println("Você escolheu: Real brasileiro para Dólar");
                    break;
                case 5:
                    System.out.println("Você escolheu: Dólar para Peso colombiano");
                    break;
                case 6:
                    System.out.println("Você escolheu: Peso colombiano para Dólar");
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
}