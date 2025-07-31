package com.javatask.task01;

import com.javatask.task01.model.Dosen;
import com.javatask.task01.model.Mahasiswa;
import com.javatask.task01.util.DataMahasiswa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        HashMap<String, String> dosenMap = new HashMap<>();
        DataMahasiswa dataMahasiswa = new DataMahasiswa();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistem Data Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Semua Mahasiswa");
            System.out.println("3. Tambah Dosen");
            System.out.println("4. Lihat Semua Dosen");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    listMahasiswa.add(new Mahasiswa(nama, nim, umur, ipk));
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                }
                case 2 -> {
                    if (listMahasiswa.isEmpty()) {
                        System.out.println("Belum ada data mahasiswa.");
                    } else {
                        for (Mahasiswa m : listMahasiswa) {
                            dataMahasiswa.cetakMahasiswa(m);
                            System.out.println("----------------------");
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("NIP: ");
                    String nip = sc.nextLine();
                    System.out.print("Mata Kuliah: ");
                    String mk = sc.nextLine();
                    Dosen d = new Dosen(nama, nip, mk);
                    dosenMap.put(d.getNama(), d.getMataKuliah());
                    System.out.println("Dosen berhasil ditambahkan!");
                }
                case 4 -> {
                    if (dosenMap.isEmpty()) {
                        System.out.println("Belum ada data dosen.");
                    } else {
                        for (String nama : dosenMap.keySet()) {
                            System.out.println("Dosen: " + nama + " | Mata Kuliah: " + dosenMap.get(nama));
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Terima kasih!");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
