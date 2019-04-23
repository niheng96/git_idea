package designMode.staticFactory;

public class Sub extends Operation {
    @Override
    public int getResult() {
        return getA() - getB();
    }
}
