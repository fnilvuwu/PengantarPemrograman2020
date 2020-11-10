import java.util.Scanner;

public class TP4 {
public static void main(String[] args){
        Scanner obj = new Scanner (System.in);
        System.out.println("Masukkan harga barang dan nilai uang");
        while (true) {
                int x = obj.nextInt();
                int y = obj.nextInt();
                if (y>x) {
                        int kembalian = y-x;
                        int ratusribu = 0;
                        int limapuluhribu = 0;
                        int duapuluhribu = 0;
                        int sepuluhribu = 0;
                        int limaribu = 0;
                        int duaribu = 0;
                        int seribu = 0;
                        while (kembalian != 0) {
                                if (kembalian % 100000 == 0) {
                                        ratusribu++;
                                        kembalian=kembalian-100000;
                                }
                                else if (kembalian % 50000 == 0) {
                                        limapuluhribu++;
                                        kembalian=kembalian-50000;
                                }
                                else if (kembalian % 20000 == 0) {
                                        duapuluhribu++;
                                        kembalian=kembalian-20000;
                                }
                                else if (kembalian % 10000 == 0) {
                                        sepuluhribu++;
                                        kembalian=kembalian-10000;
                                }
                                else if (kembalian % 5000 == 0) {
                                        limaribu++;
                                        kembalian=kembalian-5000;
                                }
                                else if (kembalian % 2000 == 0) {
                                        duaribu++;
                                        kembalian=kembalian-2000;
                                }
                                else if (kembalian % 1000 == 0) {
                                        seribu++;
                                        kembalian=kembalian-1000;
                                }
                        }
                        System.out.println(ratusribu + " uang Rp. 100.000");
                        System.out.println(limapuluhribu + " uang Rp. 50.000");
                        System.out.println(duapuluhribu + " uang Rp. 20.000");
                        System.out.println(sepuluhribu + " uang Rp. 10.000");
                        System.out.println(limaribu + " uang Rp. 5.000");
                        System.out.println(duaribu + " uang Rp. 2.000");
                        System.out.println(seribu + " uang Rp. 1.000");
                }
                else {
                        System.out.println("Harga barang harus lebih kecil dari nilai uang (awal<akhir)");
                }
        }
}
}
