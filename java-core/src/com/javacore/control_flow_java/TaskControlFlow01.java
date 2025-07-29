package com.javacore.control_flow_java;

public class TaskControlFlow01 {
    public static void main(String[] args) {
        int nilai = 101;

        if (nilai >= 90 && nilai < 100) {
            System.out.println("A");
        } else if (nilai < 90 && nilai > 75) {
            System.out.println("B");
        } else if (nilai < 75 && nilai > 60) {
            System.out.println("C");
        } else if (nilai < 60) {
            System.out.println("D");
        }  else {
            System.out.println("Nilai tidak valid");
        }
    }
}
