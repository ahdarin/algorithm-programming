package pekan5;

import java.util.Scanner;

public class tugaspekan5 {

	public static void main(String[] args) {
		int nilai=0;
		int sum=0;
		Scanner input=new Scanner(System.in);
		
		while (nilai>=0){
			System.out.println("Enter a number");
			nilai = input.nextInt();
			sum = sum+nilai;
			if  (nilai<0) {
				sum=sum-nilai;
			}
		}
		
		System.out.println("sum = " + sum);
		input.close();
	}

}
