import drivers.FireFoxDriver;
import drivers.WebDriver;

public class ConversionCasting {

    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c = a/b; // konwersja niejawna - a (int) zostaje przekonwertowana na double

        int d = a/(int)b; //konwersja jawna - kowersja z double na int

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FireFoxDriver();

        FireFoxDriver fireFoxDriver = (FireFoxDriver) driver;
        fireFoxDriver.get();
    }
}
