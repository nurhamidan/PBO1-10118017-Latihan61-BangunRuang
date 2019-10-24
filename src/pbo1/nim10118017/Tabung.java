package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini turunan dari BangunRuangPermukaanLengkung.
 *                        Di class ini ada atribut baru yaitu tinggi. Class ini akan
 *                        menghasilkan perhitungan volume tabung.
 * 
 */
public class Tabung extends BangunRuangPermukaanLengkung {
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(getJariJari(), 2) * tinggi;
    }
}
