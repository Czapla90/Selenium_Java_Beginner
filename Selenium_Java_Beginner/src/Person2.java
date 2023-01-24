public class Person2 extends Person1 {

    public String nflClub;

    public Person2(String firstName, String lastName, int age, String nflClub) {
        super(firstName, lastName, age);
        System.out.println("Jestem w konstruktorze Person2.");
        this.nflClub = nflClub;
    }

    public void playNFL() {
        eat();
        walk();
        System.out.println("I play NFL for a living for the " + nflClub + ".");
    }
}
