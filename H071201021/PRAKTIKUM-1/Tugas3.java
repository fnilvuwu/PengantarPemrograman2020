import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ketinggian Menara : ");
        int h = input.nextInt();
        System.out.println("Sudut Elevasi Ujung Belakang Kapal (Tidak Lebih Dari 90) : ");
        int b = input.nextInt();
        System.out.println("Sudut Elevasi Ujung Depan Kapal (Tidak Lebih Dari Sudut Sebelumnya) : ");
        int a = input.nextInt();
        double panjang = (Math.tan(Math.toRadians(b)) - Math.tan(Math.toRadians(a))) * h;

        System.out.println(String.format("%.1f",panjang) + " m");
    }
}
