//Napisz program, który poprosi użytkownika o 2 liczby, a następnie wykona na nich podstawowe operacja matematyczne.

import java.util.Scanner;

public class PracaDomowa1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cześć! Jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + "!");

        System.out.println("Podaj proszę pierwszą liczbę.");
        int firstNumber = scanner.nextInt();

        System.out.println("Podaj proszę drugą liczbę.");
        int secondNumber = scanner.nextInt();

        int mnożenie = firstNumber * secondNumber;
        int dodawanie = firstNumber + secondNumber;

        System.out.println("Wynik mnożenia to: " + mnożenie);
        System.out.println("Wynik dodawania to: " + dodawanie);
        System.out.println("Well done " + name + "!");

    }
}
