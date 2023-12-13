package pekan6;
import java.util.Scanner;
public class tugas6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input:");
		int angka=input.nextInt();
		input.close();
		System.out.println("Output:");
		for (int i=1;i<=angka;i++) {
			if (i%2!=0) {
				for (int j=1;j<=(angka-angka/2);j++) {
					System.out.print("_ ");
				}
			}  else {
				for (int k=1; k<=(angka/2);k++) {
					System.out.print(" _");	
				}
			}
			System.out.println();
		}
		
	}
}

