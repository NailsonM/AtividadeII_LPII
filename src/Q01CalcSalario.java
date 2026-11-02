/* Questão-01: Construir um algoritmo utilizando a representação de fluxograma para que solicite ao
usuário a quantidade de horas trabalhadas no mês por um operário. */

import java.util.Scanner;
public class Q01CalcSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--Calculadora de Horas de Trabalho--");
        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        float horas = teclado.nextFloat();

        float salario = horas * 20;

        System.out.printf("O salário do operário é de: R$%.2f ", salario);
        teclado.close();
    }
}