package pekan3;

import java.util.Scanner;

class CekUmur {

	public static void main(String[] args) {
		int umur;
		System.out.println("Berapa Umurmu?");
		Scanner input = new Scanner(System.in);
		umur=input.nextInt();
		input.close();
		
		if(umur>=17) { //if untuk kondisi TRUE
			System.out.println("Anda sudah dewasa");
		} else { //else untuk kondisi FALSE
			System.out.println("Anda masih bocah");
		}
	}
	
}
