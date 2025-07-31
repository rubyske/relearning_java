package com.javacore.exception_handling;

public class TaskExceptionHandling03 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("done");
        }
    }
}
