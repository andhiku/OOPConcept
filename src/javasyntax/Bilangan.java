package javasyntax;

public class Bilangan {

    static int pencacah = 0; // static variable
    int nilai; // instance variable

    public Bilangan(int nilai) {
        this.nilai = nilai;
        pencacah++;
    }

    public void info() {
        System.out.println("Nilai = " + nilai);
        System.out.println("Pencacah = " + pencacah);
        System.out.println("");
    }
}
