package io.newFile;

import java.io.File;

public class FileUtil {

    /**
     * 创建单例的文件
     *
     * @param filePath 文件的绝对路径
     * @return 文件
     */
    public static File createFile(String filePath) {
        if (filePath.equals("")) {
            throw new RuntimeException("路径出错");
        }
        return NewFile.getInstance(filePath).getFile();
    }

    /**
     * 创建默认路径下的文件夹
     *
     * @param filePath 文件的相对路径
     * @return 文件
     */
    public static File createChildFile(String filePath) {
        return NewFile.getInstance().createChildFile(filePath);
    }

    /**
     * 创建单例的目录结构
     *
     * @param directory 目录
     * @param filePath  文件相对路径
     * @return 文件
     */
    public static File createChileFile(String directory, String filePath) {
        if (directory.contains(".")) {
            throw new RuntimeException("目录机构不符合规范");
        }
        return NewFile.getInstance(directory).createChildFile(filePath);
    }

}