# 📘 02 - Struktur Dasar Program Java

## Struktur Dasar Program Java

Sebuah program Java minimal terdiri dari:

* Nama file Java
* Kelas utama (biasanya `public`)
* Method `main()` sebagai titik masuk eksekusi

### Contoh Sederhana

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Halo Dunia!");
    }
}
```

### Penjelasan:

| Baris Kode                               | Penjelasan                                                                    |
| ---------------------------------------- | ----------------------------------------------------------------------------- |
| `public class HelloWorld`                | Deklarasi kelas publik dengan nama `HelloWorld` (harus sama dengan nama file) |
| `public static void main(String[] args)` | Method utama, tempat eksekusi program dimulai                                 |
| `System.out.println(...)`                | Menampilkan teks ke console                                                   |

---

## Penjelasan Komponen

### 1. `class`

Java adalah bahasa berorientasi objek, semua kode harus berada dalam **class**.

```java
public class Contoh {
    // kode di sini
}
```

### 2. `main()` Method

```java
public static void main(String[] args)
```

* `public`: Bisa diakses dari luar class (dibutuhkan saat eksekusi)
* `static`: Bisa dijalankan tanpa membuat object
* `void`: Tidak mengembalikan nilai
* `String[] args`: Parameter untuk input dari command line

---

## Komentar dalam Java

| Tipe Komentar | Contoh                                     |
| ------------- | ------------------------------------------ |
| Single-line   | `// Ini komentar baris tunggal`            |
| Multi-line    | `/* Ini komentar lebih dari satu baris */` |

---

## Package di Java

### Apa Itu Package?

Package adalah cara untuk mengelompokkan class agar lebih terorganisir dan menghindari konflik nama.

### Cara Penggunaan:

```java
package com.badru.basicjava;

public class App {
    public static void main(String[] args) {
        System.out.println("Package aktif!");
    }
}
```

> ⛔ Catatan: Direktori project harus sesuai dengan nama package!
> Contoh: `com.badru.basicjava.App` harus berada dalam folder `/com/badru/basicjava/App.java`

---

## Struktur Direktori Project Sederhana

```
src/
└── com/
    └── badru/
        └── basicjava/
            └── HelloWorld.java
```

---

## Compile & Run Program

### Compile:

```bash
javac -d out src/com/badru/basicjava/HelloWorld.java
```

### Run:

```bash
java -cp out com.badru.basicjava.HelloWorld
```

---

## 🔥 Tips Pro

* Selalu pakai struktur package dari awal, biar terbiasa dengan skala proyek besar.
* Gunakan naming convention: **kecil semua untuk package**, **PascalCase untuk class**.
* Simpan file Java di dalam folder sesuai package-nya.

---

### 🚀 Lanjut?

> Materi selanjutnya: Tipe Data & Variabel 