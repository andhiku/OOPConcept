package oopconcepts;

public class BankBeraksi {

    public static void main(String[] args) {
        Bank saldo = new Bank(100000);
        saldo.simpanUang(500000);
        saldo.ambilUang(150000);
    }
}
