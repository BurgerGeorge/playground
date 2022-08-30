package org.young.IO;

import java.io.FileReader;
import java.io.IOException;

public class InputReaderTest {
    public static void main(String[] args) {
        // InputStreamReader extends Reader
        // FileReader extends InputStreamReader

        try (FileReader fr = new FileReader(
                "D:\\demos\\playground\\src\\main\\java\\org\\young\\IO\\something.txt")) {
            System.out.println("文件内容如下---------");
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
