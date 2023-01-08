public class InkrementacjaDekrementacja {

    public static void main(String[] args) {
        //inkrementacja - zwiększenie wartości o jeden

        int a = 0;
        System.out.println("Wartość a: " + a); // 0
        int b = a++; //post inkrementacja
        System.out.println("Wartość b: " + b); // 0
        System.out.println("Wartość a: " + a); // 1
        int c = ++a; //pre inkrementacja
        System.out.println("Wartość c: " + c); // 2
        System.out.println("Wartość a: " + a); // 2

        //dekrementacja - zmniejszenie wartości o jeden

        int d = 0;
        System.out.println("Wartość d: " + d); //0
        int e = d--; //post dekrementacja
        System.out.println("Wartość e: " + e); //0
        System.out.println("Wartość d: " + d); //-1
        int f = --d; //pre dekrementacja
        System.out.println("Wartość f: " + f); //-2
        System.out.println("Wartość d: " + d); //-2

    }
}
