import java.util.Scanner;

public class TP3 {
public static void main(String[] args){
        Scanner obj = new Scanner (System.in);
        System.out.println("Masukkan nilai X (X > 0)");
        while (true) {
                int x = obj.nextInt();
                int a = 0;
                int b = 1;
                int next;
                System.out.print(a + " ");
                System.out.print(b + " ");
                int count = 2;
                if (x>=0) {
                        for (int i = 0; i <= x; i++) {
                                next = a + b;
                                System.out.print(next + " ");
                                a=b;
                                b=next;
                        }
                }
                else {
                        System.out.println("Nilai X harus lebih besar dari 0");
                }
        }
}
}
