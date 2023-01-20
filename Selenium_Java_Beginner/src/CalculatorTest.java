import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Cześć! Jak masz na imię?");
            String name = scanner.nextLine();
            System.out.println("Cześć " + name + "!");

            System.out.println("Podaj proszę pierwszą liczbę.");
            int firstNumber = scanner.nextInt();

            System.out.println("Podaj proszę drugą liczbę.");
            int secondNumber = scanner.nextInt();

            Calculator calculator = new Calculator();


            // Pierwszy sposób: wywołanie metod w zmiennych

            int addition = calculator.dodawanie(firstNumber, secondNumber);
            int subtraction = calculator.odejmowanie(firstNumber, secondNumber);
            int multiplication = calculator.mnożenie(firstNumber, secondNumber);
            int division = calculator.odejmowanie(firstNumber, secondNumber);
            int mod = calculator.modulo(firstNumber, secondNumber);

            System.out.println("Wynik dodawania to: " + addition);
            System.out.println("Wynik odejmowania to: " + subtraction);
            System.out.println("Wynik mnożenia to: " + multiplication);
            System.out.println("Wynik dzielenia to: " + division);
            System.out.println("Wynik modulo to: " + mod);
            System.out.println("Well done " + name + "!");


            // Drugi sposób: wywołanie zmiennych bezpośrednio w instrukcji wypisania, bez ustalania dodatkowych zmiennych.

            System.out.println("Wynik dodawania to: " + calculator.dodawanie(firstNumber, secondNumber));
            System.out.println("Wynik odejmowania to: " + calculator.odejmowanie(firstNumber, secondNumber));
            System.out.println("Wynik mnożenia to: " + calculator.mnożenie(firstNumber, secondNumber));
            System.out.println("Wynik dzielenia to: " + calculator.odejmowanie(firstNumber, secondNumber));
            System.out.println("Wynik modulo to: " + calculator.modulo(firstNumber, secondNumber));
            System.out.println("Well done " + name + "!");



    }
}