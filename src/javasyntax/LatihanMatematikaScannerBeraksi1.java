package javasyntax;

import java.util.Scanner;

public class LatihanMatematikaScannerBeraksi1 {

    public static void main(String[] args) {
        MatematikaScanner m = new MatematikaScanner();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print(
                    "Menu Program Aritmatika\n1 Penjumlahan\n2 Pengurangan\n3 Perkalian\n4 Pembagian\nMasukkan Nomor Menu = "
            );
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Angka1 = ");
                    double a1 = input.nextDouble();
                    
                    System.out.print("Masukkan Angka2 = ");
                    double b1 = input.nextDouble();
                    
                    m.Pertambahan(a1, b1);
                    System.exit(0);
                    break;
                    
                case 2:
                    System.out.print("Masukkan Angka1 = ");
                    double a2 = input.nextDouble();
                    
                    System.out.print("Masukkan Angka2 = ");
                    double b2 = input.nextDouble();
                    
                    m.Pengurangan(a2, b2);
                    System.exit(0);
                    break;
                    
                case 3:
                    System.out.print("Masukkan Angka1 = ");
                    double a3 = input.nextDouble();
                    
                    System.out.print("Masukkan Angka2 = ");
                    double b3 = input.nextDouble();
                    
                    m.Perkalian(a3, b3);
                    System.exit(0);
                    break;
                    
                case 4:
                    System.out.print("Masukkan Angka1 = ");
                    double a4 = input.nextDouble();
                    
                    System.out.print("Masukkan Angka2 = ");
                    double b4 = input.nextDouble();
                    
                    m.Perkalian(a4, b4);
                    System.exit(0);
                    break;
                    
                default:
                    System.out.print("Pilihan tidak tersedia\n\n");
            }

        }

    }
}
