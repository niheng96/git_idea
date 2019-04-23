package io.B_fileStream;

import io.newFile.FileUtil;
import java.io.File;
import java.io.FileOutputStream;

public class FileOutStreamTest {
    public static void main(String[] args) {

//        File file = FileUtil.createChildFile("d.txt");
//        File file = FileUtil.createChileFile("D:\\projectData\\testFile", "sha.txt");
//        File file = FileUtil.createFile("D:\\projectData\\testFile\\hehe.txt");
        File file = FileUtil.createFile("");
//        File file = FileUtil.createChileFile("D:\\projectData\\testFile","shabi.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file,true);//true表示是否追加写
//            String str = "java和大数据";

            String str2 = "我爱我的祖国";
            fos.write(str2.getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}