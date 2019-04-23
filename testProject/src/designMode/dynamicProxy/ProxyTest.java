package designMode.dynamicProxy;

public class ProxyTest {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        Dog dog = new Dog();
        proxyFactory.setTarget(dog);//先将被代理的类注册到代理工厂
//        Cat cat = new Cat();
//        proxyFactory.setTarget(cat);//先将被代理的类注册到代理工厂
        Pet pet = (Pet) proxyFactory.createProxy();//创建代理
        pet.say();
        dog.eat();
    }

}