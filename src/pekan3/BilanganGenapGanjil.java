package pekan3;

import java.util.Scanner;

public class BilanganGenapGanjil {

	public static void main(String[] args) {
		long nim;
		Scanner input=new Scanner(System.in);
		System.out.print("Input NIM: ");
		nim=input.nextLong();
		input.close();
		
		if (nim%2!=0) {
			System.out.println(nim + " merupakan Bilangan Ganjil");
		} else {
			System.out.println(nim + " merupakan Bilangan Genap");

		}
	}

}
