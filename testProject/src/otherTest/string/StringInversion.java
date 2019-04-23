package otherTest.string;

public class StringInversion {
    public static void main(String[] args) {
        String str = "abcdefg";
        char[] chars = str.toCharArray();

        long ta = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            method1(chars);
        }
        long t1 = System.currentTimeMillis() - ta;
        System.out.println(t1);//   35 毫秒
//////////////////////////////////////////////
        long tb = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            method2(chars);
        }
        long t2 = System.currentTimeMillis() - tb;
        System.out.println(t2);//   2937 毫秒

    }
    private static void method1(char[] chars) {
        char[] temp = new char[1];
        for (int i = 0; i < (chars.length) / 2; i++) {
            temp[0] = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp[0];
        }
//        System.out.println(chars);
    }

    private static void method2(char[] chars) {
        String s = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            s = s.concat(chars[i] + "");
        }
//        System.out.println(s);
    }

}
