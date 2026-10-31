import java.util.Scanner;

public class latihan_00 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String Nama, Jurusan, Kelas;
            int JTiket, Harga = 0, JBayar;

            System.out.print("Masukan Nama : ");
            Nama = input.nextLine();

            System.out.print("Jurusan (Bandung/Jakarta) : ");
            Jurusan = input.nextLine();

            System.out.print("Kelas (Bisnis/Ekonomi) : ");
            Kelas = input.nextLine();

            System.out.print("Jumlah Tiket : ");
            JTiket = input.nextInt();

            if (Kelas.equalsIgnoreCase("Bisnis")) {
                Harga = 150000;
            } else if (Kelas.equalsIgnoreCase("Ekonomi")) {
                Harga = 100000;
            }
                                    
            JBayar = Harga * JTiket;

            System.out.println("\n===== HASIL PEMESANAN TIKET =====");
            System.out.println("Nama         : " + Nama);
            System.out.println("Tujuan       : " + Jurusan);
            System.out.println("Kelas        : " + Kelas);
            System.out.println("Jumlah Tiket : " + JTiket);
            System.out.println("Harga Satuan : Rp " + Harga);
            System.out.println("Total Bayar  : Rp " + JBayar);
            System.out.println("==================================");
        }
    }
}