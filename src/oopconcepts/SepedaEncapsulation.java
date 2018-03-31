package oopconcepts;

public class SepedaEncapsulation {
    private int gir;
    // method mutator / setter
    public void setGir(int pertambahanGir) {
        gir = gir + pertambahanGir;
    }
    
    // method acessor / getter
    public int getGir() {
        return gir;
    }
}
