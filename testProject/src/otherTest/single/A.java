package otherTest.single;

public class A {
    private static A a;

    private static A getA() {
        if (a == null) {
            return new A();
        }
        return a;
    }
}
