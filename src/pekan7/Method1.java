package pekan7;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		int umur;
		char sim;
		String jawab="ya";
		Scanner input = new Scanner(System.in);
		
		while(!jawab.equalsIgnoreCase("tidak")) {
			
		System.out.println("Berapa Umurmu?");
		umur=input.nextInt();
		System.out.println("Apakah anda sudah memiliki SIM C?");
		sim=input.next().charAt(0);
		
		razia(umur,sim);
		
		System.out.println("ulang? (ya/tidak)");
		jawab=input.next();

		}
		System.out.println("Terimakasih");
		input.close();
	}
	
	static void razia(int a, char b) {
		if((a>=17)&&(b=='y')) {
			System.out.println("Anda sudah dewasa dan boleh bawa motor");
		} if ((a>=17)&&(b!='y')) {
			System.out.println("Anda sudah dewasa, tetapi tidak boleh bawa motor");
		} if ((a<17)&&(b!='y')) {
			System.out.println("Anda masih bocah dan belum boleh bawa motor");
		}
	}
}
