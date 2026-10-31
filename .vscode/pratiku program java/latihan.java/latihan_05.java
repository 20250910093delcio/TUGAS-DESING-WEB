import java.util.Scanner;

public class latihan_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Data
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Gol (2A/2B/3A/3B): ");
        String gol = scanner.nextLine();

        System.out.print("Status (Menikah/Belum): ");
        String status = scanner.nextLine();

        System.out.print("Jumlah Anak: ");
        int jumlahAnak = scanner.nextInt();

        long gajiPokok = 0;

        if (gol.equalsIgnoreCase("2A")) {
            gajiPokok = 1000000;
        } else if (gol.equalsIgnoreCase("2B")) {
            gajiPokok = 1500000;
        } else if (gol.equalsIgnoreCase("3A")) {
            gajiPokok = 2000000;
        } else if (gol.equalsIgnoreCase("3B")) {
            gajiPokok = 2500000;
        } else {
            System.out.println("Golongan tidak valid!");
            scanner.close();
            return;
        }

        long tunjSuamiIstri = 0;
        if (status.equalsIgnoreCase("Menikah") || status.equalsIgnoreCase("Nikah")) {
            tunjSuamiIstri = (long) (0.10 * gajiPokok);
        }

        
        int anakDihitung = Math.min(jumlahAnak, 2);
        if (anakDihitung < 0) {
            anakDihitung = 0;
        }
        long tunjAnak = (long) (0.05 * gajiPokok * anakDihitung);

     
        long gajiKotor = gajiPokok + tunjSuamiIstri + tunjAnak;
        long pajak = (long) (0.10 * gajiKotor);
        long gajiBersih = gajiKotor - pajak;

        System.out.println("\nOutput :");
        System.out.println("Nama             = " + nama);
        System.out.println("Gol              = " + gol.toUpperCase());
        System.out.println("Status           = " + status);
        System.out.println("Jumlah Anak      = " + jumlahAnak);
        System.out.println("Gaji Pokok       = " + gajiPokok);
        System.out.println("Tunj Suami/Istri = " + tunjSuamiIstri);
        System.out.println("Tunjangan Anak   = " + tunjAnak);
        System.out.println("Gaji Kotor       = " + gajiKotor);
        System.out.println("Pajak 10%        = " + pajak);
        System.out.println("Gaji Bersih      = " + gajiBersih);

        scanner.close();
    }
}