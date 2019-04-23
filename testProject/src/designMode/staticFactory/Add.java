package designMode.staticFactory;

public class Add extends Operation {
    @Override
    public int getResult() {
        return getA() + getB();
    }
}
