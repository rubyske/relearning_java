# 📘 01 - Pengenalan Java

## Apa Itu Java?
Java adalah bahasa pemrograman berorientasi objek (OOP) yang dikembangkan oleh Sun Microsystems pada tahun 1995. Kini Java dimiliki dan dikembangkan oleh Oracle. Java bersifat *general-purpose*, artinya dapat digunakan untuk berbagai macam aplikasi — desktop, mobile (Android), web, hingga enterprise.

## Kenapa Java?
- ✅ Write Once, Run Anywhere (WORA)
- ✅ Stabil & Mature
- ✅ Dukungan komunitas besar
- ✅ Banyak dipakai di perusahaan besar
- ✅ Ekosistem tools dan framework luas (Spring, Hibernate, dll)

## Filosofi Java: WORA
"Write Once, Run Anywhere" artinya kode Java yang dikompilasi dapat dijalankan di platform mana pun yang memiliki JVM tanpa perlu diubah. Ini adalah kekuatan besar dari Java.

## Perbedaan JDK, JRE, JVM
| Komponen | Deskripsi |
|----------|-----------|
| **JDK (Java Development Kit)** | Tools lengkap untuk developer (kompiler, debugger, JRE) |
| **JRE (Java Runtime Environment)** | Lingkungan runtime untuk menjalankan program Java (termasuk JVM + library dasar) |
| **JVM (Java Virtual Machine)** | Mesin virtual yang mengeksekusi bytecode Java agar bisa berjalan di platform apa pun |

## Instalasi Java
### 1. Download JDK
- [https://jdk.java.net](https://jdk.java.net) (versi open source)
- [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)

### 2. Setup PATH (Windows)
Tambahkan path ke `bin` folder JDK ke `Environment Variables`:


### 3. Cek instalasi via terminal / cmd:
```bash
java -version
javac -version
