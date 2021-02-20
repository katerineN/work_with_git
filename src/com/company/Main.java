package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int sum = 0;
        int mindif = 20001;
        try (BufferedReader br =
                     new BufferedReader(new FileReader("C:\\Users\\катя\\Desktop\\27-A_demo.txt"))) {
            //чтение построчно
            String text = null;
            while ((text = br.readLine()) != null) {
                String[] s = text.split("  ");
                if (s.length == 1) continue;
                int x = Integer.parseInt(s[0]);
                int y = Integer.parseInt(s[1]);
                if (x > y) sum += x;
                else sum += y;
                if ((abs(x - y) < mindif) && (abs(x - y) % 3 != 0))
                    mindif = abs(x - y);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        if (sum % 3 != 0) System.out.println(sum);
        else System.out.println(sum - mindif);
        System.out.println("hello");
    }
}
