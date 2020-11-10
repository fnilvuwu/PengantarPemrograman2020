import java.util.Scanner;

public class TP3 {
public static void main(String[] args){
        Scanner obj = new Scanner (System.in);
        System.out.println("Masukkan nilai X (X > 0)");
        while (true) {
                int x = obj.nextInt();
                int ctrl = 0;
                int fibonacci = 0;
                if (x>=0) {
                        for (int i = 0; i <= x; i++) {
                                fibonacci = ctrl + fibonacci;
                                System.out.print(fibonacci + " ");
                        }
                }
                else {
                        System.out.println("Nilai X harus lebih besar dari 0");
                }
        }
}
}
