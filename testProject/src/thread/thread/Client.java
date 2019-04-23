package thread.thread;

public class Client {
    public static void main(String[] args) {
        test1();
//        test2();
//        noNameClass();
    }
    private static void test2(){
        Thread thread = new Thread(new RunnableImpl());
        thread.start();
//        ifor(20);

    }
    private static void test1() {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread2.start();
        System.out.println(Thread.currentThread().getName());
    }

    private static void noNameClass(){
        /*MyThread myThread = */new Thread(){
            @Override
            public void run() {
                ifor(10);
            }
        }.start();
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                ifor(10);
            }
        };
        new Thread(runnable).start();
    }

    private static void ifor(int j){
        for (int i = 0; i < j; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
