import java.util.Scanner;
public class TP1 {
    public static void main(String[] args) {
    	try {
        Scanner input = new Scanner(System.in);
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;
        System.out.println("Masukkan 5 Angka : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        
		//1
        if (num1 % 2 == 0) {
        	genap++;
        }
        else {
        	ganjil++;
        }

        if (num1 >= 0) {
        	if (num1 > 0) {
        	positif++;
        	}
        }
        else {
        	negatif++;
        }

        //2
        if (num2 % 2 == 0) {
        	genap++;
        }
        else {
        	ganjil++;
        }

        if (num2 >= 0) {
        	if (num2 > 0) {
        	positif++;
        	}
        }
        else {
        	negatif++;
        }

        //3
        if (num3 % 2 == 0) {
        	genap++;
        }
        else {
        	ganjil++;
        }

        if (num3 >= 0) {
        	if (num3 > 0) {
        	positif++;
        	}
        }
        else {
        	negatif++;
        }

        //4
        if (num4 % 2 == 0) {
        	genap++;
        }
        else {
        	ganjil++;
        }

        if (num4 >= 0) {
        	if (num4 > 0) {
        	positif++;
        	}
        }
        else {
        	negatif++;
        }

        //5
        if (num5 % 2 == 0) {
        	genap++;
        }
        else {
        	ganjil++;
        }

        if (num5 >= 0) {
        	if (num5 > 0) {
        	positif++;
        	}
        }
        else {
        	negatif++;
        }

        System.out.println(genap + " Angka Genap");
        System.out.println(ganjil + " Angka Ganjil");
        System.out.println(positif + " Angka Positif");
        System.out.println(negatif + " Angka Negatif");

    	}
    	    catch (Exception e) {
            System.out.println("Inputan Tidak Valid");
        }

        
	}
}