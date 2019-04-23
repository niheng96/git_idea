package designMode.observerMode.demo2;

import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        //创建被观察者对象
        Mouse observable = new Mouse();
        //创建观察者对象
        Observer observer = new Doctor();
        //添加观察者
        observable.addObserver(observer);
        //调用notifyObservers方法之前,必须先调用setChanged()方法
        observable.setChanged();
        //通知所有的观察者
        observable.notifyObservers("hahaha");
    }
}
