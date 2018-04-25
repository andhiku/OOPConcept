package oopconcepts;

import java.io.*;

public class MenuProgramAritmatika {

    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() throws Exception {
        DataInputStream input = new DataInputStream(System.in);
        System.out.print("Menu Program Aritmatika\n1 Penjumlahan\n2 Pengurangan\n3 Perkalian\n4 Pembagian\n0 Keluar\nMasukkan Nomor Menu = ");
        String pilihan = input.readLine();
        //clearscreen();

        switch (pilihan) {
            case "1":
                penjumlahan();
                break;

            case "2":
                pengurangan();
                break;

            case "3":
                perkalian();
                break;

            case "4":
                pembagian();
                break;

            case "0":
                keluar();
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
                kembalikemenu();
        }
    }

    public static void penjumlahan() throws Exception {
        DataInputStream input = new DataInputStream(System.in);

        try {
            System.out.print("Masukkan Angka1 = ");
            float angka1 = Float.parseFloat(input.readLine());
            System.out.print("Masukkan Angka2 = ");
            float angka2 = Float.parseFloat(input.readLine());
            float hasil = angka1 + angka2;
            System.out.println("Hasil = " + hasil);
            kembalikemenu();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Anda tidak memasukkan angka");
            penjumlahan();
        }
    }

    public static void pengurangan() throws Exception {
        DataInputStream input = new DataInputStream(System.in);

        try {
            System.out.print("Masukkan Angka1 = ");
            float angka1 = Float.parseFloat(input.readLine());
            System.out.print("Masukkan Angka2 = ");
            float angka2 = Float.parseFloat(input.readLine());
            float hasil = angka1 - angka2;
            System.out.println("Hasil = " + hasil);
            kembalikemenu();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Anda tidak memasukkan angka");
            pengurangan();
        }
    }

    public static void perkalian() throws Exception {
        DataInputStream input = new DataInputStream(System.in);

        try {
            System.out.print("Masukkan Angka1 = ");
            float angka1 = Float.parseFloat(input.readLine());
            System.out.print("Masukkan Angka2 = ");
            float angka2 = Float.parseFloat(input.readLine());
            float hasil = angka1 * angka2;
            System.out.println("Hasil = " + hasil);
            kembalikemenu();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Anda tidak memasukkan angka");
            perkalian();
        }
    }

    public static void pembagian() throws Exception {
        DataInputStream input = new DataInputStream(System.in);

        try {
            System.out.print("Masukkan Angka1 = ");
            float angka1 = Float.parseFloat(input.readLine());
            System.out.print("Masukkan Angka2 = ");
            float angka2 = Float.parseFloat(input.readLine());
            if (angka2 == 0) {
                System.out.print("\nPERINGATAN! Angka kedua tidak boleh nol!\nMasukkan lagi angka kedua = ");
                angka2 = Float.parseFloat(input.readLine());
                if (angka2 == 0) {
                    System.out.print("\nANGKA KEDUA TIDAK BOLEH NOL! Karena hasil tidak terdefinisikan!\nUlangi lagi dari awal.\n");
                    pembagian();
                }
            }
            float hasil = angka1 / angka2;
            System.out.println("Hasil = " + hasil);
            kembalikemenu();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Anda tidak memasukkan angka ATAU Anda salah menggunakan tanda koma\nGunakan tanda titik (.)");
            pembagian();
        }
    }

    public static void keluar() throws Exception {
        DataInputStream input = new DataInputStream(System.in);

        System.out.print("Apakah Anda ingin mengakhiri program ini? (y/t) : ");
        String pilih = input.readLine();
        switch (pilih) {
            case "Y":
            case "y":
                clearscreen();
                System.out.print("\nTerima kasih telah menggunakan program kami :)\nCopyright (c) 2012 Arief Pratama & Arief Budi Sucianto\nAll rights reserved.\n");
                System.exit(0);
                break;

            case "T":
            case "t":
                clearscreen();
                menu();
                break;

            default:
                System.out.println("Pilihan tidak tersedia.\n");
                keluar();
        }
    }

    public static void kembalikemenu() throws Exception {
        DataInputStream input = new DataInputStream(System.in);

        System.out.print("\nApakah Anda ingin kembali ke menu? (y/t) : ");
        String pilih = input.readLine();
        switch (pilih) {
            case "Y":
            case "y":
                clearscreen();
                menu();
                break;

            case "T":
            case "t":
                clearscreen();
                keluar();
                break;

            default:
                System.out.println("Pilihan tidak tersedia.\n");
                kembalikemenu();
        }
    }

    public static void clearscreen() throws Exception {
        int i;
        for (i = 0; i <= 150; i++) {
            System.out.println("\n");
        }
    }
}
