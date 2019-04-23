package thread.wait_notify;

public class Client {

    public static void main(String[] args) {

        new Thread() {
            @Override
            public void run() {
                while (true){
                    synchronized (Client.class) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "：告诉老板要吃什么包子");
                            Client.class.notify();
                            Client.class.wait();
                            System.out.println(Thread.currentThread().getName() + "：开吃");
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true){
                    try {
                        System.out.println(Thread.currentThread().getName()+"：收到，开始做包子");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (Client.class) {
                        System.out.println(Thread.currentThread().getName() + "：包子做好了");
                        try {
                            Client.class.notify();
                            Client.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

    }
}
