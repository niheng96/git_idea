package designMode.factory;

public class SubFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new Sub();
    }
}
