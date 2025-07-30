# 📘 07 - OOP (Object-Oriented Programming) di Java

Java adalah bahasa pemrograman berbasis objek. OOP membuat program lebih modular, terstruktur, dan mudah di-maintain.

---

## 1. Konsep Dasar OOP

Ada 4 pilar utama dalam OOP:

1. **Encapsulation (Enkapsulasi)**: Menyembunyikan detail internal dan hanya menampilkan apa yang perlu ke luar.
2. **Abstraction (Abstraksi)**: Menyederhanakan kompleksitas dengan hanya menunjukkan fitur penting.
3. **Inheritance (Pewarisan)**: Reuse kode dari class lain (parent → child).
4. **Polymorphism (Polimorfisme)**: Satu interface, banyak implementasi (bisa override atau overload method).

---

## 2. Class dan Object

### Membuat class:

```java
public class Mahasiswa {
    String nama;
    int umur;

    void sapa() {
        System.out.println("Halo, nama saya " + nama);
    }
}
```

### Membuat object:

```java
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Badru";
        mhs.umur = 21;
        mhs.sapa();
    }
}
```

---

## 3. Constructor

Method khusus yang dipanggil saat objek dibuat.

```java
public Mahasiswa(String namaBaru, int umurBaru) {
    nama = namaBaru;
    umur = umurBaru;
}
```

---

## 4. Enkapsulasi (Encapsulation)

Gunakan `private` + `getter` & `setter`:

```java
public class Mahasiswa {
    private String nama;

    public void setNama(String n) {
        nama = n;
    }

    public String getNama() {
        return nama;
    }
}
```

---

## 5. Inheritance (Pewarisan)

```java
public class Dosen extends Mahasiswa {
    String nip;

    void mengajar() {
        System.out.println("Dosen sedang mengajar");
    }
}
```

---

## 6. Polymorphism

### a. Overriding

```java
class Hewan {
    void suara() {
        System.out.println("Suara hewan umum");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong");
    }
}
```

### b. Overloading

Method dengan nama sama tapi parameter berbeda (lihat materi method).

---

## 🔥 Tips Pro

* Buat class reusable, hindari duplikasi logic
* Gunakan access modifier (`public`, `private`, `protected`) dengan bijak
* Favor composition over inheritance

---

## ✅ Task Wajib

1. **Buat class** `Mahasiswa` dengan properti `nama` dan `umur` serta method `sapa()`
2. **Tambahkan constructor** untuk inisialisasi data
3. **Buat class** `Dosen` yang mewarisi `Mahasiswa` dan punya method `mengajar()`
4. **Implementasikan** method `suara()` dalam class `Hewan`, lalu override di class `Anjing` dan `Kucing`
5. **Gunakan** enkapsulasi di salah satu class menggunakan `private`, `getter`, dan `setter`

---

### 🚀 Lanjut?

> Materi selanjutnya: Array & Collection Dasar → `08-array-collection/README.md`
