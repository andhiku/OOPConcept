package oopconcepts;

public class MobilOverloadingBeraksi {

    public static void main(String[] args) {
        MobilOverloading mobil = new MobilOverloading();
        mobil.printMobil();
        System.out.println("");
        MobilOverloading mobil2 = new MobilOverloading("Hijau", 2016);
        mobil2.printMobil();
    }
}
