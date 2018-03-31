package oopconcepts;

public class SepedaEncapsulationBeraksi {
    public static void main(String[] args) {
        SepedaEncapsulation spd = new SepedaEncapsulation();
        // spd.gir = 2; //error karena gir access modifier private
        spd.setGir(5);
        System.out.println("Gir saat ini = " + spd.getGir());
        
        spd.setGir(2);
        System.out.println("Gir saat ini = " +spd.getGir());
    }
}
