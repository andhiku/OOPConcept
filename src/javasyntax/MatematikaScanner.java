package javasyntax;
import java.util.Scanner;

public class MatematikaScanner {

    double hasila, hasilb, hasilc, hasild, phi, luaslingkar, kellingkar;

    void Pertambahan(double a, double b) {
        hasila = a + b;
        System.out.println("Hasil Penjumlahan = " + hasila);
    }

    void Pengurangan(double a, double b) {
        hasilb = a - b;
        System.out.println("Hasil Pengurangan = " + hasilb);
    }

    void Perkalian(double a, double b) {
        hasilc = a * b;
        System.out.println("Hasil Perkalian = " + hasilc);
    }

    void Pembagian(double a, double b) {
        hasild = a / b;
        System.out.println("Hasil Pembagian = " + hasild);
    }
    
    void LuasLingkaran(double luas) {
        phi = 3.14;
        luaslingkar = phi * luas;
        System.out.println("Hasil Luas Lingkaran = " + luaslingkar);
    }
    
    void KelilingLingkaran(double luas) {
        phi = 3.14;
        kellingkar = 2 * phi * luas;
        System.out.println("Hasil Keliling Lingkaran = " + kellingkar);
    }
}
