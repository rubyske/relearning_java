# 📘 04 - Operator di Java

## Apa itu Operator?

Operator adalah simbol khusus yang digunakan untuk melakukan operasi pada variabel dan nilai.
Java menyediakan banyak operator yang dibagi ke dalam beberapa kategori.

---

## 1. Operator Aritmatika

Digunakan untuk operasi matematika dasar.

| Operator | Deskripsi      | Contoh  |
| -------- | -------------- | ------- |
| `+`      | Penjumlahan    | `a + b` |
| `-`      | Pengurangan    | `a - b` |
| `*`      | Perkalian      | `a * b` |
| `/`      | Pembagian      | `a / b` |
| `%`      | Modulus (sisa) | `a % b` |

```java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a % b); // 1
```

---

## 2. Operator Penugasan (Assignment)

Digunakan untuk memberikan nilai ke variabel.

| Operator | Deskripsi          | Contoh   |
| -------- | ------------------ | -------- |
| `=`      | Penugasan nilai    | `x = 5`  |
| `+=`     | Tambah dan assign  | `x += 3` |
| `-=`     | Kurang dan assign  | `x -= 2` |
| `*=`     | Kali dan assign    | `x *= 4` |
| `/=`     | Bagi dan assign    | `x /= 2` |
| `%=`     | Modulus dan assign | `x %= 3` |

```java
int x = 10;
x += 5; // sama dengan x = x + 5;
```

---

## 3. Operator Perbandingan (Relational)

Membandingkan dua nilai dan menghasilkan `true` atau `false`.

| Operator | Deskripsi             | Contoh   |
| -------- | --------------------- | -------- |
| `==`     | Sama dengan           | `a == b` |
| `!=`     | Tidak sama dengan     | `a != b` |
| `>`      | Lebih besar dari      | `a > b`  |
| `<`      | Lebih kecil dari      | `a < b`  |
| `>=`     | Lebih besar/sama dari | `a >= b` |
| `<=`     | Lebih kecil/sama dari | `a <= b` |

```java
int a = 5, b = 10;
System.out.println(a < b); // true
```

---

## 4. Operator Logika

Digunakan untuk operasi logika boolean.

| Operator | Deskripsi       | Contoh            |           |         |   |          |
| -------- | --------------- | ----------------- | --------- | ------- | - | -------- |
| `&&`     | AND (dan)       | `a > 5 && b < 10` |           |         |   |          |
| \`       |                 | \`                | OR (atau) | \`a > 5 |   | b < 10\` |
| `!`      | NOT (kebalikan) | `!aktif`          |           |         |   |          |

```java
boolean aktif = false;
System.out.println(!aktif); // true
```

---

## 5. Operator Unary

Bekerja dengan satu operand.

| Operator | Deskripsi           | Contoh |
| -------- | ------------------- | ------ |
| `+`      | Positif             | `+a`   |
| `-`      | Negatif             | `-a`   |
| `++`     | Increment (naik 1)  | `a++`  |
| `--`     | Decrement (turun 1) | `b--`  |

```java
int a = 5;
a++;
System.out.println(a); // 6
```

---

## 6. Operator Bitwise (Opsional untuk lanjut)

Digunakan untuk operasi pada level bit (jarang digunakan di pemula).

| Operator | Nama        | Contoh   |     |     |
| -------- | ----------- | -------- | --- | --- |
| `&`      | AND         | `a & b`  |     |     |
| \`       | \`          | OR       | \`a | b\` |
| `^`      | XOR         | `a ^ b`  |     |     |
| `~`      | NOT         | `~a`     |     |     |
| `<<`     | Shift Left  | `a << 2` |     |     |
| `>>`     | Shift Right | `a >> 2` |     |     |

---

## 🔧 Task / Latihan

### Soal 1

Deklarasikan 2 variabel bertipe `int`, lalu hitung dan tampilkan hasil:

* Penjumlahan
* Pengurangan
* Modulus

### Soal 2

Buat boolean expression dengan operator logika dan bandingkan hasilnya:

```java
int umur = 20;
boolean isDewasa = umur >= 17 && umur <= 30;
```

Cetak hasil ke console.

### Soal 3

Gunakan operator increment dan decrement, lalu tampilkan hasilnya.

---

## 🔥 Tips Pro

* `++x` (prefix) vs `x++` (postfix): berbeda saat digunakan dalam ekspresi
* Operator bisa digabung dalam satu ekspresi kompleks, tapi jaga keterbacaan kode

---

### 🚀 Lanjut?

> Materi selanjutnya: Control Flow (Percabangan dan Perulangan) 
