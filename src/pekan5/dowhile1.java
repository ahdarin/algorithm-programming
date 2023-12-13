package pekan5;

import java.util.Scanner;

public class dowhile1 {

	public static void main(String[] args) {
		int counter=0; 
		String jawab; 
		boolean running=true;
		
		Scanner scan = new Scanner(System.in);
		do {
			counter++;
			System.out.println("Jumlah= " + counter);
			System.out.print("Apakah lanjut? (ya/tidak)");
			jawab = scan.next();
			if (jawab.equalsIgnoreCase("tidak")) {
				running = false;
			}
		} while (running) ;
		System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
		scan.close();
	}
}
   