package designMode.staticProxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println(this.getClass().getSimpleName() + "实体类的方法，实现了接口的抽象方法");
    }
}
