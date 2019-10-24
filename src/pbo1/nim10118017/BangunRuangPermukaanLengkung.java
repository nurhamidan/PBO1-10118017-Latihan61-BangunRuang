package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini turunan dari class BangunRuang.
 *                        Dibuatnya class ini karena setiap bangun ruang yang sifat permukaannya lengkung,
 *                        maka akan memiliki jari jari.
 * 
 */
public abstract class BangunRuangPermukaanLengkung extends BangunRuang {
    private double jariJari;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
}
