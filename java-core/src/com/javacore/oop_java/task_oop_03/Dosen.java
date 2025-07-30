package com.javacore.oop_java.task_oop_03;

import com.javacore.oop_java.task_oop_01.Mahasiswa;

public class Dosen extends Mahasiswa {
    @Override
    public void mengajar() {
        System.out.println("Mengajar di kelas sebagai dosen");
    }

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.mengajar();
    }
}
