// Działają na wartościach logicznych zwracając również wartości logiczne.
public class OperatoryLogiczne {

    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean forthValue = false;

        // && -> true wtedy, gdy wyrażenia składowe są równe true
        // || -> true wtedy, gdy jedno wyrażenie składowe jest równe true
        // ! -> zwraca wartość przeciwną do wyrażenia przed którym się znajduje

        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && thirdValue);
        System.out.println(firstValue || secondValue);
        System.out.println(secondValue || forthValue);
        System.out.println(!firstValue);
        System.out.println(!secondValue);
        System.out.println(!(firstValue && secondValue));
    }
}
