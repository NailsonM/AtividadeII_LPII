/* Questão-04: Faça um algoritmo utilizando a representação de fluxograma para ler a temperatura do
corpo medida com um termômetro. */

import java.util.Scanner;
public class Q04Calctemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--Calculando a Temperatura do Corpo--");
        System.out.println("Digite a temperatura do corpo:");
        float temperatura = teclado.nextFloat();

        if (temperatura > 37) {
            System.out.println("O paciente está com febre!");
        } else {
            System.out.println("Sua temperatura está normal!");
        }
        teclado.close();
    }
}