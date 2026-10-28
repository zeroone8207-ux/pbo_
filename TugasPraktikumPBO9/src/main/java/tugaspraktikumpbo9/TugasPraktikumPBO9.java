/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugaspraktikumpbo9;

/**
 *
 * @author LENOVO
 */
abstract class Hewan {
    abstract void suara();
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeluarkan suara : Meong");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing mengeluarkan suara : Guk guk");
    }
}
public class TugasPraktikumPBO9 {

    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.suara();
        anjing.suara();
    }
}
