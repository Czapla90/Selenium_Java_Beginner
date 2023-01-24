public class Person1 {

    public String firstName;
    public String lastName;
    public int age;

    public Person1(String firstName, String lastName, int age) {
        System.out.println("Jestem w konstruktorze Person1.");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void eat() {
        System.out.println("I like eating!");
    }

    public void walk() {
        System.out.println("I like walking!");
    }
}
