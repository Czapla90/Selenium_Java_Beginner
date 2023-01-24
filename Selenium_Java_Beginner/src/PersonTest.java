public class PersonTest {

    public static void main(String[] args) {

        Person3 coach = new Person3();
        coach.firstName = "Kevin";
        coach.lastName = "O'Connell";
        coach.age = 35;
        coach.position = "Head Coach";
        coach.coachNFL();

        Person2 player = new Person2();
        player.firstName = "Harrison";
        player.lastName = "Smith";
        player.age = 31;
        player.nflClub = "Minnesota Vikings";
        player.playNFL();
    }
}
