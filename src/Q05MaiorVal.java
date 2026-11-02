/* Questão-05: Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário 2
números diferentes e mostre o maior deles. */

import java.util.Scanner;
public class Q05MaiorVal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--Descobrindo qual o maior Valor--");
        for(int i=1; i<=2;i++) {
            System.out.printf("Digite o %d° número: ", i++);
            float num1 = teclado.nextFloat();
            System.out.printf("Digite o %d° número: ", i++);
            float num2 = teclado.nextFloat();

            if (num1 > num2) {
                System.out.println("O maior número é: " + num1 + ", o 1° Número!");
            } else if (num2 > num1) {
                System.out.println("O maior número é: " + num2+ ", o 2° Número!");
            } else {
                System.out.println("Os números são iguais: " + num1);
            }
        }
        teclado.close();
    }
}