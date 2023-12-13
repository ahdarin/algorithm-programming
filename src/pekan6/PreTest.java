package pekan6;

import java.util.Scanner;

public class PreTest { //Pre test batal 😹😹😹

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int nilai=scan.nextInt();
		
		for (int faktor=nilai; faktor>=1; faktor--) {
			if (nilai%faktor==0) {
				System.out.println(faktor);
			}
		}
		scan.close();
		
	}

}
