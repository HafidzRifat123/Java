import java.util.Scanner;
class Gaji {
    public static void main(String[] args) {
        String NPP, Nama;
        Double GajiPokok, Tunjangan, TidakHadir, Potongan, GajiTotal;

        Scanner input = new Scanner(System.in);
        
        System.out.println();
        System.out.println("## Daftar Penerima Gaji - November 2023 ##");
        System.out.println("======================================================");
        System.out.println();

        System.out.print("NPP         : "); //Manual
        NPP = input.nextLine();

        System.out.print("Nama        : "); //Manual
        Nama = input.nextLine();

        System.out.print("Gaji Pokok  : "); //Manual
        GajiPokok = input.nextDouble();
        input.nextLine();

        System.out.print("Tunjangan   : "); //Manual
        Tunjangan = input.nextDouble();
        input.nextLine();

        System.out.print("Tidak Hadir : "); //Manual
        TidakHadir = input.nextDouble();
        input.nextLine();

        Potongan = TidakHadir * 100000;
        GajiTotal = (GajiPokok + Tunjangan) - Potongan;

        System.out.println("Potongan    : " + Potongan);

        System.out.println("Gaji Total  : " + GajiTotal);

        System.out.println();
        System.out.println("======================================================");
    }
}