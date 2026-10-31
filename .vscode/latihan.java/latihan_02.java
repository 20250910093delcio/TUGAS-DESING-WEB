import java.util.Scanner;

public class latihan_02 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

        
        System.out.print("Masukkan Nama Pembeli : ");
        String namaPembeli = input.nextLine();

        System.out.print("Masukkan Kode Barang  : ");
        String kodeBarang = input.nextLine();

        System.out.print("Masukkan Jumlah       : ");
        int jumlah = input.nextInt();

        String namaBarang;
        long hargaSatuan = 0;

        switch (kodeBarang.toUpperCase()) {
            case "A01":
                namaBarang = "Hardisk";
                hargaSatuan = 700000;
                break;
            case "B02":
                namaBarang = "Monitor";
                hargaSatuan = 800000;
                break;
            case "C02":
                namaBarang = "Mouse";
                hargaSatuan = 50000;
                break;
            default:
                System.out.println("Kode barang tidak terdaftar.");
                return;
        }  
        long jumlahBayar = hargaSatuan * jumlah;

        System.out.println("\nOutput :");
        System.out.println("Nama Pembeli = " + namaPembeli);
        System.out.println("Kode Barang  = " + kodeBarang);
        System.out.println("Nama Barang  = " + namaBarang);
        System.out.println("Jumlah       = " + jumlah);
        System.out.println("Harga Satuan = " + hargaSatuan);
        System.out.println("Jumlah Bayar = " + jumlahBayar);

        }
    }
}