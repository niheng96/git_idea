package otherTest.math;

import java.math.BigDecimal;

public class DoubleTest {
    public static void main(String[] args) {
        test3();
    }

    private static void test1() {
        double a = 2.0;
        double b = 1.1;
        double result = a - b;
        System.out.println(result);
    }

    private static void test2() {
        BigDecimal bd1 = new BigDecimal("2.0");
        BigDecimal bd2 = new BigDecimal("1.1");
        System.out.println(bd1.subtract(bd2).doubleValue());
    }

    private static void test3() {
        double a = 100;//初始高度
        double l = 100;//总路程
        double temp = 0;//第i次反弹高度
        for (int i = 0; i < 10; i++) {
            temp = a / 2;
            l += temp;
            a /= 2;
        }
        System.out.println(l);
        System.out.println(temp);
    }

}
