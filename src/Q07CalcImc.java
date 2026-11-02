/* Questão-07: Faça um algoritmo utilizando a representação de fluxograma que leia o peso e a altura do
usuário e informa se o mesmo está obeso. */

import java.util.Scanner;
import java.lang.Math;
public class Q07CalcImc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--Calculando o IMC--");
        System.out.println("Digite o seu peso em (kg):");
       float peso = teclado.nextFloat();
        System.out.println("Digite a sua altura em (m):");
       float altura = teclado.nextFloat();

       float imc = peso / (float)Math.pow(altura, 2.0);
        System.out.printf("Seu IMC é: %.2f \n",imc);

        if (imc > 30.0) {
            System.out.println("Usuário está obeso!.");
        } else {
            System.out.println("Usuário não está obeso!");
        }
        teclado.close();
    }
}