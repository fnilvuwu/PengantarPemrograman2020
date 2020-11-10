import java.util.Scanner;

public class TP5 {
public static void main(String[] args){
        Scanner obj = new Scanner (System.in);
        System.out.println("Masukkan posisi matahari atau bulan (derajat)");
        while (true) {
                float x = obj.nextFloat();
                if (x>=0) {
                        float detik=x*240f;
                        int jam = 6;
                        int menit = 0;
                        int jumlahdetik = 0;
                        String hari = "";
                        while (detik!=0) {

                                if (detik % 3600 == 0) {
                                        jam++;
                                        detik=detik-3600;
                                }
                                else if (detik % 60 == 0) {
                                        menit++;
                                        detik=detik-60;
                                }
                                else {
                                        jumlahdetik++;
                                        detik=detik-1;
                                }
                        }
                        //jam tidak boleh lebih dari 30 jam
                        if (jam > 24) {
                                jam=jam-24;
                        }

                        //menentukan waktu pagi, siang, sore atau malam
                        if (jam >= 4 & jam < 10) {
                                hari="Pagi";
                        }
                        else if (jam >= 10 & jam < 14) {
                                hari="Siang";
                        }
                        else if (jam >= 14 & jam < 18) {
                                hari="Sore";
                        }
                        else {
                                hari="Malam";
                        }

                        System.out.println("Selamat " + hari);
                        System.out.println(String.format("%02d",jam) + ":" + String.format("%02d",menit) + ":" + String.format("%02d",jumlahdetik));

                }
                else {
                        System.out.println("derajat harus lebih dari 0");
                }
        }
}
}
