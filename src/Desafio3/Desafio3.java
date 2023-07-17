package Desafio3;

import java.util.*;

public class Desafio3 {
    public static void printMatches() {
        Scanner scanner = new Scanner(System.in);
        int numeroValores = scanner.nextInt();
        int valorAlvo = scanner.nextInt();
        int matches = 0;

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < numeroValores; i++) {
            numeros.add(scanner.nextInt());
        }

        numeros.sort(Collections.reverseOrder());
        for (int i = 0; i < numeroValores - 1; i++) {
            for (int j = i + 1; j < numeroValores ; j++) {
                if (numeros.get(i) - numeros.get(j) == valorAlvo){
                    matches++;
                }
            }
        }
        System.out.println(matches);
    }

    public static void main(String[] args) {
        Desafio3.printMatches();
    }
}