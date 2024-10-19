/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Arrays;
import java.util.Random;

public class Q301 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numeros = new int[10];

        // Criar vetor com números aleatórios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(100);
        }

        // Lista original
        System.out.println("Lista original:");
        exibirLista(numeros);

        // Lista em ordem crescente
        int[] numerosCrescentes = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(numerosCrescentes);
        System.out.println("Lista ordenada em ordem crescente:");
        exibirLista(numerosCrescentes);

        // Lista em ordem decrescente
        Integer[] numerosDecrescentes = Arrays.stream(numeros).boxed().toArray(Integer[]::new);
        Arrays.sort(numerosDecrescentes, (a, b) -> b - a);
        System.out.println("Lista ordenada em ordem decrescente:");
        exibirLista(numerosDecrescentes);
    }

    // Exibir a lista de números
    private static void exibirLista(int[] lista) {
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void exibirLista(Integer[] lista) {
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
