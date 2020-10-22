import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Detik : ");
        int jumlahdetik = input.nextInt();
        int jam = jumlahdetik/3600;
        int menit = (jumlahdetik - jam*3600)/60;
        int detik = jumlahdetik - jam*3600 - menit*60;

        System.out.println(String.format("%02d",jam) + ":" + String.format("%02d",menit) + ":" + String.format("%02d",detik));
    }
}
