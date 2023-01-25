//Definiowanie metod o tej samej nazwie ale różnych parametrach, wewnątrz tej samej klasy, nazywa sie MethodOverloading.

public class MethodOverload {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(int a) {
        System.out.println(a);
    }

    public void add(String a) {
        System.out.println(a);
    }

    public void add() {
        System.out.println(2+1);
    }
}
