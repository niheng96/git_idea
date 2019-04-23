package designMode.dynamicProxy;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("喵喵喵");
    }
    public void eat(){
        System.out.println("吃老鼠");
    }
}
