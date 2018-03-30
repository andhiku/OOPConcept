package oopconcepts;

public class SepedaGunungBeraksi {

    public static void main(String[] args) {
        SepedaGunung spd = new SepedaGunung();
        spd.setGir(1);
        System.out.println("Gir saat ini = " + spd.getGir());
        
        spd.setGir(2);
        System.out.println("Gir saat ini = " + spd.getGir());
        
        spd.setSadel(1);
        System.out.println("Sadel saar ini = " + spd.getSadel());
    }
}
