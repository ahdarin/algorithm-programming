package pekan4;

public class PerulanganFor3 {
	public static void main(String[] args) {
		int j=0;
		for (int i=10;i>=1;i--) {
			if (i>1) {
				System.out.print(i+" + ");	
			} else {
				System.out.println(i);
			}
			j=j+i;
		}
		System.out.println("jumlah = " + j );
	}	
}
