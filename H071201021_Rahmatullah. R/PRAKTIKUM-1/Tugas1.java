import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double efisiensi = 14;
        System.out.println("Masukkan Waktu Perjalanan :");
        int waktu = input.nextInt();
        System.out.println("Masukkan Kecepatan Rata-Rata :");
        int kecepatan = input.nextInt();
        double bensin = waktu*kecepatan/efisiensi;
        System.out.println("Bensin yang digunakan : " +  String.format("%.3f",bensin) + " L");
    }
}
