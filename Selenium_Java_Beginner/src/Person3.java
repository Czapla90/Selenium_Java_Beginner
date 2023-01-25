public class Person3 extends Person1 {

    public String position;

    public Person3(String firstName, String lastName, int age, String position) {
        super(firstName, lastName, age);
        System.out.println("Jestem w konstruktorze Person3.");
        this.position = position;
    }

    public void coachNFL() {
        eat();
        walk();
        System.out.println("I coach how to play NFL as a " + position + ".");
    }
}
