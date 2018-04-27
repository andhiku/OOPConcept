package javasyntax;

//melakukan perulangan dulu, baru melihat kondisi (syarat) jadi minimal mengulang 1 kali
public class DoWhile { 
    public static void main(String[] args) {
        int i=11; //inisialisasi
        do {
            System.out.println("Looping ke-" +i+ "Stmik Banjarbaru"); //statement
            i++; //counter
        } while (i<=5); //kondisi
    }
}
