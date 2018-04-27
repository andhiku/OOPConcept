package javasyntax;


public class MatematikaScanner {

    double hasila, hasilb, hasilc, hasild, phi, luaslingkar, kellingkar, luasjgenjang, keljgenjang;

    void Pertambahan(double a, double b) {
        hasila = a + b;
        System.out.print("Hasil Penjumlahan = " + hasila);
    }

    void Pengurangan(double a, double b) {
        hasilb = a - b;
        System.out.print("Hasil Pengurangan = " + hasilb);
    }

    void Perkalian(double a, double b) {
        hasilc = a * b;
        System.out.print("Hasil Perkalian = " + hasilc);
    }

    void Pembagian(double a, double b) {
        hasild = a / b;
        System.out.print("Hasil Pembagian = " + hasild);
    }
    
    void LuasLingkaran(double l) {
        phi = 3.14;
        luaslingkar = phi * l;
        System.out.print("Hasil Luas Lingkaran = " + luaslingkar);
    }
    
    void KelilingLingkaran(double l) {
        phi = 3.14;
        kellingkar = 2 * phi * l;
        System.out.print("Hasil Keliling Lingkaran = " + kellingkar);
    }
    
    void LuasJajarGenjang(double a, double t) {
        luasjgenjang = a * t;
        System.out.print("Hasil Luas Jajar Genjang = " + luasjgenjang);
    }
    
    void KelilingJajarGenjang(double a, double b) {
        keljgenjang = 2* (a + b);
        System.out.print("Hasil Keliling Jajar Genjang = " + keljgenjang);
    }
}
