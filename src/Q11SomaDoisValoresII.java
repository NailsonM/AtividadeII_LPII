/* Questão-11: Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois
valores numéricos. */

import java.util.Scanner;
public class Q11SomaDoisValoresII {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--Descobrido a soma dos valores--");
        System.out.println("Digite o primeiro valor:");
        int v1 = teclado.nextInt();
        System.out.println("Digite o segundo valor:");
        int v2 = teclado.nextInt();

        int soma = v1 + v2;
        int resultadoFinal;

        if (soma >= 10.0) {
            resultadoFinal = soma + 5;
        } else { resultadoFinal = soma - 7;
        }

        System.out.println("O resultado final é: " + resultadoFinal);
        teclado.close();
    }
}