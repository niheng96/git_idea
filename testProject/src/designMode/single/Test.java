package designMode.single;

public class Test {
    public static void main(String[] args) {
        Single6.INSTANCE.fun();

//        testSingle1();
//        testSingle2();
//        testSingle3();
    }

//    private static void testSingle1() {
//        new Thread() {
//            @Override
//            public void run() {
//                    Single instance = Single.getInstance();
//                    instance.getNum();
//            }
//        }.start();
//        new Thread() {
//            @Override
//            public void run() {
//                    Single instance1 = Single.getInstance();
//                    instance1.getNum();
//            }
//        }.start();
//    }
//    private static void testSingle2() {
//        new Thread() {
//            @Override
//            public void run() {
//                Single2 instance = Single2.getInstance();
//                instance.getNum();
//            }
//        }.start();
//        new Thread() {
//            @Override
//            public void run() {
//                Single2 instance1 = Single2.getInstance();
//                instance1.getNum();
//            }
//        }.start();
//    }
//    private static void testSingle3() {
//        new Thread() {
//            @Override
//            public void run() {
//                Single3 instance = Single3.getInstance();
//                instance.getNum();
//            }
//        }.start();
//        new Thread() {
//            @Override
//            public void run() {
//                Single3 instance1 = Single3.getInstance();
//                instance1.getNum();
//            }
//        }.start();
//    }
}
