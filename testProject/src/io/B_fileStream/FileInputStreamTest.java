package io.B_fileStream;

import io.newFile.NewFile;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FileInputStreamTest {
    public static void main(String[] args) {
//        NewFile instance = NewFile.getInstance();

        String str = "safafds,ass";
//        String[] split = str.split(",",1);
        String substring = str.substring(1, 2);
        System.out.println(substring);
        str.charAt(1);//传入的字符串的索引，返回第几个char
        int a = str.indexOf('a');//传入的
        System.out.println(a);
        String replace = str.replace("f", "x");
        System.out.println(replace);
        str.replaceAll(""," ");
        boolean b1 = str.startsWith("a");//判断字符串是否以“a”开头
        boolean b2 = str.endsWith("");
        boolean contains = str.contains("");
        int aa = str.compareTo("aa");
        String concat = str.concat("");//拼接
        String trim = str.trim();//去开头和俩端空格

//        useMap2(str);

    }

//    private static Character useMap(String str) {
//
//        char[] chars = str.toCharArray();
//        for (char aChar : chars) {
//            if (!map.containsKey(aChar)) {
//                map.put(aChar, 1);
//            } else {
//                Integer num = map.get(aChar);
//                num++;
//                map.put(aChar,num);
//            }
//        }
//        Set<Character> keySet = map.keySet();
//        for (Character key : keySet) {
//            Integer integer = map.get(key);
//            System.out.println(key+":"+integer);
//        }
//    }
//
//    private static void useMap2(String str) {
//        Map<Character, Integer> map = new LinkedHashMap<>();
//        char[] chars = str.toCharArray();
//        for (char aChar : chars) {
//            if (!map.containsKey(aChar)) {
//                map.put(aChar, 1);
//            } else {
//                return;
//            }
//        }
//    }



}
