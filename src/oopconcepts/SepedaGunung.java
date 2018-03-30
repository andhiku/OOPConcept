package oopconcepts;

public class SepedaGunung extends Sepeda {

    private int sadel;

    public void setSadel(int jumlah) {
        sadel = getGir() - jumlah;
    }

    public int getSadel() {
        return sadel;
    }
}
