package drivers;

import drivers.WebDriver;

public class FireFoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę Mozilla FireFox.");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą przeglądarki FireFox");

    }
}
