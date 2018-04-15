package oopconcepts;

public class MobilBeraksi {

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.warna = "Merah";
        mobil1.tahunProduksi = 2015;

        System.out.println(mobil1.warna);
        System.out.println(mobil1.tahunProduksi);

        Mobil mobil2 = new Mobil();
        mobil2.warna = "Hitam";
        mobil2.tahunProduksi = 2017;

        System.out.println(mobil2.warna);
        System.out.println(mobil2.tahunProduksi);

    }
}
