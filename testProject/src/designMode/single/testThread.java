package designMode.single;

public class testThread {
    private int i = 10;

    public void getNum() {
        synchronized (this) {
            while (i > 0) {
                i--;
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                try {
                    this.wait(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "票卖完了");
        }
    }
}
