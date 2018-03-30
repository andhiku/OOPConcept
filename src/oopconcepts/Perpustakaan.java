package oopconcepts;

public class Perpustakaan {

    int id;
    String nama;
    String jk;
    String staff;
    int idBuku;
    String namaBuku;
    int tglPinjam;
    int tglKembali;
    int pinalti;
    int denda;

    //acessor
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJk() {
        return jk;
    }

    public String getStaff() {
        return staff;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public int getTglPinjam() {
        return tglPinjam;
    }

    public int getTglKembali() {
        return tglKembali;
    }

    public int getPinalti() {
        return pinalti;
    }

    public int getDenda() {
        return denda;
    }

    
    
    //mutator
    public void setId(int id) {
        this.id = id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJk(String jk) {
        this.jk = jk;
    }
    public void setStaff(String staff) {
        this.staff = staff;
    }
    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }
    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }
    public void setTglPinjam(int tglPinjam) {
        this.tglPinjam = tglPinjam;
    }
    public void setTglKembali(int tglKembali) {
        this.tglKembali = tglKembali;
    }
    public void setPinalti(int pinalti) {
        this.pinalti = pinalti;
    }
    public void setDenda(int denda) {
        this.denda = denda;
    }
}
