package otherTest.single;

public class E {
    private static E e;

    private static class Instance {
        private static final E e = new E();
    }

    public static E getE() {
        return Instance.e;
    }
}
