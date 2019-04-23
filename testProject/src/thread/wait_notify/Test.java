package thread.wait_notify;

public class Test {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        Custom custom = new Custom("张三");
        Boss boss = new Boss();
        boss.setBaoZi(baoZi);
        custom.setBaoZi(baoZi);
        new Thread(boss).start();
        new Thread(custom).start();
    }
}
