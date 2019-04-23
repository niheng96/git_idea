package otherTest.single;

public class C {
    private static final C c = new C();

    public C getC() {
        return c;
    }
}
