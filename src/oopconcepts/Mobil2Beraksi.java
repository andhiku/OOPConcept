/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopconcepts;

/**
 *
 * @author Yudha
 */
public class Mobil2Beraksi {
    public static void main(String[] args) {
        Mobil2 mobil1 = new Mobil2();
        mobil1.warna = "Merah";
        mobil1.tahunProduksi = 2015;
        
        mobil1.printMobil();
    }
}
