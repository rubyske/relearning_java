# 📘 03 - Tipe Data & Variabel

## Apa itu Tipe Data?

Tipe data adalah cara untuk mendefinisikan jenis data apa yang bisa disimpan di dalam sebuah variabel. Java memiliki dua jenis tipe data:

1. **Primitive Type**
2. **Reference Type**

---

## 1. Primitive Data Types

Tipe data ini menyimpan nilai langsung dan bukan object. Ada **8 tipe data primitif** di Java:

| Tipe      | Ukuran | Contoh Nilai    | Deskripsi               |
| --------- | ------ | --------------- | ----------------------- |
| `byte`    | 1 byte | `-128` to `127` | Bilangan kecil          |
| `short`   | 2 byte | `-32K` to `32K` | Bilangan menengah       |
| `int`     | 4 byte | `-2B` to `2B`   | Bilangan bulat umum     |
| `long`    | 8 byte | Sangat besar    | Bilangan bulat besar    |
| `float`   | 4 byte | 3.14f           | Desimal presisi tunggal |
| `double`  | 8 byte | 3.14159         | Desimal presisi ganda   |
| `char`    | 2 byte | 'A', 'b', '3'   | Karakter Unicode        |
| `boolean` | 1 bit  | `true`, `false` | Logika true/false       |

### Contoh:

```java
int usia = 21;
float berat = 60.5f;
boolean aktif = true;
char inisial = 'B';
```

---

## 2. Reference Data Types

Tipe data ini menyimpan **referensi ke objek**. Contoh:

* `String`
* Array
* Object buatan sendiri (Class)

### Contoh:

```java
String nama = "Badru";
int[] angka = {1, 2, 3};
```

> Reference types dimulai dengan huruf kapital (misalnya `String`, `Integer`, dll).

---

## Variabel di Java

Variabel adalah tempat untuk menyimpan data.

### Cara deklarasi:

```java
TipeData namaVariabel = nilai;
```

### Contoh:

```java
int x = 10;
String nama = "Badru";
```

---

## Naming Convention

* Gunakan **camelCase**: `namaDepan`, `totalHarga`
* Nama variabel harus deskriptif
* Tidak boleh pakai spasi
* Tidak boleh dimulai dengan angka

---

## Konstanta (Keyword `final`)

Kalau lo butuh nilai yang **nggak bisa diubah**, gunakan `final`:

```java
final double PI = 3.14159;
```

> Gunakan **UPPER\_CASE** untuk penamaan konstanta.

---

## Tipe Data Wrapper

Tipe primitif punya pasangan kelas objek:

| Primitif | Wrapper Class |
| -------- | ------------- |
| int      | Integer       |
| float    | Float         |
| boolean  | Boolean       |
| char     | Character     |

Contoh:

```java
Integer umur = 21;
Boolean aktif = true;
```

---

## 🔥 Tips Pro

* Gunakan tipe data sekecil mungkin untuk efisiensi memori
* Gunakan `var` (Java 10+) untuk inferensi tipe, tapi jangan disalahgunakan
* Belajar `autoboxing` dan `unboxing` saat pakai wrapper class

---

### 🚀 Lanjut?

> Materi selanjutnya: Operator di Java
