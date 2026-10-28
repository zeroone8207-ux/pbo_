/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum9;

/**
 *
 * @author LENOVO
 */
abstract class Kendaraan {
    abstract void berjalan();
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}

class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat");
    }
}
class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan dengan lambat");
    }
}
    

public class Praktikum_pbo9 {

    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
        
        
    }
}
