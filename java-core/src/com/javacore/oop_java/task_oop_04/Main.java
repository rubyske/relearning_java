package com.javacore.oop_java.task_oop_04;

class Hewan {
    void suaraHewan(){
        System.out.println("suara hewan");
    }
}

class Anjing extends Hewan{
    @Override
    void suaraHewan() {
        System.out.println("ASYIAPPPPP");
    }
}

class Kucing extends Hewan{
    @Override
    void suaraHewan() {
        System.out.println("Peler gua gatel");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Hewan hAnjing = new Anjing();
        Hewan hKucing = new Kucing();
        hewan.suaraHewan();
        hAnjing.suaraHewan();
        hKucing.suaraHewan();
    }
}


