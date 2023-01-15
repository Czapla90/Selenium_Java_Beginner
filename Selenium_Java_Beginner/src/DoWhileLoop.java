//Instrukcja DoWhile najpierw wykonuje kod, a dopiero potem sprawdza warunek.

public class DoWhileLoop {

    public static void main(String[] args) {

        int number = 21;

        do {
            System.out.println("Moja wartość to : " + number + " i jest mniejsza niż 20");
            number++;
        }
        while (number < 20);
    }
}
