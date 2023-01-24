public class Person2 extends Person1 {

    public String nflClub;

    public void playNFL() {
        eat();
        walk();
        System.out.println("I play NFL for a living for the " + nflClub + ".");
    }
}
