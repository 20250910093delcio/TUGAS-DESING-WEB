import java.util.Scanner;

public class latihan_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama        : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Gol (2A/2B/3A/3B) : ");
        String gol = input.nextLine();

        System.out.print("Masukkan Status      : ");
        String status = input.nextLine();

        System.out.print("Masukkan Jumlah Anak : ");
        int jumlahAnak = input.nextInt();

        long gajiPokok = 0;

        switch (gol.toUpperCase()) {
            case "2A":
                gajiPokok = 1000000;
                break;
            case "2B":
                gajiPokok = 1500000;
                break;
            case "3A":
                gajiPokok = 2000000;
                break;
            case "3B":
                gajiPokok = 2500000;
                break;
            default:
                System.out.println("Golongan tidak terdaftar.");
                input.close();
                return;
        }

        long pajak = (long) (gajiPokok * 0.10);
        long totalGaji = gajiPokok - pajak;

        System.out.println("\nOutput :");
        System.out.println("Nama       = " + nama);
        System.out.println("Gol        = " + gol.toUpperCase());
        System.out.println("Gaji Pokok = " + gajiPokok);
        System.out.println("Pajak 10%  = " + pajak);
        System.out.println("Total Gaji = " + totalGaji);

        input.close();
    }
}