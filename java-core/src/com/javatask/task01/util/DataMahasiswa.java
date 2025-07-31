package com.javatask.task01.util;

import com.javatask.task01.model.Mahasiswa;

public class DataMahasiswa {
    public boolean isLulus(double ipk) {
        return ipk >= 2.75 && ipk <= 4.00;
    }

    public void cetakMahasiswa(Mahasiswa mahasiswa) {
        System.out.println("Nama :  " + mahasiswa.getNama());
        System.out.println("umur :  " + mahasiswa.getUmur());
        System.out.println("Nik :  " + mahasiswa.getNim());
        System.out.println("Ipk :  " + mahasiswa.getIpk());

        if (isLulus(mahasiswa.getIpk())) {
            System.out.println("Mahasiswa Lulus");
        } else {
            System.out.println("Mahasiswa tidak lulus");
        }
    }

    public void cetakMahasiswa(String nama, int umur) {
        System.out.println("Nama :  " + nama);
        System.out.println("Umur :  " + umur);
    }
}
