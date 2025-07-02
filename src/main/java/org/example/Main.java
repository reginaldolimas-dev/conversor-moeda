package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String texto = "";
        Scanner ler = new Scanner(System.in);

        while(!texto.equalsIgnoreCase("sair")) {
            System.out.println("Digite seu nome:");
            texto = ler.nextLine();
        }
    }
}