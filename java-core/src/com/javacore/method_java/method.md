# 📘 06 - Method (Fungsi) di Java

Method adalah blok kode yang bisa dipanggil berulang kali dengan parameter tertentu. Mereka bikin kode jadi modular, reusable, dan lebih gampang diatur.

---

## 1. Struktur Dasar Method

```java
public static void sapaUser(String nama) {
    System.out.println("Halo, " + nama);
}
```

| Bagian        | Penjelasan                                   |
| ------------- | -------------------------------------------- |
| `public`      | Akses modifier (bisa diakses dari mana saja) |
| `static`      | Bisa dipanggil tanpa objek                   |
| `void`        | Tidak mengembalikan nilai                    |
| `sapaUser`    | Nama method                                  |
| `String nama` | Parameter bertipe String                     |

### Pemanggilan:

```java
sapaUser("Badru");
```

---

## 2. Method dengan Return Value

```java
public static int tambah(int a, int b) {
    return a + b;
}
```

### Pemanggilan:

```java
int hasil = tambah(5, 3);
System.out.println(hasil); // 8
```

---

## 3. Method Overloading

Method bisa punya nama yang sama tapi beda parameter.

```java
public static int luas(int sisi) {
    return sisi * sisi;
}

public static int luas(int panjang, int lebar) {
    return panjang * lebar;
}
```

---

## 4. Scope Variabel

Variabel di dalam method hanya bisa diakses di dalam method itu.

```java
public static void cetakUmur() {
    int umur = 21;
    System.out.println(umur);
}
// System.out.println(umur); // ❌ Error: variabel di luar scope
```

---

## 5. Keyword `return`

Digunakan untuk mengembalikan nilai ke pemanggil method.

```java
return nilai;
```

> Semua method non-`void` wajib pakai `return`

---

## 6. `main()` Method Revisited

Semua program Java dimulai dari method `main()`:

```java
public static void main(String[] args) {
    // titik awal eksekusi
}
```

---

## 🔥 Tips Pro

* Gunakan method untuk memecah logika jadi lebih kecil dan rapi
* Hindari method terlalu panjang (> 20 baris) — refactor!
* Komposisi > kompleksitas — lebih baik banyak method kecil dari pada satu method monster

---

## ✅ Task Wajib

1. **Buat method** `sayHello(String nama)` yang mencetak `"Halo, [nama]!"`
2. **Buat method** `perkalian(int a, int b)` yang mengembalikan hasil a × b
3. **Overload method** `luas` untuk:

    * Luas persegi (`int sisi`)
    * Luas persegi panjang (`int panjang, int lebar`)
4. **Buat method** `isGenap(int angka)` yang mengembalikan `true` jika angka genap, `false` jika ganjil

---

### 🚀 Lanjut?

> Materi selanjutnya: OOP (Object-Oriented Programming) → `07-oop/README.md`
