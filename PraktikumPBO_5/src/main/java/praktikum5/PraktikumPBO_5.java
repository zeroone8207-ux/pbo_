/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum5;

/**
 *
 * @author LENOVO
 */
class Kendaraan {
    String nama;
    int kecepatan;
    
    public void tampilkaninfo() {
         System.out.println("Nama Kendaraan : " + nama);
         System.out.println("kecepatan : " + kecepatan + " km/jam");
    
    }
}

class Mobil extends Kendaraan {
    int jumlahPintu;
    
    @Override
    public void tampilkaninfo() {
        super.tampilkaninfo();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}

class SepedaMotor extends Kendaraan {
    String jenisMesin;
    
    @Override
    public void tampilkaninfo() {
        super.tampilkaninfo();
        System.out.println("Jenis Mesin : " + jenisMesin);
    }
}
public class PraktikumPBO_5 {

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Lexus";
        mobil.kecepatan = 325;
        mobil.jumlahPintu = 2;
        mobil.tampilkaninfo();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Kawasaki";
        motor.kecepatan = 400;
        motor.jenisMesin = "I4SC";
        motor.tampilkaninfo();
    }
}
