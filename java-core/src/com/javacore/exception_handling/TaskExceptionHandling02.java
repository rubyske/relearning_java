package com.javacore.exception_handling;

import java.util.Scanner;

public class TaskExceptionHandling02 {
    static void cekNama(String nama){
        if (nama.isEmpty()){
            throw new IllegalArgumentException("Nama tidak ditemukan");
        } else {
            System.out.println("Nama :  " + nama);
        }
    }

    public static void main(String[] args) {
        cekNama("");
    }
}
