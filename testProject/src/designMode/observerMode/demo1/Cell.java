package designMode.observerMode.demo1;

import java.util.ArrayList;
import java.util.List;

public class Cell implements Observable {

    private List<Observer> observerList = new ArrayList<>();

    /**
     * 添加观察者
     * @param observer 观察者
     */
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 移除观察者
     * @param observer 观察者
     */
    @Override
    public void removeObserver(Observer observer) {
        if (observerList.contains(observer)){
            observerList.remove(observer);
        }else {
            System.out.println("观察者集合中没有"+observer.getClass().getSimpleName()+"对象");
        }
    }

    /**
     * 通知每个观察者
     * @param string 被观察者的变化数据
     */
    @Override
    public void notifyObserver(String string) {
        if (observerList.size()==0){
            System.out.println("没有观察者观察"+this.getClass().getSimpleName());
        }else {
            for (Observer observer : observerList) {
                observer.update(string);
            }
        }
    }
}
