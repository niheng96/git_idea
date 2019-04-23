package designMode.staticFactory;

public class SimpleFactory {
    public static Operation createOperation(String operation) {
        Operation op = null;
        switch (operation) {
            case "+":
                op = new Add();
                break;
            case "-":
                op = new Sub();
                break;
        }
        return op;
    }

}
