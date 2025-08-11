package com.javatask.task02.perpustakaan;

import com.javatask.task02.perpustakaan.model.Anggota;
import com.javatask.task02.perpustakaan.model.Buku;
import com.javatask.task02.perpustakaan.service.PerpustakanService;
import com.javatask.task02.perpustakaan.util.InputUtil;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        PerpustakanService service = new PerpustakanService();


        System.out.println("==== Sistem Perpustakaan ====");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Tambah Anggota");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Kembalikan Buku");
        System.out.println("5. Lihat Data Buku");
        System.out.println("6. Lihat Data Anggota");
        System.out.println("0. Keluar");
        System.out.print(" Pilih menu : ");

        Scanner sc = new Scanner(System.in);
        String menu = sc.nextLine();int pilihan = InputUtil.inputInt("Pilih menu");
        switch (pilihan) {
            case 1:
                String judul = InputUtil.inputString("Judul Buku");
                String penulis = InputUtil.inputString("Penulis");
                int stok = InputUtil.inputInt("Stok");
                service.tambahBuku(new Buku(judul, penulis, stok));
                break;
            case 2:
                String nama = InputUtil.inputString("Nama Anggota");
                String id = InputUtil.inputString("ID Anggota");
                service.tambahAnggota(new Anggota(nama, id));
                break;
            case 3:
                String judulPinjam = InputUtil.inputString("Judul Buku");
                String idPinjam = InputUtil.inputString("ID Anggota");
                service.pinjamBuku(judulPinjam, idPinjam);
                break;
            case 4:
                String judulKembali = InputUtil.inputString("Judul Buku");
                String idKembali = InputUtil.inputString("ID Anggota");
                service.kembalikanBuku(judulKembali, idKembali);
                break;
            case 5:
                service.tampilkanDaftarBuku();
                break;
            case 6:
                service.tampilkanDaftarAnggota();
                break;
            case 0:
                System.out.println("Terima kasih!");
                return;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}