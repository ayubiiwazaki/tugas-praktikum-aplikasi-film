package com.juaracoding.TugasPraktikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek scanner untuk input username, password dan menu
        Scanner username = new Scanner(System.in);
        Scanner password = new Scanner(System.in);
        Scanner pilmenu = new Scanner(System.in);

        // Menetapkan username dan pin yang valid.
        String name = "admin";
        String pin = "112233";
        boolean loginSukses = false;

        // Loop untuk login, dengan maksimal 5 kali percobaan
        for (int i = 1; i <= 5; i++) {
            // Meminta input username dan password dari user
            System.out.println("Input username = ");
            String inname = username.nextLine();

            System.out.println("Input pin      = ");
            String inPin = password.nextLine();

            // Validasi username dan pin
            if (inname.equals(name) && inPin.equals(pin)) {
                System.out.println("selamat anda berhasil login");
                loginSukses = true; // Set login berhasil
                break;
            } else {
                // Menampilkan pesan error jika login gagal
                System.out.println("Maaf anda salah memasukkan username atau password anda ");
                System.out.println("silahkan masukkan kembali data anda");
            }
        }

        // Jika login gagal setelah 5 kali percobaan
        if (!loginSukses) {
            System.out.println("Anda telah melakukan beberapa kali perobaan akun anda di bekukan harap menghubungi admin");
            return; // Menghentikan program jika login gagal
        }

        // Menu utama yang akan muncul setelah login berhasil
        int menu;
        do {
            // Menampilkan pilihan menu kepada user
            System.out.println("=== Menu Film ===");
            System.out.println("1. Tampilkan daftar film");
            System.out.println("2. Input data film");
            System.out.println("3. Cari film");
            System.out.println("4. Logout");
            System.out.println("Masukkan pilihan menu: ");

            // Meminta input menu dari user
            menu = pilmenu.nextInt();

            // Switch statement untuk memilih menu yang sesuai
            switch (menu) {
                case 1:
                    // Menampilkan daftar film
                    System.out.println("daftar film yg dapat anda tonton ");
                    TampilanMenu tm = new TampilanMenu();
                    tm.menuFilm(); // Memanggil method menuFilm() dari class TampilanMenu
                    break;

                case 2:
                    // Menginput data film baru
                    System.out.println("Input data film ");
                    TampilanMenu.inputFilm(); // Memanggil method inputFilm() dari class TampilanMenu
                    break;

                case 3:
                    // Mencari film berdasarkan input keyword
                    System.out.println("Cari film ");
                    TampilanMenu.cariFilm(); // Memanggil method cariFilm() dari class TampilanMenu
                    break;

                case 4:
                    // Logout
                    System.out.println("log out berhasil ");
                    break;

                default:
                    // Menampilkan pesan jika pilihan tidak valid
                    System.out.println("pilihan tidak valid ");
                    break;
            }

        } while (menu != 4); // Loop akan berhenti jika menu pilihan adalah 4 (logout)
    }
}
