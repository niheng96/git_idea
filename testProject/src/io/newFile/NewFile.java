package io.newFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class NewFile {
    private static NewFile instance;

    private File file;

    public NewFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public File createChildFile(String path) {
        if (instance.getFile().isFile()) {
            throw new RuntimeException("文件已经存在，无须重复创建");
        }
        File file = new File(instance.getFile(), path);
        try {
            if (file.isFile()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public void setFile(File file) {
        this.file = file;
        instance.file = file;
    }

    //默认路径创建文件夹
    public static NewFile getInstance() {
        if (instance == null) {
            synchronized (NewFile.class) {
                if (instance == null) {
                    try {
                        File file = new File("D:\\projectData\\testFile");
                        file.createNewFile();
                        instance = new NewFile(file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return instance;
    }

    //根据路径创建文件或文件夹
    public static NewFile getInstance(String path) {
        if (instance == null) {
            synchronized (NewFile.class) {
                if (instance == null) {
                    try {
                        File file = new File(path);
                        file.createNewFile();
                        instance = new NewFile(file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return instance;
    }



}
