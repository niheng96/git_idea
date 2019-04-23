package designMode.single;

/**
 * 饿汉式（静态代码块）
 */
public class Single4 {
    private static Single4 instance;
    static {
        instance = new Single4();
    }
    public static Single4 getInstance(){
        return instance;
    }
}
