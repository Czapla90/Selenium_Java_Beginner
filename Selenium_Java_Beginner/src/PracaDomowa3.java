// Wypisz liczby z zakresu 1-100, podzielne przez 3.
// Odwróc elementy tablicy [1,3,5] -> [5,3,1]
// PYTANIE REKRYTACYJNE!!!

public class PracaDomowa3 {

    public static void main(String[] args) {

        /*for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Jestem podzielna przez 3: " + i);
            }
        }*/

       String[] dniTygodnia = new String[7];
        dniTygodnia[0] = "Poniedziałek";
        dniTygodnia[1] = "Wtorek";
        dniTygodnia[2] = "Środa";
        dniTygodnia[3] = "Czwartek";
        dniTygodnia[4] = "Piątek";
        dniTygodnia[5] = "Sobota";
        dniTygodnia[6] = "Niedziela";

       /* for (int i = 0; i < (dniTygodnia.length/2); i++) {
            String temp = dniTygodnia[i];
            dniTygodnia[i] = dniTygodnia[dniTygodnia.length-1-i];
            dniTygodnia[dniTygodnia.length-1-i] = temp;
        }

        for (int i = 0; i < dniTygodnia.length; i++) {
            System.out.println(dniTygodnia[i]);
        }*/

        int[] numbers = new int[] {1,3,5,7,0};

        for (int i = 0; i < (numbers.length/2); i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length-1 -i];
            numbers[numbers.length-1-i] = temp;
            System.out.println("Iteracja numer: " + i);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
