# Tugas Coding Individu - Struktur Data

## Implementasi Stack (Tumpukan) dalam Java

### Identitas Mahasiswa

* **Nama:** Salma Salsabila
* **NPM:** 25161562009
* **Kelas:** 2A
## Nama File

SalmaSalsabila_25161562009_Stack.java

## Deskripsi Program

Program ini dibuat untuk memenuhi tugas individu mata kuliah **Struktur Data** dengan topik **Implementasi Stack (Tumpukan)** menggunakan bahasa pemrograman **Java**.

Studi kasus yang digunakan adalah sistem pencatatan transaksi pembelian tiket bioskop. Setiap transaksi disimpan menggunakan prinsip **LIFO (Last In First Out)**, yaitu data yang terakhir masuk akan menjadi data pertama yang keluar.

Implementasi stack pada program ini dibuat **secara manual menggunakan array dan variabel `top`**, tanpa menggunakan struktur data bawaan Java seperti:

* `java.util.Stack`
* `ArrayList`
* `LinkedList`

## Fitur Program

Program memiliki beberapa method utama:

### 1. `push(String tiket)`

Menambahkan data tiket ke dalam stack.
Jika stack penuh, program akan menampilkan:

```text 
Stack penuh!
```

### 2. `pop()`

Menghapus dan mengembalikan data tiket paling atas.
Jika stack kosong, program akan menampilkan:

```text 
Stack kosong!
```

### 3. `peek()`

Menampilkan data tiket paling atas tanpa menghapus isi stack.

### 4. `tampilkanStack()`

Menampilkan seluruh isi stack dari posisi **TOP ke BOTTOM**.

### 5. `hitungTotal()`

Menjumlahkan seluruh harga tiket yang tersimpan di dalam stack.


---

## Data Transaksi Tiket

```text 
Tiket-A01: Avengers Rp50.000
Tiket-B02: Interstellar Rp45.000
Tiket-C03: Inception Rp45.000
```
## Output Program

```text 
Total transaksi: Rp140.000
=== Isi Stack (TOP -> BOTTOM) ===
| Tiket-C03: Inception Rp45.000 |
| Tiket-B02: Interstellar Rp45.000 |
| Tiket-A01: Avengers Rp50.000 |
=================================
Tiket terakhir masuk: Tiket-C03: Inception Rp45.000
Tiket dibatalkan: Tiket-C03: Inception Rp45.000
=== Isi Stack (TOP -> BOTTOM) ===
| Tiket-B02: Interstellar Rp45.000 |
| Tiket-A01: Avengers Rp50.000 |
=================================
```

## Struktur Data yang Digunakan

Program menggunakan:

* **Array String** sebagai tempat penyimpanan data stack
* **Variabel `top`** sebagai penunjuk posisi elemen teratas stack

---

## Kesimpulan

Program berhasil mengimplementasikan struktur data **Stack** menggunakan array secara manual. Program dapat menjalankan operasi dasar stack seperti:

* Push (menambah data)
* Pop (menghapus data teratas)
* Peek (melihat data teratas)
* Menampilkan isi stack
* Menghitung total transaksi tiket

