// Konstruktor - metoda wywoływana podczas tworzenia obiektu.
// Konstruktor bez podania żadnych parametrów jest konstruktorem domyślnym, nie wymaga ręcznego/jawnego definiowania.

public class UserTest {

    public static void main(String[] args) {

        //User user = new User();
        User user = new User("Mateusz", "Java");

        /*user.username = "Mateusz";
        user.password = "JAVA";*/
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
