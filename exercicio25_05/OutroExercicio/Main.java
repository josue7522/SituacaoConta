package com.company.exercicio25_05.OutroExercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("**********SEJA BEM VINDO**********");

        System.out.println("valor do PRODUTO: ");
        double valorDoProduto = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        double quantidadeDoProduto = scanner.nextDouble();

        Boolean temDesconto = quantidadeDoProduto > 10;

        double subTotal = quantidadeDoProduto * valorDoProduto;

        if (temDesconto) {
            double desconto = (subTotal * 10) / 100;
            subTotal = subTotal - desconto;
            System.out.println("valor total do produto é: " + subTotal + "$");
        }
            else {
                System.out.println("********SEM DESCONTO PRA VOCÊ*******");
            }


    }


    // write your code here
 }

