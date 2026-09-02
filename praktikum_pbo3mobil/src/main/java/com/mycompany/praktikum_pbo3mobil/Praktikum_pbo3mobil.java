/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_pbo3mobil;

/**
 *
 * @author LENOVO
 */
class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    public Mobil(String merk, String model, int tahun, String warna) {
        this. merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala");
    }
    public void displayInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
        System.out.println("Warna : " + warna);
    }
}

public class Praktikum_pbo3mobil {

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Ford", "RS200", 1984, "Putih");
        Mobil mobil2 = new Mobil("Vauxhall", "Monaro", 2004, "Kuning");
        
        mobil1.startEngine();
        mobil2.startEngine();
        
        System.out.println("\nInformasi awal");
        mobil1.displayInfo();
        mobil2.displayInfo();
        
        mobil1.setWarna("Hitam");
        mobil2.setWarna("Merah");
        
        System.out.println("\nSetelah perubahan warna");
        mobil1.displayInfo();
        mobil2.displayInfo();
    }
}
