package thread.wait_notify;

public class Boss implements Runnable {
    private BaoZi baoZi;

    public void setBaoZi(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (baoZi) {
                try {
                    if (baoZi.flag) {
                        baoZi.wait();
                    }
                    System.out.println("老板开始做包子...");
                    Thread.sleep(2000);
                    if (count % 2 == 0) {
                        baoZi.pi = "薄皮";
                        baoZi.xian = "三鲜";
                    } else {
                        baoZi.pi = "厚皮";
                        baoZi.xian = "大葱";
                    }
                    System.out.println(baoZi.pi + baoZi.xian + "包子做好了");
                    count++;
                    baoZi.flag =true;
                    baoZi.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
