import java.util.Scanner;

// Porównują elementy równania i zwracają logiczną wartość (true/false)
public class OperatoryPorównania {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę pierwszą liczbę.");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj proszę drugą liczbę.");
        int secondNumber = scanner.nextInt();

        boolean result = firstNumber > secondNumber;

        System.out.println(result);
        System.out.println("A > B: " + (firstNumber == secondNumber));
        System.out.println(firstNumber != secondNumber);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
    }
}
