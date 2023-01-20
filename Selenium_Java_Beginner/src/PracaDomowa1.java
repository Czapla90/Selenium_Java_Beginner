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

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;

        System.out.println("Wynik dodawania to: " + addition);
        System.out.println("Wynik odejmowania to: " + subtraction);
        System.out.println("Wynik mnożenia to: " + multiplication);
        System.out.println("Wynik dzielenia to: " + division);
        System.out.println("Wynik modulo to: " + mod);
        System.out.println("Well done " + name + "!");

    }
}
