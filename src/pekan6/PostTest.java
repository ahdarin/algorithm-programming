package pekan6;

import java.util.Scanner;

public class PostTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input : ");
		int a=0;
		int baris=input.nextInt();
		input.close();
		
		System.out.println("Output : ");
		for (int i=1; i<=baris; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(a);
				a++;
				if (a==10) {
					a=0;
				}
				}
			System.out.println();
			}
		}
	}

