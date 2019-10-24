package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class main. Memanggil semua yang dibutuhkan agar program dapat berjalan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instansiasi objek
        Bola bola = new Bola();
        Tabung tabung = new Tabung();
        Kerucut kerucut = new Kerucut();
        
        //Proses menghasilkan volume bola
        bola.setJariJari(7);
        System.out.println("===Bola===");
        System.out.println("Jari-jari : " + bola.getJariJari());
        System.out.printf("Maka, volumenya adalah %.2f cm3%n%n", bola.hitungVolume());
        
        //Proses menghasilkan volume tabung
        tabung.setJariJari(10);
        tabung.setTinggi(21);
        System.out.println("===Tabung===");
        System.out.println("Jari-jari : " + tabung.getJariJari());
        System.out.println("Tinggi : " + tabung.getTinggi());
        System.out.printf("Maka, volumenya adalah %.2f cm3%n%n", tabung.hitungVolume());
        
        //proses menghasilkan volume kerucut
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        System.out.println("===Kerucut===");
        System.out.println("Jari-jari : " + kerucut.getJariJari());
        System.out.println("Tinggi : " + kerucut.getTinggi());
        System.out.printf("Maka, volumenya adalah %.2f cm3%n%n", kerucut.hitungVolume());
    }
    
}
