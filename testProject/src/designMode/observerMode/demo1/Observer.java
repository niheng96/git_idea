package designMode.observerMode.demo1;

/**
 * 观察者
 */
public interface Observer {
    /**
     * 获得被观察者的变化
     * @param string 被观察者的变化
     */
    void update(String string);
}
