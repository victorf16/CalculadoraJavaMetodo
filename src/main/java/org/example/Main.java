package org.example;

import java.util.Scanner;

/*
*
*
*
*  ATENCAO ESTE E UM PROJETO DE ESTUDO, NAO UTILIZAR O MESMO EM PRODUCAO SENDO APENAS UM CODIGO UTILIZADO PARA TESTS E APRENDIZADO
*
*
*
*  */







public class Main {

    // VARIAVEL GLOBAL DEVE SER DECLARADA FORA DO METODO E ELA VAI SER VISTUALZIADA POR TODOS OS METODOS
    // PARA CRIAR METODO POR EXEMPLO METODO EXIBIR MENU, DEVE CRIAR FORA DO VOID MAIN
    // O STATIC NO CASO ELE INFORMA QUE NAO PRECISA DE DECLARAR OBJETOS, E O VOID INFORMA QUE ELE NAO TEM RETORNO
    public static void exibirMenu(){

        System.out.println(" \n \n ***** CALCULADORA ******" );
        System.out.println("Digite a operacao matematica 1 = soma" );
        System.out.println("Digite a operacao matematica 2 = divisao" );
        System.out.println("Digite a operacao matematica 3 = multiplicacao" );
        System.out.println("Digite a operacao matematica 4 = subtracao " );
        System.out.println("Digite a operacao matematica 6 = SAIR " );
    }

    public static void mostrarResultado(double resultado){

        System.out.println("soma do valor1 e valor2 e igual a " + resultado);

    }


    public static void exibirSoma(double valor1, double valor2){

        mostrarResultado(valor1 + valor2);

    }

    public static void exibirSubtracao(double valor1, double valor2){
        double resultado = valor1 - valor2;
        System.out.println("soma do valor1 e valor2 e igual a " + resultado);

    }

    public static void exibirDivisao(double valor1, double valor2){
        double resultado = valor1 / valor2;
        System.out.println("soma do valor1 e valor2 e igual a " + resultado);

    }

    public static void exibirMultiplicacao(double valor1, double valor2){
        double resultado = valor1 * valor2;
        System.out.println("soma dos valores =  " + resultado);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double soma;
        double divisao;
        double subtracao;
        int operacaomatematica = 0;
        double valor1 = 0, valor2 = 0;
        Scanner leitor = new Scanner(System.in);


        while (operacaomatematica !=6  ) {

            do {

                exibirMenu(); // METODO SOMA
                operacaomatematica = leitor.nextInt();

                if (operacaomatematica >= 7 || operacaomatematica <=0 ){
                    System.out.println("digite uma opcao valida");
                }


            } while (operacaomatematica >= 7 || operacaomatematica <=0 );

            if(operacaomatematica != 6) {

                System.out.println("digite o primeiro numero");

                valor1 = leitor.nextInt();

                System.out.println("digite o segundo numero");

                valor2 = leitor.nextInt();
            }


            if (operacaomatematica == 1) {

                exibirSoma(valor1,valor2);


            } else if (operacaomatematica == 2) {

                System.out.println("divisao do valor1 e valor2 e igual a ");
                divisao = (double) valor1 / valor2;
                System.out.println(divisao);


            } else if (operacaomatematica == 2) {

                System.out.println("subtracao do valor1 e valor2 e igual a  ");
                subtracao = valor1 - valor2;
                System.out.println(subtracao);


            } else {
                System.out.println("Ate Logo" );
                operacaomatematica = 6;}
        }



    }

}
