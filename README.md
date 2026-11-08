# StackLinkedList

Implementasi struktur data **Stack** di Java menggunakan **Single Linked List**. Dibuat sebagai tugas mata kuliah Algoritma dan Struktur Data.

## Konsep Singkat

Stack bekerja dengan prinsip **LIFO (Last In, First Out)**: elemen yang terakhir dimasukkan akan menjadi yang pertama dikeluarkan.

Setiap elemen disimpan dalam sebuah `Node` yang menunjuk ke node di bawahnya. Variabel `top` selalu menunjuk ke node paling atas.

```
TOP -> 30 -> 20 -> 10 -> null
```

## Fitur

| Method | Fungsi | Kompleksitas |
|---|---|---|
| `push(E item)` | Menambah elemen ke atas stack | O(1) |
| `pop()` | Mengambil dan menghapus elemen paling atas | O(1) |
| `peek()` | Melihat elemen paling atas tanpa menghapusnya | O(1) |
| `isEmpty()` | Mengecek apakah stack kosong | O(1) |
| `size()` | Mengembalikan jumlah elemen | O(1) |
| `clear()` | Mengosongkan seluruh isi stack | O(1) |
| `toString()` | Menampilkan isi stack dari atas ke bawah | O(n) |

Stack ini bersifat **generic**, sehingga bisa menyimpan tipe data apa saja (`Integer`, `String`, dan lainnya).

Jika `pop()` atau `peek()` dipanggil saat stack kosong, program akan melempar `RuntimeException`.


## Tugas Dari

- Nama:Azzahra Shafira
- NIM: F1D02510040
- Mata kuliah: Algoritma dan Struktur Data
