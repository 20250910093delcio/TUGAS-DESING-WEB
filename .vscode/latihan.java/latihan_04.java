import java.util.Scanner;

public class latihan_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Gol (2A/2B/3A/3B): ");
        String gol = scanner.nextLine();

        System.out.print("Status: ");
        String status = scanner.nextLine();

        System.out.print("Jumlah Anak: ");
        int jumlahAnak = scanner.nextInt();

        long gajiPokok = 0;
        long tunjKesehatan = 0;

        if (gol.equalsIgnoreCase("2A")) {
            gajiPokok = 1000000;
            tunjKesehatan = 100000;
        } else if (gol.equalsIgnoreCase("2B")) {
            gajiPokok = 1500000;
            tunjKesehatan = 200000;
        } else if (gol.equalsIgnoreCase("3A")) {
            gajiPokok = 2000000;
            tunjKesehatan = 300000;
        } else if (gol.equalsIgnoreCase("3B")) {
            gajiPokok = 2500000;
            tunjKesehatan = 400000;
        } else {
            System.out.println("Golongan tidak valid!");
            scanner.close();
            return;
        }

        double totalKotor = gajiPokok + tunjKesehatan;
        double pajak = totalKotor * 0.10;
        double totalGaji = totalKotor - pajak;

        System.out.println("\nOutput :");
        System.out.println("Nama            = " + nama);
        System.out.println("Gol             = " + gol.toUpperCase());
        System.out.println("Gaji Pokok      = " + gajiPokok);
        System.out.println("Tunj Kesehatan  = " + tunjKesehatan);
        System.out.println("Pajak 10%       = " + (long)pajak);
        System.out.println("Total Gaji      = " + (long)totalGaji);

        scanner.close();
    }
}