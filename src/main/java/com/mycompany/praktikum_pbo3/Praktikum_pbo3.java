/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_pbo3;

/**
 *
 * @author LENOVO
 */
class Hewan {
    String nama;
    int umur;
    
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    void suara() {
        System.out.println("Hewan bersuara");
    }
    
    void info() {
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur());
    }
    void berlari() {
        System.out.println("Hewan sedang berlari");
    }
}

public class Praktikum_pbo3 {

    public static void main(String[] args) {
        Hewan kucing = new Hewan("Mimi", 3);
        
        kucing.suara();
        kucing.info();
        
        Hewan anjing = new Hewan("Shiba", 2);
        anjing.info();
        anjing.berlari();
    }
}
