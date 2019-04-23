package otherTest.string;

import java.util.HashMap;

public class UseString {
    public static void main(String[] args) {

        String str = "diaufi,f2aifBux";
//        testContains(str,"uf");
//       testToCharArray(str);
//        testReplace(str,"i","");
//        testSplit(str);
//        testCharAt(str);a
//        testIndexOf(str);
//        testConcat(str,"heHe");
//        testCompareTo("bbb","bba");
//        testIntern(str);
//        testToLowerCase(str);
//        testToUpperCase(str);
//        testTrim(str);
    }

    /**
     * 测试字符串中是否包含某个子字符串
     * @param bigStr 长字符串
     * @param smallStr 短字符串
     */
    public static void testContains(String bigStr,String smallStr){
        boolean b = bigStr.contains(smallStr);
        System.out.println(b);
    }

    /**
     * 把字符串变成字符数组
     * @param string
     */
    public static void testToCharArray(String string){
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    /**
     * 替换字符串中的字符
     * @param string 原字符串
     * @param regex 被替换的字符
     * @param replacement 新的字符
     */
    public static void testReplace(String string,String regex,String replacement){
        String s = string.replaceAll(regex, replacement);
        System.out.println(s);
    }

    /**
     * 根据传入参数截取字符串
     * @param string
     */
    public static void testSplit(String string){
        String[] split = string.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }

    /**
     * 取字符串中第几个索引位置元素
     * @param string
     */
    public static void testCharAt(String string){
        char c = string.charAt(1);
        System.out.println(c);
    }

    /**
     * @param string "diaufi,f2aifBux"
     */
    public static void testIndexOf(String string){
//        int index = string.indexOf("u");//找到第一次出现的u元素的下标，找不到返回-1
//        int index = string.indexOf("i",3);//从第3个字符开始找，找到第一个i元素的下标
//        int index = string.indexOf(97);//找到第一次出现的哈希值为97（a）元素的下标
        int index = string.indexOf(97, 3);//从第3个字符开始找，找到第一次出现的哈希值为97（a）元素的下标
        System.out.println(index);
    }

    /**
     * 拼接字符串
     * @param string 原始字符串
     * @param more 新增的字符串
     */
    public static void testConcat(String string,String more){
        String concat = string.concat(more);
        System.out.println(concat);
    }

    /**
     * 比较俩个字符串的字典顺序
     * string 在前返回负数，在后返回正数
     * string-anotherString 返回具体数值
     * @param string
     * @param anotherString
     */
    public static void testCompareTo(String string,String anotherString){
        int i = string.compareTo(anotherString);
        System.out.println(i);
    }

//    public static void testIntern(String string){
//        String intern = string.intern();
//        System.out.println(intern);
//    }

    public static void testToLowerCase(String string){
        String s = string.toLowerCase();
        System.out.println(s);
    }

    public static void testToUpperCase(String string){
        String s = string.toUpperCase();
        System.out.println(s);
    }

    /**
     * 去掉字符串俩端的空格
     * @param string
     */
    public static void testTrim(String string){
        String concat1 = string.concat(" ");
        String concat = " ".concat(concat1);
        System.out.println(concat);
        String trim = concat.trim();
        System.out.println(trim);
    }

    private static void testStringXX() {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "dddxadadd";
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            boolean c = map.containsKey(aChar);
            if(!c){
                map.put(aChar,1);
            }else {
                Integer integer = map.get(aChar);
                integer++;
                map.put(aChar,integer);
            }
        }
    }


}
