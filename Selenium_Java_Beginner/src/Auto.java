public class Auto {

    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;
    public String wlasciciel;
    public String rodzajPaliwa;


    public Auto() {

    }

    public Auto(String marka, String model, int rokProdukcji, int przebieg, String rodzajPaliwa) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
        this.wlasciciel = wlasciciel;
        this.rodzajPaliwa = rodzajPaliwa;
    }

    public void jedz() {
        System.out.println("Jedz!");
    }

    public void hamuj() {
        System.out.println("Hanmuj!");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok Produkcji: " + rokProdukcji);
        System.out.println("Pzebieg: " + przebieg);
        System.out.println("Rodzaj paliwa: " + rodzajPaliwa);
    }
}
