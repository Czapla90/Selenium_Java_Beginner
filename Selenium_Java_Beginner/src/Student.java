public class Student {

    public String imie;
    public String nazwisko;
    public String rokUrodzenia;
    public String adresEmail;
    public int numerTelefonu;
    public int numerIndeksu;

    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Zaloguj się używając " + adresEmail + " i hasła.");
    }

    public void podajNrIndeksu() {
        System.out.println("Mój numer indeksu to: " + numerIndeksu);
    }

    public void podajNrTelefonu() {
        System.out.println("Mój numer telefonu to: " + numerTelefonu);
    }
}
