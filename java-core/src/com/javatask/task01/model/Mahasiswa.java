package com.javatask.task01.model;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int umur;
    private double ipk;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim, int umur, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }


    public void sapa(){
        System.out.println("Hallo, perkenalkan nama saya " + getNama());
    }
}
