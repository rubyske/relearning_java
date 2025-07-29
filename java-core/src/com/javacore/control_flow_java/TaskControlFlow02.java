package com.javacore.control_flow_java;

public class TaskControlFlow02 {
    public static void main(String[] args) {
        int nilai = 20;

        System.out.println("Mengambil bilangan Genap dengan For");
        for (int i = 0; i <= nilai; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Mengambil bilangan Genap dengan While");
        while (nilai > 0) {
            if (nilai % 2 == 0) {
                System.out.println(nilai);
            }
            nilai--;
        }
    }
}
