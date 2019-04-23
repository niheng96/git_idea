package designMode.observerMode.demo1;

/**
 * 被观察者
 */
public interface Observable {
    /**
     * 添加观察者
     * @param observer 观察者
     */
    void addObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     * @param string 被观察者的变化数据
     */
    void notifyObserver(String string);

}
