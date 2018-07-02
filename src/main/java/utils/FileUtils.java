package utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class FileUtils {

    public static List<String> getFiles(String filepath, List<String> fileList) throws IOException {
        File file = new File(filepath);
        File[] subFiles = file.listFiles();
        if (subFiles == null) return fileList;
        for (File subFile : subFiles) {
            if (subFile.isDirectory()) {
                getFiles(subFile.getAbsolutePath(), fileList);
            } else {
                fileList.add(subFile.getAbsolutePath());
            }
        }
        return fileList;
    }

    public static boolean writeFile(String path, String fileContent) {
        try {
            BufferedOutputStream Buff = new BufferedOutputStream(new FileOutputStream(new File(path)));
            Buff.write(fileContent.getBytes());
            Buff.flush();
            Buff.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}