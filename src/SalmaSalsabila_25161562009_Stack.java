// Nama  : Salma Salsabila
// NPM   : 25161562009
// Kelas : 2A
// File  : SalmaSalsabila_25161562009_Stack.java

public class SalmaSalsabila_25161562009_Stack {

    // ===============================
    // BAGIAN 1 : Deklarasi Stack
    // ===============================
    static String[] stack = new String[10];
    static int top = -1;

    // ===============================
    // BAGIAN 2 : Operasi Stack
    // ===============================

    // Method push() -> menambah data ke stack
    static void push(String tiket) {
        if (top == stack.length - 1) {
            System.out.println("Stack penuh!");
        } else {
            stack[++top] = tiket;
        }
    }

    // Method pop() -> menghapus data teratas
    static String pop() {
        if (isEmpty()) {
            return "Stack kosong!";
        } else {
            return stack[top--];
        }
    }

    // Method peek() -> melihat data teratas tanpa menghapus
    static String peek() {
        if (isEmpty()) {
            return "Stack kosong";
        } else {
            return stack[top];
        }
    }

    // Mengecek apakah stack kosong
    static boolean isEmpty() {
        return top == -1;
    }

    // Menampilkan isi stack
    static void tampilkanStack() {
        System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");

        for (int i = top; i >= 0; i--) {
            System.out.println("| " + stack[i] + " |");
        }

        System.out.println("=================================");
    }

    // BONUS : Menghitung total harga tiket
    static void hitungTotal() {
        int total = 0;

        for (int i = 0; i <= top; i++) {
            String tiket = stack[i];
            String[] parts = tiket.split("Rp");

            if (parts.length > 1) {
                String hargaStr = parts[1].replace(".", "").trim();
                total += Integer.parseInt(hargaStr);
            }
        }

        System.out.println("Total transaksi: Rp" +
                String.format("%,d", total).replace(",", "."));
    }

    // ===============================
    // BAGIAN 3 : Main Program
    // ===============================
    public static void main(String[] args) {

        // Push 3 transaksi tiket
        push("Tiket-A01: Avengers Rp50.000");
        push("Tiket-B02: Interstellar Rp45.000");
        push("Tiket-C03: Inception Rp45.000");

        // Bonus: hitung total setelah semua push selesai
        hitungTotal();

        // Tampilkan isi stack
        tampilkanStack();

        // Tampilkan tiket paling atas
        System.out.println("Tiket terakhir masuk: " + peek());

        // Batalkan tiket teratas
        System.out.println("Tiket dibatalkan: " + pop());

        // Tampilkan isi stack setelah pop
        tampilkanStack();
    }
}