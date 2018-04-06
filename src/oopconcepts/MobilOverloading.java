package oopconcepts;

public class MobilOverloading {
    private String warna;
    private int tahunProduksi;
    
    public MobilOverloading() {
        
    }
    
    public MobilOverloading(String warna, int tahunProduksi) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    
    public void printMobil() {
        System.out.println(" Warna = " + warna);
        System.out.println(" Tahun Produksi = " + tahunProduksi);
    }
}
