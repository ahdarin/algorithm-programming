package pekan6;

import java.util.Scanner;
public class Ternary1 {

	/*Ternary hampir sama dengan IF
	 * Namun lebih sederhana
	 * (Kondisi)true:false
	 */
	public static void main(String[] args) {
		double IPK;
		String stat1="Anda Lulus Sangat Memuaskan";
		Scanner input=new Scanner(System.in);
		System.out.print("Input IPK Anda = ");
		IPK=input.nextDouble();
		input.close();
		String hasil = (IPK > 2.75)?stat1:"Anda Lulus Memuaskan";
		System.out.println(hasil);
		
		
	}

}
