public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 2.05F;
        float wynikDzielenia = dzielna / dzielnik;

        if (dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + wynikDzielenia);
        } else {
            System.out.println("Nie dzielimy przez 0!");
        }
    }
}
