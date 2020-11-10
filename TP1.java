import java.util.Scanner;

public class TP1 {
public static void main(String[] args){
        Scanner obj = new Scanner (System.in);
        System.out.println("Masukkan nilai awal dan akhir (awal<akhir)");
        while (true) {
                int x = obj.nextInt();
                int y = obj.nextInt();
                if (y>x) {
                        for (int i = x; i <= y; i++) {
                                if (i%2 == 0 & i!=0) {
                                        System.out.print(i + " genap");
                                }
                                else if (i == 0) {
                                        System.out.print(i);
                                }
                                else {
                                        System.out.print(i + " ganjil");
                                }

                                if (i > 0) {
                                        System.out.println(" positif");
                                }
                                else if (i == 0) {
                                        System.out.println(" nol");
                                }
                                else {
                                        System.out.println(" negatif");
                                }
                        }
                }
                else {
                        System.out.println("Nilai awal harus lebih kecil dari nilai akhir (awal<akhir)");
                }
        }
}
}
