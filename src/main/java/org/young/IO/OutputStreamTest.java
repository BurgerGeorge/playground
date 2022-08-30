package org.young.IO;

import org.young.dao.Pet;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OutputStreamTest {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("some.txt")));
        Pet dog = new Pet("corgi", 3);
        oos.writeObject(dog);
        System.out.println("写出完成");
    }
}
