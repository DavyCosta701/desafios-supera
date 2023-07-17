package Desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {

    public static String decifrarPalavra(String linha) {
        int tamanho = linha.length();
        int metade = tamanho / 2;

        StringBuilder sb = new StringBuilder();

        for (int i = metade - 1; i >= 0; i--) {
            sb.append(linha.charAt(i));
        }

        for (int i = tamanho - 1; i >= metade; i--) {
            sb.append(linha.charAt(i));
        }

        return sb.toString();
    }
    public static void solvePrinter() {
        Scanner scanner = new Scanner(System.in);
        int quantidadePalavras = scanner.nextInt();
        List<String> listaPalavras = new ArrayList<>();

        for (int i = 0; i < quantidadePalavras + 1; i++) {
            String linha = scanner.nextLine();
            listaPalavras.add(decifrarPalavra(linha));
        }

        listaPalavras.forEach(System.out::println);

    }

    public static void main(String[] args) {
        solvePrinter();
    }
    }


