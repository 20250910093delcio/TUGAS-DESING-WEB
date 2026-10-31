import java.util.Scanner;

public class latihan_01 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Nama Pembeli : ");
            String namaPembeli = input.nextLine();
            
            System.out.print("Masukkan Jurusan      : ");
            String jurusan = input.nextLine();
            
            System.out.print("Masukkan Kelas        : ");
            String kelas = input.nextLine();
            
            System.out.print("Masukkan Jumlah Tiket : ");
            int jumlahTiket = input.nextInt();
            
            long harga = 0;
            
            if (jurusan.equalsIgnoreCase("Bandung")) {
                if (kelas.equalsIgnoreCase("Bisnis")) {
                    harga = 40000;
                } else if (kelas.equalsIgnoreCase("Ekonomi")) {
                    harga = 20000;
                }
            } else if (jurusan.equalsIgnoreCase("Jakarta")) {
                if (kelas.equalsIgnoreCase("Bisnis")) {
                    harga = 60000;
                } else if (kelas.equalsIgnoreCase("Ekonomi")) {
                    harga = 40000;
                }
            }
            
            if (harga == 0) {
                System.out.println("Data jurusan atau kelas tidak valid.");
                input.close();
                return;
            }
            long jumlahBayar = harga * jumlahTiket;
            
            System.out.println("\nOutput :");
            System.out.println("Nama Pembeli = " + namaPembeli);
            System.out.println("Jurusan      = " + jurusan);
            System.out.println("Kelas        = " + kelas);
            System.out.println("Jumlah Tiket = " + jumlahTiket);
            System.out.println("Harga        = " + harga);
            System.out.println("Jumlah Bayar = " + jumlahBayar);
        }
    }
}