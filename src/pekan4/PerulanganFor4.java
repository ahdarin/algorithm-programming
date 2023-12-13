package pekan4;

import java.util.Scanner;

public class PerulanganFor4 {
	public static void main(String[] args) {
	
		//input batas angkanya
		int batas; 
		Scanner input = new Scanner(System.in);
		System.out.print("Batas = ");
		batas=input.nextInt();
		input.close();
		
		int j=0;
		//penjumlahannya
		for (int i=batas;i>=1;i--) {
			if (i>1) {
				System.out.print(i+" + ");	
			} else {
				System.out.println(i);
			}
			j=j+i;
		}
		//jumlahnya
		System.out.println("jumlah = " + j );
	}
}
