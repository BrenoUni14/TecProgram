package com.company.teste_SwitchCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaração Scanner
        Scanner entrada = new Scanner(System.in);

        //Inserindo dados
        System.out.println("Entre com um número do mês:");
        int mes = entrada.nextInt();

        //Switch-Case
        switch (mes){
            case 1:
                System.out.println("Você escolheu mês de Janeiro!");
                break;
            case 2:
                System.out.println("Você escolheu mês de Fevereiro!");
                break;
            case 3:
                System.out.println("Você escolheu mês de Março!");
                break;
            case 4:
                System.out.println("Você escolheu mês de Abril!");
                break;
            case 5:
                System.out.println("Você escolheu mês de Maio!");
                break;
            case 6:
                System.out.println("Você escolheu mês de Junho!");
                break;
            case 7:
                System.out.println("Você escolheu mês de Julho!");
                break;
            case 8:
                System.out.println("Você escolheu mês de Agosto!");
                break;
            case 9:
                System.out.println("Você escolheu mês de Setembro!");
                break;
            case 10:
                System.out.println("Você escolheu mês de Outubro!");
                break;
            case 11:
                System.out.println("Você escolheu mês de Novembro!");
                break;
            case 12:
                System.out.println("Você escolheu mês de Dezembro!");
                break;
            default:
                System.out.println("Você não escolheu nenhum mês!");
        }


    }
}
