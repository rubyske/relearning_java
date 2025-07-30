# 📘 08 - Array & Collection Dasar di Java

Array dan Collection digunakan untuk menyimpan banyak data dalam satu variabel. Cocok banget buat kerjaan yang butuh ngolah data dalam jumlah besar.

---

## 1. Array

Array adalah struktur data statis (ukuran tetap) yang menyimpan elemen dengan tipe data yang sama.

### Deklarasi dan Inisialisasi:

```java
int[] angka = new int[5];
angka[0] = 10;
angka[1] = 20;
```

Atau langsung:

```java
int[] angka = {10, 20, 30, 40};
```

### Akses Elemen:

```java
System.out.println(angka[2]); // Output: 30
```

### Looping Array:

```java
for (int i = 0; i < angka.length; i++) {
    System.out.println(angka[i]);
}

for (int a : angka) {
    System.out.println(a);
}
```

> ❗ Index dimulai dari 0. Waspadai ArrayIndexOutOfBoundsException!

---

## 2. Multidimensional Array

Array di dalam array.

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

System.out.println(matrix[1][2]); // 6
```

---

## 3. Collection (Java Collections Framework)

Collection adalah versi dinamis dari array. Ukurannya bisa berubah.

### a. `ArrayList`

```java
import java.util.ArrayList;

ArrayList<String> daftarNama = new ArrayList<>();
daftarNama.add("Badru");
daftarNama.add("Kamal");
System.out.println(daftarNama.get(0));
```

### b. `HashMap`

Map menyimpan pasangan key-value.

```java
import java.util.HashMap;

HashMap<String, Integer> umur = new HashMap<>();
umur.put("Badru", 21);
System.out.println(umur.get("Badru")); // 21
```

---

## 4. Perbedaan Array vs Collection

| Fitur        | Array        | Collection (`ArrayList`)      |
| ------------ | ------------ | ----------------------------- |
| Ukuran       | Tetap        | Dinamis                       |
| Tipe Data    | Satu jenis   | Bisa generic (`<T>`)          |
| Method Bantu | Tidak banyak | Banyak (`add`, `remove`, dll) |

---

## 🔥 Tips Pro

* Gunakan `Array` kalau ukurannya sudah pasti & performa penting
* Gunakan `ArrayList` saat data bersifat dinamis
* Gunakan `HashMap` kalau butuh lookup berdasarkan key

---

## ✅ Task Wajib

1. **Buat array** bertipe `int` berisi 5 angka, lalu tampilkan semua elemen
2. **Buat dan tampilkan** array 2 dimensi bertipe `String` dengan nama kelas dan siswa
3. **Gunakan ArrayList** untuk menyimpan daftar buah, lalu tampilkan isinya dengan `for-each`
4. **Buat HashMap** untuk menyimpan data `nama` dan `usia`, lalu tampilkan usia berdasarkan nama

---

### 🚀 Lanjut?

> Materi selanjutnya: Exception Handling → `09-exception-handling/README.md`
