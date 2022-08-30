package org.young.IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputStreamTest {
    public static void main(String[] args) throws Exception {
//        try (InputStream fis = Files.newInputStream(Paths.get(
//                "D:\\demos\\playground\\src\\main\\java\\org\\young\\something.txt"))) {
//            System.out.println("可读取字节数：" + fis.available());
//
//            System.out.println("读取到的文件内容如下");
//            int content;
//            while ((content = fis.read()) != -1) {
//                System.out.print((char) content);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        BufferedInputStream bif = new BufferedInputStream(Files.newInputStream(Paths.get(
                "D:\\demos\\playground\\src\\main\\java\\org\\young\\something.txt")));

    }
}
