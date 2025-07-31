package com.javatask.task01.model;

public class Dosen extends Mahasiswa {
    private String nip;
    private String mataKuliah;

    public Dosen(String nama,  String nip, String mataKuliah) {
        super.setNama(nama);
        this.nip = nip;
        this.mataKuliah = mataKuliah;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajar(){
        System.out.println("saya bernama " + getNama() + "sedang mmengajar mata kuliah : " + getMataKuliah());
    }
}
