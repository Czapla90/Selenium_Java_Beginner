// Instrukcja sterująca switch. Alternatywa do ElseIf
// break - słowo kluczowe przerywujące wykonanie instrukcji sterującej. Brak słowa break powoduje wykonanie kolejnej komendy, bez sprawdzenia warunku.

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dzień dobry, jaki dzień tygodnia mamy?");
        String dzienTygodnia = scanner.nextLine();

        switch (dzienTygodnia) {
            case "Poniedziałek":
                System.out.println("Miłego poniedziałku!");
                break;
            case "Wtorek":
                System.out.println("Miłego wtorku!");
                break;
            case "Środa":
                System.out.println("Środa minie, tydzień zginie!");
                break;
            case "Czwartek":
                System.out.println("Już prawie weekendunio!");
                break;
            case "Piątek":
                System.out.println("Piątek, piąteczek, piątunio");
                break;
            case "Sobota":
                System.out.println("Pamiętaj aby kupić KC oraz browara na klina!");
                break;
            case "Niedziela":
                System.out.println("A jutro do roboty!");
                break;
            default:
                System.out.println("Już najebany?");
        }
    }
}
