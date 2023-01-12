public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {

        int number = 10;

        if (number == 0) {
            System.out.println("Liczba równa 0");
        } else if (number > 10) {
            System.out.println("Liczba większa niż 10");
        } else if (number > 0) {
            System.out.println("Liczba dodatnia");
        }  else if (number < -5) {
            System.out.println("Liczba mniejsza niż -5");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
        }
    }
}
