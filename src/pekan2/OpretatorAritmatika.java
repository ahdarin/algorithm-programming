package pekan2;

import java.util.Scanner; //import untuk input

public class OpretatorAritmatika {

	public static void main(String[] args) {
		int A1, A2, hasil;
		Scanner keyboard = new Scanner(System.in); //input
		System.out.println("Input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.println("Input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close(); //mengakhiri proses input
		
		//operasi penjumlahan A1 dan A2
		System.out.println("Operator Penjumlahan");
		hasil = A1 + A2;
		System.out.println("Hasil penjumlahan=" + hasil);

		
		//operasi pengurangan A1 dan A2
		System.out.println("Operator Pengurangan");
		hasil = A1 - A2;
		System.out.println("Hasil Pengurangan=" + hasil);

		
		//operasi perkalian A1 dengan A2
		System.out.println("Operator Perkalian");
		hasil = A1 * A2;
		System.out.println("Hasil Perkalian=" + hasil);

		
		//operasi pembagian A1 dan A2
		System.out.println("Operator Pembagian");
		hasil = A1 / A2;
		System.out.println("Hasil Pembagian=" + hasil);

		
		//operasi sisa bagi
		System.out.println("Operator Sisa Bagi");
		hasil = A1%A2;
		System.out.println("Sisa Bagi =" + hasil);
		
	}

}
