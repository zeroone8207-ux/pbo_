/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspraktikumpbo_5;

/**
 *
 * @author LENOVO
 */
// Kelas Induk
class Hewan {
    protected String nama;
    protected String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

// Kelas Turunan 1
class Kucing extends Hewan {
    private final String suara;

    public Kucing(String nama, String jenis, String suara) {
        super(nama, jenis);
        this.suara = suara;
    }

    public void bersuara() {
        System.out.println("Suara : " + suara);
    }

    // Overriding metode tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara();
        System.out.println("-------------------------");
    }
}

// Kelas Turunan 2
class Anjing extends Hewan {
    private final String suara;

    public Anjing(String nama, String jenis, String suara) {
        super(nama, jenis);
        this.suara = suara;
    }

    public void bersuara() {
        System.out.println("Suara : " + suara);
    }

    // Overriding metode tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara();
        System.out.println("-------------------------");
    }
}

// Level 1: Kelas Induk Utama
class Kendaraan {
    protected String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan : " + nama);
    }
}

// Level 2: Kelas Menengah (Menurunkan Kendaraan)
class KendaraanDarat extends Kendaraan {
    protected int jumlahRoda;

    public KendaraanDarat(String nama, int jumlahRoda) {
        super(nama);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda    : " + jumlahRoda);
    }
}

// Level 3: Kelas Turunan Spesifik (Menurunkan KendaraanDarat)
class Mobil extends KendaraanDarat {
    private final int jumlahPintu;

    public Mobil(String nama, int jumlahRoda, int jumlahPintu) {
        super(nama, jumlahRoda);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
        System.out.println("-------------------------");
    }
}

class SepedaMotor extends KendaraanDarat {
    private final String jenisMesin;

    public SepedaMotor(String nama, int jumlahRoda, String jenisMesin) {
        super(nama, jumlahRoda);
        this.jenisMesin = jenisMesin;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin    : " + jenisMesin);
        System.out.println("-------------------------");
    }
}

public class TugasPraktikumPBO_5 {

    public static void main(String[] args) {
        System.out.println("=== UJI COBA HEWAN ===");
        Kucing kucing = new Kucing("Komo", "Scottish Fold", "Meong... Meong...");
        Anjing anjing = new Anjing("Clover", "Malamute", "Guk... Guk...");

        kucing.tampilkanInfo();
        anjing.tampilkanInfo();

        System.out.println("\n=== UJI COBA HIERARKI KENDARAAN ===");
        Mobil mobil = new Mobil("Mercedes W124", 4, 4);
        SepedaMotor motor = new SepedaMotor("Husqvarna", 2, "4 Stroke");

        mobil.tampilkanInfo();
        motor.tampilkanInfo();
    }
}
