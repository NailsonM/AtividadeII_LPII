/* Questão-03: Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário sua
idade e informe se o mesmo já pode tirar carteira de motorista. */

import java.util.Scanner;
public class Q03CalcIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--Calculando idade para Tirar a CNH--");
        System.out.println("Digite sua idade:");
        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Você tem "+ idade +" anos, já pode tirar a carteira de motorista!");
        } else {
            System.out.println("Você tem "+ idade +" anos, ainda não pode tirar a carteira de motorista!");
        }
        teclado.close();
    }
}
