package io.A_file;

import java.io.File;

public class GetTxt {
    public static void main(String[] args) {
        String path = "D:\\projectData\\testFile";
        File file = new File(path);
        getTxt(file);
    }
    public static void getTxt(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                String s = file1.getAbsolutePath();
                if(s.endsWith(".txt")){
                    System.out.println(s+"，length:"+file1.length()+" byte");
                }
            }else {
                getTxt(file1);
            }
        }
    }
}
