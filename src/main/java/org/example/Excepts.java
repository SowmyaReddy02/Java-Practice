package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Excepts {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("c:\\demo.text");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
        System.out.println("kk");
    }
}
