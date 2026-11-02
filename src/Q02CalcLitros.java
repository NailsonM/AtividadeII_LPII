/* Questão-02: Construa um algoritmo utilizando a representação de fluxograma que calcule e informe a
quantidade de gasolina que será preciso colocar no carro e quanto irá custar para o seu dono ir
até a sua fazenda. */

import java.util.Scanner;
public class Q02CalcLitros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-- Calculando os litros gastos na Viagem --");
        System.out.println("Digite a distância percorrida até a fazenda em (km):");
        float distancia = teclado.nextFloat();
        System.out.println("Digite o preço do litro da gasolina (R$):");
        float precoLitro = teclado.nextFloat();

        float qtdelitros = distancia / 12;
        float custo = qtdelitros * precoLitro;

        System.out.printf("Litros de gasolina necessários: %.2fL\n", qtdelitros);
        System.out.printf("O Custo total da viagem foi de: R$%.2f ", custo);

        teclado.close();
    }
}

