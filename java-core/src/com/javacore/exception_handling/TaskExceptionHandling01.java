package com.javacore.exception_handling;

import java.util.Scanner;

public class TaskExceptionHandling01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        try {
            int result = n / m;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
