package pekan3;

import java.util.Scanner;

public class nilaiHuruf {

	public static void main(String[] args) {
		int nilai;
		Scanner berapa=new Scanner(System.in);
		System.out.print("Inputkan nilai angka: ");
		nilai=berapa.nextInt();
		berapa.close();
		
		if((nilai>100)||(nilai<0)) {
			System.out.println("Input nilai harus dalam rentang 0 s/d 100");
		}
		else if (nilai>=81) {
			System.out.println("A");
		}
		else if (nilai>=71) {
			System.out.println("B");
		}
		else if (nilai>=61) {
			System.out.println("C");
		}
		else if (nilai>=51) {
			System.out.println("D");
		}
		else if (nilai<51) {
			System.out.println("E");
		}
		
	}

}
