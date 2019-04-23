package io.A_file;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        String path="D:\\projectData\\testFile";
        File file = new File(path);
//        getMoreFile();

        String name = file.getName();
        System.out.println(name);

        String s = file.toString();
        System.out.println(s);

//        long length = file.length();
//        System.out.println(length);

//        createNewFile(file);
//        System.out.println("exists:"+file.exists());
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());


    }

    private static void createNewFile(File file) {
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getMoreFile() {
        String parent = "D:\\projectData";
        String child = "b.txt";
        File file1 = new File(parent, child);

        File file2 = new File(parent);
        File file3 = new File(file2, "c.txt");
    }


}
