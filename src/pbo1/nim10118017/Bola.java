package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini turunan dari BangunRuangPermukaanLengkung.
 * 
 */
public class Bola extends BangunRuangPermukaanLengkung {
    //method override dari superclass-nya untuk menghasilkan volume bola
    @Override
    public double hitungVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(getJariJari(), 3);
    }
}
