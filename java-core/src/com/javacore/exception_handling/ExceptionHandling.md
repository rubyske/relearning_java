# 📘 09 - Exception Handling di Java

Error di Java bisa muncul saat **compile-time** atau **runtime**. Exception Handling adalah teknik untuk menangani error agar program tetap berjalan dengan aman dan tidak crash tiba-tiba.

---

## 1. Apa itu Exception?

Exception = kejadian tidak normal yang terjadi saat program berjalan (runtime error).

Contoh:

```java
int x = 10 / 0; // ArithmeticException
```

---

## 2. Struktur Try-Catch

Digunakan untuk menangani exception saat terjadi error.

```java
try {
    int hasil = 10 / 0;
    System.out.println(hasil);
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
}
```

### Alur:

* `try` → tempat kode yang mungkin error
* `catch` → tempat penanganan error
* `e.getMessage()` → untuk melihat pesan error

---

## 3. Multiple Catch

Tangani beberapa tipe error sekaligus:

```java
try {
    String teks = null;
    System.out.println(teks.length());
} catch (NullPointerException e) {
    System.out.println("Null error!");
} catch (Exception e) {
    System.out.println("Error umum: " + e.getMessage());
}
```

---

## 4. Finally

Blok yang **selalu dijalankan**, baik ada error atau tidak.

```java
try {
    int[] arr = new int[2];
    System.out.println(arr[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index out of range!");
} finally {
    System.out.println("Selesai proses array");
}
```

---

## 5. Throw (Manual Error)

Digunakan untuk melempar exception secara manual.

```java
public void cekUmur(int umur) {
    if (umur < 17) {
        throw new IllegalArgumentException("Umur minimal 17 tahun");
    }
}
```

---

## 6. Throws (Deklarasi Exception)

Memberi tahu bahwa method bisa menghasilkan exception.

```java
public void bacaFile(String path) throws IOException {
    // kode baca file di sini
}
```

> Digunakan untuk exception yang harus ditangani seperti `IOException`, `SQLException`, dll

---

## 🔥 Tips Pro

* Tangani exception spesifik dulu sebelum yang umum (`Exception`)
* Jangan kosongin blok `catch {}`
* Gunakan log error untuk debugging
* Jangan overuse `try-catch` di setiap baris — gunakan dengan bijak

---

## ✅ Task Wajib

1. Buat program pembagi angka dengan input dua integer:

    * Tangani `ArithmeticException` jika pembagian nol
2. Buat method `cekNama(String nama)`:

    * Lempar `IllegalArgumentException` jika nama kosong
3. Buat array dengan 3 elemen dan coba akses index ke-5:

    * Tangani `ArrayIndexOutOfBoundsException` dan gunakan `finally`

---

### 🚀 Lanjut?

> Materi selanjutnya: Miscellaneous (Tapi Penting!) → `10-miscellaneous/README.md`
