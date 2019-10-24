package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini turunan dari Tabung. Karena,
 *                        kerucut dan tabung memiliki atribut yang sama hanya
 *                        berbeda di rumusnya saja. Tujuannya agar efisien.
 * 
 */
public class Kerucut extends Tabung {
    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(getJariJari(), 2) * getTinggi() / 3;
    }
}
