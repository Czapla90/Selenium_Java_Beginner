//Zapytaj użytkownika o wiek. Gdy ma mniej niż 18 lat, poinformuj to, że nie może kupić alkoholu.

import java.util.Scanner;

public class PracaDomowa2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dzień dobry! Proszę o podanie wieku.");
        int wiek = scanner.nextInt();

        if (wiek < 18 && wiek > 0) {
            System.out.println("Bardzo mi przykro, alkoholu osobom poniżej 18 roku życia, nie sprzedajemy");
        } else if (wiek <= 0) {
            System.out.println("Proszę sobie nie żartować!");
        } else {
            System.out.println("Uprzejmie proszę, życzę miłego dnia!");
        }
    }
}
