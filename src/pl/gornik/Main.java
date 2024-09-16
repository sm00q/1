package pl.gornik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner1.nextInt();
        System.out.println(number + " To jest liczba odczytana z klawiatury");
        System.out.printf("");

        System.out.println(number + " to jest liczba odczytana z klawiatury");

        System.out.printf("%d to jest liczba odczytana z klawiatury\n", number);
        System.out.println("Tekst");
        System.out.println("Nowa linia");
        System.out.printf("Elo żelo");
    }
}
