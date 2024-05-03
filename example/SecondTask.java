package org.example;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        String[] str = {"даадиддиии"}; //д - 4, а - 2, и - 4
        OutputStream stream = new FileOutputStream("file.txt");
        for (String s: str) {
            stream.write(s.getBytes());
        }
        stream.flush();

        FileReader file = new FileReader("file.txt");
        Map<Character, Integer> map = new HashMap<>();
        int n;
        while((n = file.read()) != -1) {
            if(map.containsKey((char) n)) {
                int count = map.get((char) n);
                map.put((char) n, count + 1);
            }
            else {
                map.put((char) n, 1);
            }
        }

        for(Character keys: map.keySet()){
            System.out.println(keys +  ": " + map.get(keys));
        }

    }
}
