package com.juaracoding.TugasPraktikum;

import java.util.ArrayList;
import java.util.Scanner;

public class TampilanMenu {
    // Membuat ArrayList untuk menyimpan daftar film
    static ArrayList<String> daftarfilm = new ArrayList<>();

    // Method untuk menampilkan daftar film
    public static void menuFilm() {
        // Membuat scanner untuk input pilihan film
        Scanner pilfilm = new Scanner(System.in);

        // Menambahkan beberapa film default jika daftarfilm kosong
        if (daftarfilm.isEmpty()) {
            daftarfilm.add("Pengabdi Setan");
            daftarfilm.add("Iwazaki vs everyone");
            daftarfilm.add("kuraih kau dengan kakiku");
        }

        // Menampilkan daftar film yang tersedia
        System.out.println("Daftar film yang dapat anda tonton:");
        for (int i = 0; i < daftarfilm.size(); i++) {
            System.out.println((i + 1) + ". " + daftarfilm.get(i)); // Menampilkan film beserta nomor urut
        }

        // Meminta input dari user untuk memilih film
        System.out.print("Silahkan pilih film yang ingin anda tonton (1 - " + daftarfilm.size() + "): ");
        int infilm = pilfilm.nextInt();

        // Memeriksa apakah pilihan valid dan menampilkan hasilnya
        if (infilm >= 1 && infilm <= daftarfilm.size()) {
            System.out.println("Anda memilih: " + daftarfilm.get(infilm - 1));
        } else {
            // Jika pilihan tidak valid
            System.out.println("Pilihan tidak valid.");
        }
    }

    // Method untuk menambahkan film ke dalam daftar
    public static void inputFilm() {
        Scanner input = new Scanner(System.in);
        String lanjut;

        // Loop untuk menambahkan beberapa film
        do {
            System.out.println("silahkan tambahkan judul film yang anda mau");
            String judul = input.nextLine(); // Meminta input judul film
            daftarfilm.add(judul); // Menambahkan judul film ke daftar

            // Menanyakan apakah ingin menambahkan film lagi
            System.out.println("apakah ingin menambahkan judu film lagi");
            lanjut = input.nextLine();
        } while (lanjut.equalsIgnoreCase("y")); // Jika input "y", akan menambahkan film lagi

        // Menampilkan semua daftar film yang telah dimasukkan
        System.out.println("\nBerikut adalah semua daftar film yg telah dimasukkan");
        for (int i = 0; i < daftarfilm.size(); i++) {
            System.out.println((i + 1) + ". " + daftarfilm.get(i)); // Menampilkan daftar film
        }
    }

    // Method untuk mencari film berdasarkan keyword
    public static void cariFilm() {
        Scanner input = new Scanner(System.in);
        // Meminta input keyword dari user
        System.out.print("Masukkan judul atau kata kunci film yang ingin dicari: ");
        String keyword = input.nextLine().toLowerCase(); // Mengubah input menjadi huruf kecil

        boolean ditemukan = false;
        System.out.println("Hasil pencarian:");

        // Loop untuk mencari film yang mengandung keyword
        for (int i = 0; i < daftarfilm.size(); i++) {
            if (daftarfilm.get(i).toLowerCase().contains(keyword)) {
                // Menampilkan film yang ditemukan
                System.out.println((i + 1) + ". " + daftarfilm.get(i));
                ditemukan = true; // Menandai bahwa film ditemukan
            }
        }

        // Jika tidak ada film yang ditemukan
        if (!ditemukan) {
            System.out.println("Film dengan kata kunci tersebut tidak ditemukan.");
        }
    }
}
