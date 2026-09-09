/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author LENOVO
 */
class Kendaraan {
    private String nama;
    protected int topspeed;
    public String jenisMesin;

    public Kendaraan(String nama, int topspeed, String jenisMesin) {
        this.nama = nama;
        this.topspeed = topspeed;
        this.jenisMesin = jenisMesin;
    }   
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
class Mobil extends Kendaraan {
    private final int jumlahPintu;
    
    public Mobil(String nama, int topspeed, String jenisMesin, int jumlahPintu) {
        super(nama, topspeed, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }
    public void tampilkaninfoMobil() {
        System.out.println("Kecepatan Maksimum Mobil: " + topspeed + " km/h" );
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
public class PraktikumPBO4 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota Supra", 250, "2JZ", 2);

        System.out.println("=== Informasi Mobil ===");
        System.out.println("Nama Kendaraan : " + mobil1.getNama());
        mobil1.tampilkaninfoMobil();
    }
}