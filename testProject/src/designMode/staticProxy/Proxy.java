package designMode.staticProxy;

public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        System.out.println("我是" + this.getClass().getSimpleName());
        realSubject.request();
    }
}
