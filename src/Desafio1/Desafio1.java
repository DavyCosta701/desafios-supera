package Desafio1;

import java.io.IOException;
import java.util.*;

public class Desafio1 {

    public static void printOrder() {
        Scanner scanner = new Scanner(System.in);
        int numeroValores = scanner.nextInt();

        List<Integer> listaPar = new ArrayList<>();
        List<Integer> listaImpar = new ArrayList<>();

        for (int i = 0; i < numeroValores; i++) {
            int valor = scanner.nextInt();

            if(valor%2 == 0){
                listaPar.add(valor);
            }
            else {
                listaImpar.add(valor);
            }
        }
        Collections.sort(listaPar);
        listaImpar.sort(Collections.reverseOrder());
        listaPar.forEach(System.out::println);
        listaImpar.forEach(System.out::println);
    }

    public static void main(String[] args) {

        Desafio1.printOrder();
    }

}
