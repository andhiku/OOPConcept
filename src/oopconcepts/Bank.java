package oopconcepts;

public class Bank {

    int simpanUang;
    int ambilUang;
    int getSaldo;

    public Bank(int getSaldo) {
        this.getSaldo = getSaldo;
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + getSaldo + "\n");
    }

    void simpanUang(int simpanUang) {
        this.getSaldo = getSaldo + simpanUang;
        System.out.println("Simpan uang: Rp. " + simpanUang);
        System.out.println("Saldo saat ini: Rp. " + getSaldo + "\n");
    }

    void ambilUang(int ambilUang) {
        this.getSaldo = getSaldo - ambilUang;
        System.out.println("Ambil uang: Rp. " + ambilUang);
        System.out.println("Saldo saat ini: Rp. " + getSaldo + "\n");
    }

    //int getSaldo() {
    //    return saldo;
    //}
}
