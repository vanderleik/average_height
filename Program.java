package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
    Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em segui-
    da, mostrar a altura média dessas pessoas.
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of people you want to calculate the average height: ");
        int n = sc.nextInt();
        System.out.println("Enter the height of the people: ");
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.00;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }
}
