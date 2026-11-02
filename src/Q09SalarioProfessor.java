/* Questão-09:  Faça um algoritmo utilizando a representação de fluxograma que calcule o salário líquido
de um professor. */

import java.util.Scanner;
public class Q09SalarioProfessor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--Calculando o Salario de um Professoro--");
        System.out.println("Digite o valor da hora-aula (R$):");
        float valorHora = teclado.nextFloat();
        System.out.println("Digite o número de horas trabalhadas no mês:");
        float horasMes = teclado.nextFloat();
        System.out.println("Digite o percentual de desconto do INSS em (%):");
        float descInss = teclado.nextFloat();

        float salarioBruto = valorHora * horasMes;
        float descontoInss = salarioBruto * (descInss / 100);
        float salarioLiquido = salarioBruto - descontoInss;

        System.out.printf("Salário Líquido do Professor: R$%.2f ", salarioLiquido);
        teclado.close();
    }
}