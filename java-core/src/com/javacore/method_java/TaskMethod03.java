package com.javacore.method_java;

public class TaskMethod03 {
    /*
        Overload method luas untuk:
            - Luas persegi (int sisi)
            - Luas persegi panjang (int panjang, int lebar)
     */
    public static int luas (int sisi){
        return sisi * sisi;
    }

    public static int luas (int panjang, int lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        int sisiPersegi = 20;

        int resultLuasPersegi = luas(sisiPersegi);
        System.out.println(resultLuasPersegi);

        int panjangPersegi = 35;
        int lebarPersegi = 10;

        int resultLuasPersegiPanjang = luas(panjangPersegi, lebarPersegi);
        System.out.println(resultLuasPersegiPanjang);
    }

}
