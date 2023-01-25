public class PersonTest {

    public static void main(String[] args) {

        Person2 player = new Person2("Harrison", "Smith", 31,  "Minnesota Vikings");
        /*player.firstName = "Harrison";
        player.lastName = "Smith";
        player.age = 31;
        player.nflClub = "Minnesota Vikings";*/
        player.sayHello();
        player.playNFL();

        Person3 coach = new Person3("Kevin", "O'Connell", 35, "Head Coach");
        /*coach.firstName = "Kevin";
        coach.lastName = "O'Connell";
        coach.age = 35;
        coach.position = "Head Coach";*/
        coach.sayHello();
        coach.coachNFL();
    }
}
