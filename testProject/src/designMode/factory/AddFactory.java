package designMode.factory;

public class AddFactory implements Factory{

    @Override
    public Operation createOperation() {
        return new Add();
    }
}
