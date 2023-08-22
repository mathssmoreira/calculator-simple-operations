package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double soma;
        Double subtracao;
        Double multiplicacao;
        Double divisao;
        Double modulo;


        System.out.print("Selecione uma letra de acordo com a operação que deseja fazer [A = Soma, B = Subtração, C = Multiplicação, D = Divisão, E = Módulo]: ");
        String operacao = scanner.nextLine();

        System.out.print("Insira o 1º valor: ");
        Double valor1 = scanner.nextDouble();

        System.out.print("Insira o 2º valor: ");
        Double valor2 = scanner.nextDouble();


        if (operacao.equals("A")) {

            soma = valor1 + valor2;
            System.out.println("O resultado da SOMA é de: " + soma);

        } else if (operacao.equals("B")) {

            subtracao = valor1 - valor2;
            System.out.println("O resultado da SUBTRAÇÃO é de: " + subtracao);

        }else if (operacao.equals("C")) {

            multiplicacao = valor1 * valor2;
            System.out.println("O resultado da MULTIPLICAÇÃO é de: " + multiplicacao);

        }else if (operacao.equals("D")) {

            divisao = valor1 / valor2;
            System.out.println("O resultado da DIVISÃO é de: " + divisao);

        }else if (operacao.equals("E")) {

            modulo = valor1 % valor2;
            System.out.println("O resultado do MÓDULO é de: " + modulo);

        } else {
            System.out.println("Operação não encontrada!");
        }
    }
}