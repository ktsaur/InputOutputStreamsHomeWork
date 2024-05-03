package org.example;

import java.io.FileInputStream;
import java.io.IOException;

public class FourthTask {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("file.txt");
        // читаем первые 4 байта для получения длины сообщения
        int length = 0;
        for (int i = 0; i < 4; i++) {
            int byteValue = fis.read();
            length = byteValue;
        }

        //читаем и выводим сообщение
        byte[] messageBytes = new byte[length];
        String message = new String(messageBytes);
        System.out.println("Длина сообщения: " + length);
        System.out.println("Сообщение: " + message);
    }
}

