import java.util.Scanner;

public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();
    /*    metody.policzWynik();

        int result = metody.pobierzWynik();
        int result2 = result * 2;
        System.out.println("Rezultat przed mnożeniem to: " + result);
        System.out.println("Rezultat po mnożeniu to: " + result2);*/

        /*metody.policzWynikParam(2);
        metody.policzWynikParam(100);
        metody.policzWynikParam(23);*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj proszę 2 liczby.");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        metody.add(input1,input2);

    }
}
