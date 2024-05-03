package org.example;

import java.io.*;


public class FirstTask {
    public static void main(String[] args) throws IOException {

        FileInputStream f1 = new FileInputStream("f1.txt");
        FileInputStream f2 = new FileInputStream("f2.txt");

        FileOutputStream fileResult = new FileOutputStream("fileResult.txt");

        Merge(fileResult, f1, f2);
    }

    public static void Merge(FileOutputStream fileResult, FileInputStream f1, FileInputStream f2) throws IOException {
        int n;
        while((n = f1.read()) != -1) {
            fileResult.write(n);
        }
        while((n = f2.read()) != -1) {
            fileResult.write(n);
        }
    }
}
