/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author LENOVO
 */
class Animal {
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}
public class Hewanmakan {
    public static void main(String[] args) {
        Animal kucing = new Animal();
        kucing.bersuara(); 
        kucing.makan("ikan"); 
        kucing.makan("ikan", 2); 
    }
}
