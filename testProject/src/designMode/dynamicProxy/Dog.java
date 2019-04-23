package designMode.dynamicProxy;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("汪汪汪");
    }
    public void eat(){
        System.out.println("吃骨头");
    }
}
