public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rokProdukcji = 2022;
        mercedes.przebieg = 1500;
        mercedes.rodzajPaliwa = "Diesel";

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto skoda = new Auto();
        skoda.marka = "Skoda";
        skoda.model = "Subperb";
        skoda.rokProdukcji = 2018;
        skoda.przebieg = 55000;
        skoda.rodzajPaliwa = "Benzyna";

        skoda.jedz();
        skoda.hamuj();
        skoda.info();


    }
}
