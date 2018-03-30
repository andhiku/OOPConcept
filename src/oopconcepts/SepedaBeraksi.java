package oopconcepts;

public class SepedaBeraksi {

    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda();
        sepedaku.setGir(1);
        System.out.println("Gir saat ini:" + sepedaku.getGir());

        sepedaku.setGir(3);
        System.out.println("Gir saat ini:" + sepedaku.getGir());
    }
}
