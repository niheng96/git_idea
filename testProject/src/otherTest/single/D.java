package otherTest.single;

public class D {
    private static D d;

    static {
        d = new D();
    }

    protected static D getD() {
        return d;
    }
}
