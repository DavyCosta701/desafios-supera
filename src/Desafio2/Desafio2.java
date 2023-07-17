package Desafio2;

import java.util.Scanner;

public class Desafio2 {

    public static void printValor() {
        Scanner scanner = new Scanner(System.in);
        float valor = scanner.nextFloat();

        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int moeda100 = 0;
        int moeda50 = 0;
        int moeda25 = 0;
        int moeda10 = 0;
        int moeda5 = 0;
        int moeda1 = 1;



        while (true){

            while (valor > 100){
                valor = valor - 100;
                nota100++;
            }
            while (valor > 50){
                valor = valor - 50;
                nota50++;
            }
            while (valor > 20){
                valor = valor - 20;
                nota20++;
            }
            while (valor > 10){
                valor = valor - 10;
                nota10++;
            }
            while (valor > 5){
                valor = valor - 5;
                nota5++;
            }
            while (valor > 2){
                valor = valor - 2;
                nota2++;
            }
            while (valor > 1){
                valor = valor - 1;
                moeda100++;
            }
            while (valor > 0.5){
                valor = (float) (valor - 0.50);
                moeda50++;
            }
            while (valor > 0.25){
                valor = (float) (valor - 0.25);
                moeda25++;
            }
            while (valor > 0.10){
                valor = (float) (valor - 0.10);
                moeda10++;
            }
            while (valor > 0.05){
                valor = (float) (valor - 0.05);
                moeda5++;
            }

            if (valor < 0.05){
                moeda1 += (int) (valor * 100) ;
                break;
            }

        }

        System.out.println("Notas:");
        System.out.println(nota100 + " nota(s) de 100.00");
        System.out.println(nota50 + " nota(s) de 50.00");
        System.out.println(nota20 + " nota(s) de 20.00");
        System.out.println(nota10 + " nota(s) de 10.00");
        System.out.println(nota5 + " nota(s) de 5.00");
        System.out.println(nota2 + " nota(s) de 2.00");
        System.out.println("Moedas:");
        System.out.println(moeda100 + " moeda(s) de 1.00");
        System.out.println(moeda50 + " moeda(s) de 0.50");
        System.out.println(moeda25 + " moeda(s) de 0.25");
        System.out.println(moeda10 + " moeda(s) de 0.10");
        System.out.println(moeda5 + " moeda(s) de 0.05");
        System.out.println(moeda1 + " moeda(s) de 0.01");



    }

    public static void main(String[] args) {

        Desafio2.printValor();
    }

}


