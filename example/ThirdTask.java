package org.example;

import java.io.*;

public class ThirdTask {
    public static void main(String[] args) throws IOException {
        String mes = "hello world";
        OutputStream os = new FileOutputStream("three.txt");
        DataOutputStream dos = new DataOutputStream(os); //Классы DataOutputStream и DataInputStream
        //позволяют записывать и считывать данные примитивных типов.

        byte[] b = mes.getBytes();

        dos.writeInt(b.length);

        for (int n : b) {
            dos.write(n);
        }
        dos.flush();

        System.out.println("всё");

    }
}
