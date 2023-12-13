package pekan3;

import java.util.Scanner;

public class CekUmur2 {

	public static void main(String[] args) {
		int umur;
		char sim;
		System.out.println("Berapa Umurmu?");
		Scanner input = new Scanner(System.in);
		umur=input.nextInt();
		System.out.println("Apakah anda sudah memiliki SIM C?");
		sim=input.next().charAt(0);
		input.close();
		
		if((umur>=17)&&(sim=='y')) {
			System.out.println("Anda sudah dewasa dan boleh bawa motor");
		} if ((umur>=17)&&(sim!='y')) {
			System.out.println("Anda sudah dewasa, tetapi tidak boleh bawa motor");
		} if ((umur<17)&&(sim!='y')) {
			System.out.println("Anda masih bocah dan belum boleh bawa motor");
		}
	}
	
}
