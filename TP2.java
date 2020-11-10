import java.util.Scanner;

public class TP2 {
public static void main(String[] args){
        Scanner obj = new Scanner (System.in);
        System.out.println("Masukkan nilai X dan Y (X < Y)");
        while (true) {
                int x = obj.nextInt();
                int y = obj.nextInt();
                if (y>x) {
                        for (int i = 1; i <= y; i++) {
                                if (i%x == 0 & i!=0) {
                                        System.out.print(i);
                                        System.out.println();
                                }
                                else {
                                        System.out.print(i + " ");
                                }
                        }
                }
                else {
                        System.out.println("Nilai X harus lebih kecil dari nilai Y (X < Y)");
                }
        }
}
}
