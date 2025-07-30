package com.javacore.oop_java.task_oop_02;

public class TaskOop02 {
    String nama;
    int umur;

    public TaskOop02(String namaBaru, int umurBaru){
        nama = namaBaru;
        umur = umurBaru;
    }

    public static void main(String[] args) {
        TaskOop02 mahasiswa = new TaskOop02("Kamal", 23);
        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.umur);
    }
}
