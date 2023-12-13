package pekan2;

import java.util.Scanner;

public class LuasSegitiga {

	public static void main(String[] args) {
		int alas, tinggi;
		double luas;
		System.out.println("Halo! Mari kita menghitung luas dari bangun segitiga! "
				+ "Segitiganya dari kamu yaa...");
		Scanner input = new Scanner(System.in); //input
		System.out.println("Alas Segitiga: ");
		alas = input.nextInt();
		System.out.println("Tinggi Segitiga: ");
		tinggi = input.nextInt();
		input.close();
		
		luas = 0.5*(alas*tinggi);
		// atau bisa menggunakan operasi (alas*tinggi)/2.0
		System.out.println("Luas segitiga anda adalah= " + luas);

	}

}
