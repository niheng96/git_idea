package designMode.factory;

public class Add extends Operation {
    @Override
    public int getResult() {
        return getA() + getB();
    }
}
