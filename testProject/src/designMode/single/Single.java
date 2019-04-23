package designMode.single;

/**
 * 线程不安全（懒汉式）
 */
public class Single {
    private static Single instance;
    public static Single getInstance(){
        if(instance == null){
            instance = new Single();
        }
        return instance;
    }

}
