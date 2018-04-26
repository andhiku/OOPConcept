package javasyntax;
import java.util.Scanner;

public class MatematikaScannerBeraksi {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("Menu Program Matematika");
        System.out.println("1 Penjumlahan");
        System.out.println("2 Pengurangan");
        System.out.println("3 Perkalian");
        System.out.println("4 Pembagian");
        System.out.println("5 Luas Lingkaran");
        System.out.println("6 Keliling Lingkaran");
        System.out.println("---------------------------");
        
        Scanner input1 = new Scanner (System.in) ;
        System.out.println("Masukkan Nomor Menu = ");
        int menu = input1.nextInt();
        
        switch(menu) {
            case 1:
                MatematikaScanner mtk1 = new MatematikaScanner();
                
                System.out.println("Masukkkan Angka1 = ");
                double angka1 = input1.nextDouble();
                
                System.out.println("Masukkan Angka2 = ");
                double angka2 = input1.nextDouble();
                
                mtk1.Pertambahan(angka1, angka2);
                break;
                
            case 2:
                MatematikaScanner mtk2 = new MatematikaScanner();
                
                System.out.println("Masukkan Angka1 = ");
                angka1 = input1.nextDouble();
                
                System.out.println("Masukkan Angka2 = ");
                angka2 = input1.nextDouble();
                
                mtk2.Pengurangan(angka1, angka2);
                break;
                
            case 3:
                MatematikaScanner mtk3 = new MatematikaScanner();
                
                System.out.println("Masukkan Angka1 = ");
                angka1 = input1.nextDouble();
                
                System.out.println("Masukkan Angka2 = ");
                angka2 = input1.nextDouble();
                
                mtk3.Perkalian(angka1, angka2);
                break;
                
            case 4:
                MatematikaScanner mtk4 = new MatematikaScanner();
                
                System.out.println("Masukkan Angka1 = ");
                angka1 = input1.nextDouble();
                
                System.out.println("Masukkan Angka2 = ");
                angka2 = input1.nextDouble();
                
                mtk4.Pembagian(angka1, angka2);
                break;
                
            case 5:
                MatematikaScanner mtk5 = new MatematikaScanner();
                
                System.out.println("Masukkan Jari-jari Lingkaran= ");
                angka1 = input1.nextDouble();
                
                System.out.println("");
                
                mtk5.LuasLingkaran(angka1);
                break;
                
            case 6:
                MatematikaScanner mtk6 = new MatematikaScanner();
                
                System.out.println("Masukkan Luas Lingkaran = ");
                angka1 = input1.nextDouble();
                
                System.out.println("");
                
                mtk6.KelilingLingkaran(angka1);
                break;
        }
    }
}
