package javasyntax;


public class Array4 {
    public static void main(String[] args) {
        String[] kota = {"Jakarta", "Surabaya", "Bandung", "Semarang", "Yogyakarta"};
        int jumlahData = kota.length;
        System.out.println("Jumlah Data = " +jumlahData);
        
        for(int i=0; i <jumlahData; i++) {
            System.out.println(kota[1]);
        }
    }
}
