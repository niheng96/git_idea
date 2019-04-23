package io.A_file;

import java.io.File;

public class GetDir {
    public static void main(String[] args) {
        String path="D:\\projectData\\testFile";
        File file = new File(path);
        getDir(file);

    }
    private static void getDir(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                System.out.println(file1.getPath()+",length:"+file1.length());
            }else {
                System.out.println(file1.getPath());
                getDir(file1);
            }
        }
    }
}
