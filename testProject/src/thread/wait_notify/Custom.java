package thread.wait_notify;

import java.util.concurrent.locks.ReentrantLock;

public class Custom implements Runnable {
    private BaoZi baoZi;
    private String name;
    private ReentrantLock l;

    public Custom(String name) {
        this.name = name;
    }

    public void setBaoZi(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {

            synchronized (baoZi) {
                try {
//                    l.lock();
                    if (!baoZi.flag) {
                        System.out.println(name + "告诉老板要吃包子");
                        baoZi.wait();
                    }
                    System.out.println(name + "开始吃包子");
                    baoZi.flag = false;
                    System.out.println("----------------");
                    baoZi.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }/*finally {
                    l.unlock();
                }*/
            }
        }
    }
}
