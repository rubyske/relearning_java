# 📘 05 - Control Flow (Percabangan & Perulangan)

## Apa itu Control Flow?

Control flow menentukan **alur eksekusi** program. Dengan percabangan dan perulangan, program bisa mengambil keputusan dan melakukan aksi berulang.

---

## 1. Percabangan (Conditional Statements)

### 1.1 `if`, `else if`, `else`

```java
int nilai = 80;
if (nilai >= 90) {
    System.out.println("Nilai A");
} else if (nilai >= 75) {
    System.out.println("Nilai B");
} else {
    System.out.println("Nilai C");
}
```

### 1.2 `switch-case`

```java
int hari = 3;
switch (hari) {
    case 1:
        System.out.println("Senin");
        break;
    case 2:
        System.out.println("Selasa");
        break;
    case 3:
        System.out.println("Rabu");
        break;
    default:
        System.out.println("Hari tidak valid");
}
```

> Gunakan `break` untuk mencegah fall-through ke case berikutnya.

---

## 2. Perulangan (Looping)

### 2.1 `for`

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iterasi ke-" + i);
}
```

### 2.2 `while`

```java
int i = 0;
while (i < 5) {
    System.out.println("i: " + i);
    i++;
}
```

### 2.3 `do-while`

```java
int i = 0;
do {
    System.out.println("i: " + i);
    i++;
} while (i < 5);
```

### 2.4 `for-each` (khusus array/collection)

```java
int[] angka = {1, 2, 3};
for (int x : angka) {
    System.out.println(x);
}
```

---

## 3. Keyword Khusus: `break` & `continue`

### `break`

Menghentikan loop atau keluar dari `switch`.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break;
    System.out.println(i);
}
```

### `continue`

Melewati iterasi saat ini dan lanjut ke berikutnya.

```java
for (int i = 0; i < 5; i++) {
    if (i == 2) continue;
    System.out.println(i);
}
```

---

## 🔧 Task / Latihan

### Soal 1 - Percabangan

Buat program yang menerima nilai (angka) dan menampilkan kategori:

* > \= 90: "A"
* > \= 75: "B"
* > \= 60: "C"
* < 60: "D"

### Soal 2 - Looping

Cetak bilangan genap dari 1 sampai 20 menggunakan:

* `for`
* `while`

---

## 🔥 Tips Pro

* Gunakan `switch` untuk banyak kondisi sederhana berbasis angka atau enum
* Gunakan `for-each` untuk iterasi koleksi/array yang tidak butuh indeks
* Jangan lupa `break` saat pakai `switch`, atau efeknya bisa kacau!

---

### 🚀 Lanjut?

> Materi selanjutnya: Array & String 
