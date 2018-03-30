package oopconcepts;

public class MobilKonstruktor {

    String warna;
    int tahunProduksi;

    public MobilKonstruktor(String warna, int tahunProduksi) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    void printMobil() {
        System.out.println("Warna = " + warna);
        System.out.println("Tahun Produksi = " + tahunProduksi);
    }
}
