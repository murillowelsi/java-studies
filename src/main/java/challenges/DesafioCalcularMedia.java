package challenges;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioCalcularMedia {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de notas que deseja informar.");
        Scanner read = new Scanner(System.in);

        int tamArr = read.nextInt();

        double []notas = new double[tamArr];

        for (int i = 0; i < tamArr; i++) {

            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = read.nextDouble();

        }

        double sum = 0;

        for (double nota: notas) {
            sum += nota;
        }

        double media = sum/tamArr;

        System.out.println("A média final é: " + media);
    }
}
