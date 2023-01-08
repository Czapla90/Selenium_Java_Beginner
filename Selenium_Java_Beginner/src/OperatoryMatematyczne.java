// Umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;
        float forthNumber = 6.0F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber / forthNumber;
        int mod = secondNumber % firstNumber;

        System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynik odejmowania " + subtraction);
        System.out.println("Wynik mnożenia " + multiplication);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Wynik modulo " + mod);

        firstNumber+=secondNumber;  // firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu " + firstNumber);

        firstNumber-=secondNumber;  // firstNumber - secondNumber
        System.out.println("Po odejmowaniu " + firstNumber);

        firstNumber*=secondNumber;  // firstNumber * secondNumber
        System.out.println("Po mnożeniu " + firstNumber);

        firstNumber/=secondNumber;  // firstNumber / secondNumber
        System.out.println("Po dzieleniu " + firstNumber);

        firstNumber%=secondNumber;  // firstNumber % secondNumber
        System.out.println("Po modulo " + firstNumber);

    }
}
