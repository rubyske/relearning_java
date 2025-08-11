package com.javatask.task02.perpustakaan.service;

import com.javatask.task02.perpustakaan.model.Anggota;
import com.javatask.task02.perpustakaan.model.Buku;

import java.util.ArrayList;
import java.util.List;

public class PerpustakanService {
    private List<Buku> daftarBuku = new ArrayList<>();
    private List<Anggota> daftarAnggota = new ArrayList<>();

    // Tambah Buku
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan");
    }

    // Tambah Anggota
    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
        System.out.println("Anggota berhasil ditambahkan");
    }

    // Pinjam Buku
    public void pinjamBuku(String judul, String idAnggota) {
        Anggota anggota = cariAnggota(idAnggota);
        if (anggota == null) {
            System.out.println("Anggota tidak ditemukan !");
            return;
        }

        Buku buku = cariBuku(judul);
        if (buku == null) {
            System.out.println("Buku tidak Ditemukan !");
            return;
        }

        if (buku.getStok() > 0) {
            buku.setStok(buku.getStok() - 1);
            System.out.println(anggota.getNama() + " meminjam buku " + buku.getJudul());
        } else {
            System.out.println("Stok buku habis");
        }
    }

    // Kembalikan Buku
    public void kembalikanBuku(String judul, String idAnggota) {
        Anggota anggota = cariAnggota(idAnggota);
        if (anggota == null) {
            System.out.println("Anggota tidak ditemukan !");
            return;
        }

        Buku buku = cariBuku(judul);
        if (buku == null) {
            System.out.println("Buku tidak Ditemukan !");
            return;
        }

        buku.setStok(buku.getStok() + 1);
        System.out.println(anggota.getNama() + " mengembalikan buku " + buku.getJudul());
    }

    public void tampilkanDaftarBuku() {
        System.out.println("=== Daftar Buku ===");
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku.");
        } else {
            daftarBuku.forEach(System.out::println);
        }
    }

    public void tampilkanDaftarAnggota() {
        System.out.println("=== Daftar Anggota ===");
        if (daftarAnggota.isEmpty()) {
            System.out.println("Tidak ada anggota.");
        } else {
            daftarAnggota.forEach(System.out::println);
        }
    }


    private Anggota cariAnggota(String idAnggota) {
        for (Anggota anggota : daftarAnggota) {
            if (anggota.getId().equals(idAnggota)) {
                return anggota;
            }
        }
        return null;
    }

    private Buku cariBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equals(judul)) {
                return buku;
            }
        }
        return null;
    }
}
