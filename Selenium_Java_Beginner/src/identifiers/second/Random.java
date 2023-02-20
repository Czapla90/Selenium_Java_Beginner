package identifiers.second;

import identifiers.first.Parent;

public class Random {

    public void testIdentifier() {

        //Klasa (niepotomna) w innej paczce nie ma dostępu do pól/metod private, default & protected.

        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        System.out.println(parent.fourth);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
        parent.fourthMethod();
    }
}
