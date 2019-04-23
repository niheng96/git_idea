package io.A_file;

import java.io.File;
import java.io.FileFilter;

public class TestFilter {
    public static void main(String[] args) {
        String path = "D:\\projectData\\testFile";
        File file = new File(path);
        useFilter(file);
    }

    public static void useFilter(File file){
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getAbsolutePath().endsWith(".txt") || pathname.isDirectory();
            }
        });
        for (File file1 : files) {
            if(file1.isFile()) {
                System.out.println(file1);
            }else {
                useFilter(file1);
            }
        }
    }
}
