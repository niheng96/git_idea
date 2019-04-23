package designMode.staticFactory;

public class SimpleTest {
    public static void main(String[] args) {
        Operation operation = SimpleFactory.createOperation("-");
        operation.setA(1);
        operation.setB(3);
        int result = operation.getResult();
        System.out.println(result);

    }
}
