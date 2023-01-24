public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto("Mercedes", "Klasa S", 2022, 1500, "Diesel");
        /*mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rokProdukcji = 2022;
        mercedes.przebieg = 1500;
        mercedes.rodzajPaliwa = "Diesel";*/

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto skoda = new Auto("Skoda", "Superb", 2018, 55000, "Benzyna");
        /*skoda.marka = "Skoda";
        skoda.model = "Subperb";
        skoda.rokProdukcji = 2018;
        skoda.przebieg = 55000;
        skoda.rodzajPaliwa = "Benzyna";*/

        skoda.jedz();
        skoda.hamuj();
        skoda.info();

        Auto audi = new Auto();

        audi.jedz();
        audi.hamuj();
        audi.info();


    }
}
