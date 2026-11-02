/* Questão-06: Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário as
notas de 2 provas e um trabalho e que seja capaz de calcular a média aritmética. */

import java.util.Scanner;
public class Q06CalcMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--Calculando a Média Aritimética--");
        System.out.println("Digite a nota da Prova 1:");
        float p1 = teclado.nextFloat();
        System.out.println("Digite a nota da Prova 2:");
        float p2 = teclado.nextFloat();
        System.out.println("Digite a nota do Trabalho:");
        float trab = teclado.nextFloat();

        float media = (p1 + p2 + trab) / 3;
        System.out.printf("Média final: %.2f ", media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
        teclado.close();
    }
}