public class MethodOverloadTest {

    public static void main(String[] args) {
        MethodOverload methodName = new MethodOverload();
        methodName.add(3, 2);
        methodName.add(3, 2, 1);
        methodName.add(3);
        methodName.add("3");
        methodName.add();

    }
}
