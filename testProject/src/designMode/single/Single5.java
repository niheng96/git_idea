package designMode.single;

/**
 * 静态内部类
 */
public class Single5 {
    private static Single5 tInstance;
    private static class newSingle{
        private static final Single5 INSTANCE = new Single5();
    }
    public static Single5 getInstance(){
        return newSingle.INSTANCE;
    }
}
