/* Questão-10: Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois
valores numéricos. */

import java.util.Scanner;
public class Q10SomaDoisValores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--Descobrido a soma de dois valores--");
        System.out.println("Digite o primeiro valor:");
        int v1 = teclado.nextInt();
        System.out.println("Digite o segundo valor:");
        int v2 = teclado.nextInt();

        int soma = v1 + v2;

        if (soma > 10) {
            System.out.println("O resultado da soma é: " + soma);
        } else {
            System.out.println("A soma não é maior que 10.");
        }
        teclado.close();
    }

}
