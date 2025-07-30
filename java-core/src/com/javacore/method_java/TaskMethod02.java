package com.javacore.method_java;

public class TaskMethod02 {
    // Buat method perkalian(int a, int b) yang mengembalikan hasil a × b

    public static int multiplication(int a, int b){
        return a * b;
    }


    public static void main(String[] args) {
        int result = multiplication(2, 3);
        System.out.println(result);
    }
}
