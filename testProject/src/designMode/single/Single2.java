package designMode.single;

/**
 * 线程安全的单例（懒汉式）
 */
public class Single2 {
    private static Single2 instance;
    private Single2 (){}
    public static Single2 getInstance(){
        if(instance == null){
            synchronized (Single2.class){
                if(instance ==null){
                    instance = new Single2();
                }
            }
        }
        return instance;
    }
}
