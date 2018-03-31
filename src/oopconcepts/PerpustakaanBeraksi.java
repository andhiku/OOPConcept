package oopconcepts;

public class PerpustakaanBeraksi {

    public static void main(String[] args) {
        Perpustakaan pinjaman1 = new Perpustakaan();
        pinjaman1.id = 2546;
        pinjaman1.nama = "Emilio";
        pinjaman1.jk = "Laki-laki";
        pinjaman1.staff = "Andi";
        pinjaman1.idBuku = 6;
        pinjaman1.namaBuku = "Tidur dalam kubur";
        pinjaman1.tglPinjam = 15032018;
        pinjaman1.tglKembali = 22032018;
        pinjaman1.pinalti = 3;
        pinjaman1.denda = 4500;

        //mutator
        System.out.println("Nomor Peminjam = " + pinjaman1.getId());
        System.out.println("Nama Peminjam = " + pinjaman1.getNama());
        System.out.println("Jenis Kelamin = " + pinjaman1.getJk());
        System.out.println("Staff Perpustakaan = " + pinjaman1.getStaff());
        System.out.println("Nomor Buku = " + pinjaman1.getIdBuku());
        System.out.println("Nama Buku = " + pinjaman1.getNamaBuku());
        System.out.println("Tanggal Pinjam = " + pinjaman1.getTglPinjam());
        System.out.println("Tanggal Kembali = " + pinjaman1.getTglKembali());
        System.out.println("Pinalti = " + pinjaman1.getPinalti() + " Hari");
        System.out.println("Total Denda = Rp. " + pinjaman1.getDenda());
        
    //Acessor
        //pinjaman1.setId (2546);
        //pinjaman1.setNama ("Emilio");
        //pinjaman1.setJk ("Laki-laki");
        //pinjaman1.setStaff ("Andi");
        //pinjaman1.setIdBuku (6);
        //pinjaman1.setNamaBuku ("Tidur dalam kubur");
        //pinjaman1.setTglPinjam (15032018);
        //pinjaman1.setTglKembali (22032018);
        //pinjaman1.setPinalti (3);
        //pinjaman1.setDenda (4500);
        
    //Output
        //System.out.println(pinjaman1.id);
        //System.out.println(pinjaman1.nama);
        //System.out.println(pinjaman1.jk);
        //System.out.println(pinjaman1.staff);
        //System.out.println(pinjaman1.idBuku);
        //System.out.println(pinjaman1.namaBuku);
        //System.out.println(pinjaman1.tglPinjam);
        //System.out.println(pinjaman1.tglKembali);
        //System.out.println(pinjaman1.pinalti);
        //System.out.println(pinjaman1.denda);
        
    //acessor
        //System.out.println(pinjaman1.getId() + " ");
        //System.out.println(pinjaman1.getNama() + " ");
        //System.out.println(pinjaman1.getJk() + " ");
        //System.out.println(pinjaman1.getStaff() + " ");
        //System.out.println(pinjaman1.getIdBuku() + " ");
        //System.out.println(pinjaman1.getNamaBuku() + " ");
        //System.out.println(pinjaman1.getTglPinjam() + " ");
        //System.out.println(pinjaman1.getTglKembali() + " ");
        //System.out.println(pinjaman1.getPinalti() + " ");
        //System.out.println(pinjaman1.getDenda() + " ");
    }
}
