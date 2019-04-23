package designMode.factory;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new AddFactory();
//        Factory factory = new SubFactory();
        Operation operation = factory.createOperation();
        operation.setA(7);
        operation.setB(3);
        int result = operation.getResult();
        System.out.println(result);
    }
}
