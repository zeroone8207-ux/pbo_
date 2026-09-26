/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author LENOVO
 */
class Produk {
    protected String nama;
    protected double harga;
    
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public double hitungDiskon() {
        return 0;
    }
    public double getHarga() {
        return harga;
    }
    public String getNama() {
        return nama;
    }
}
class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 0.10;
    }
}
class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }
    @Override
    public double hitungDiskon() {
        return harga * 0.05;
    }
}
class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }
    @Override
    public double hitungDiskon() {
        return harga * 0.20;
    }
}
class KeranjangBelanja {
    private final Produk[] listProduk;
    private int jumlahProduk;
    
    public KeranjangBelanja(int kapasitas) {
        this.listProduk = new Produk[kapasitas];
        this.jumlahProduk = 0;
    }
    public void tambahProduk(Produk produk) {
        if (jumlahProduk < listProduk.length) {
            listProduk[jumlahProduk] = produk;
            jumlahProduk++;
        } else {
            System.out.println("Keranjang sudah penuh!");
        }
    }
    public double hitungTotalSetelahDiskon() {
        double total = 0;
        for (int i = 0; i < jumlahProduk; i++) {
            double diskon = listProduk[i].hitungDiskon();
            double hargaSetelahDiskon = listProduk[i].getHarga() - diskon;
            total += hargaSetelahDiskon;
        }
        return total;
    }
}
public class PraktikumPBO6 {

    public static void main(String[] args) {
        Produk buku1 = new Buku("Novel Art of Racing", 950000);
        Produk laptop = new Elektronik("Lenovo ThinkPad", 10000000);
        Produk kemeja = new Pakaian("Kemeja Kotak Merah", 150000);
        
        KeranjangBelanja keranjang = new KeranjangBelanja(10);
        
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(kemeja);
        
        double totalBayar = keranjang.hitungTotalSetelahDiskon();
        
        System.out.println("DETAIL KERANJANG BELANJA");
        System.out.println("1. " + buku1.getNama() + " | Harga : Rp " + buku1.getHarga() + " | Diskon : Rp " + buku1.hitungDiskon());
        System.out.println("1. " + laptop.getNama() + " | Harga : Rp " + laptop.getHarga() + " | Diskon : Rp " + laptop.hitungDiskon());
        System.out.println("1. " + kemeja.getNama() + " | Harga : Rp " + kemeja.getHarga() + " | Diskon : Rp " + kemeja.hitungDiskon());
        System.out.println("-------------------------------------");
        System.out.printf("Total Pembayaran Setelah Diskon: Rp %.2f%n", totalBayar);
    }
}
