package otherTest.single;

public class B {
    private static B b;

    public static B getB() {
        if (b == null) {
            synchronized (B.class) {
                if (b == null) {
                    return new B();
                }
            }
        }
        return b;
    }

}
