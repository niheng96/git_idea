package designMode.single;

/**
 * 饿汉式（静态常量）
 */
public class Single3 {
    private static final Single3 instance = new Single3();

    private Single3(){}

    public static Single3 getInstance(){
        return instance;
    }
}

