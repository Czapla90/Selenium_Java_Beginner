// Final - wartość przypisana do zmiennej nie może być zmieniona/nadpisana

public class FinalTest {

    public static void main(String[] args) {
        final int x = 2;

        /*x = 5;*/

        final Person1 person = new Person1("Mateusz", "Czapla", 33);
        person.age = 30;

        /*person = new Person1("Tomasz", "Who", 35);*/


    }
}
