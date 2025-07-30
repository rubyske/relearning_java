package com.javacore.array_collection;

import java.util.ArrayList;

public class TaskArrayCollection03 {
    public static void main(String[] args) {
        ArrayList<String> namaBuah = new ArrayList<>();
        namaBuah.add("Anggur");
        namaBuah.add("Semangka");
        namaBuah.add("Melon");

        for (String s : namaBuah) {
            System.out.println(s);
        }
    }
}
