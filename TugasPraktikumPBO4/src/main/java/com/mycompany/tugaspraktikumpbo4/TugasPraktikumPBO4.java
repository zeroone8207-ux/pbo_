/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspraktikumpbo4;

/**
 *
 * @author LENOVO
 */
// Class Manusia (non-public)
class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;

    // Constructor
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    // Getter dan Setter untuk atribut nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

// Class Pekerja yang mewarisi Manusia (non-public)
class Pekerja extends Manusia {
    private double gaji;

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter dan Setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString()
    @Override
    public String toString() {
        return "Nama      : " + getNama() + "\n" +
               "Usia      : " + usia + "\n" +
               "Pekerjaan : " + pekerjaan + "\n" +
               "Gaji      : Rp " + gaji;
    }
}

// Satu-satunya Public Class (Nama file harus Main.java)
public class TugasPraktikumPBO4 {
    public static void main(String[] args) {
        // 1. Buat objek dari kelas Pekerja
        Pekerja pekerja1 = new Pekerja("Budi", 30, "Software Engineer", 10000000);

        // 2. Tampilkan informasi pekerja menggunakan toString()
        System.out.println("=== Data Pekerja Awal ===");
        System.out.println(pekerja1.toString());

        // 3. Ubah nama pekerja menggunakan setter
        pekerja1.setNama("Budi Santoso");

        System.out.println("\n=== Data Pekerja Setelah Ubah Nama ===");
        System.out.println(pekerja1.toString());

        /*
         * 4. Analisis Akses Langsung Atribut:
         * 
         * - System.out.println(pekerja1.nama); 
         *   -> ERROR: 'nama' bersifat private pada Manusia, tidak bisa diakses langsung.
         * 
         * - System.out.println(pekerja1.usia); 
         *   -> BISA: 'usia' bersifat protected dan berada dalam package yang sama.
         * 
         * - System.out.println(pekerja1.pekerjaan); 
         *   -> BISA: 'pekerjaan' bersifat public.
         * 
         * - System.out.println(pekerja1.gaji); 
         *   -> ERROR: 'gaji' bersifat private pada Pekerja, tidak bisa diakses langsung.
         */
    }
}
