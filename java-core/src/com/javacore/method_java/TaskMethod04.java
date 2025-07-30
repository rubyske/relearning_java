package com.javacore.method_java;

import java.util.Scanner;

public class TaskMethod04 {
    // Buat method isGenap(int angka) yang mengembalikan true jika angka genap, false jika ganjil

    public static boolean isGenap (int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i <= a; i++) {
            boolean result = isGenap(i);
            System.out.println(i + " = " + result);
        }
    }
}
