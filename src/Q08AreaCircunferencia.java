/* Questão-08: Faça um algoritmo utilizando a representação de fluxograma que calcule a área de uma
circunferência e apresente a medida da área calculada. */

import java.util.Scanner;
import java.lang.Math;

public class Q08AreaCircunferencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--Calculando a Aréa da Circunferência--");
        System.out.println("Digite o valor do raio da circunferência:");
        float raio = teclado.nextFloat();

        float pi = 3.14f;
        float area = (float) (pi * (Math.pow(raio, 2.0)));

        System.out.printf("A área da circunferência é de: %.2fcm ",area);

        teclado.close();
    }
}