package pekan4;

public class TugasPekan4 {
	
	public static void pagar() {
		System.out.print("#");
		for (int a=1; a<=16; a++) {
			System.out.print("=");
		}
		System.out.print("#");
		System.out.println();
	}
	
	public static void atas_bilek() {
		for (int i=1;i<=4;i++) {
			System.out.print("|");
			for (int spasi=1; spasi<=(-2*i+8);spasi++) {
				System.out.print(" ");
			}
			System.out.print("<>");
			
			for (int titik=1;titik<= (4*i-4); titik++) {
				System.out.print(".");
			}
			System.out.print("<>");
			
			for (int spasi=1; spasi<=(-2*i+8);spasi++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();	
		}
	}
	
	public static void bawah_jugabilek() {
		for (int i=1;i<=4;i++) {
			System.out.print("|");
			
			for (int spasi=1; spasi<=(2*i-2); spasi++) {
				System.out.print(" ");
			}
			System.out.print("<>");
			
			for (int titik=1; titik<=(-4*i+16); titik++) {
				System.out.print(".");
			}
			System.out.print("<>");
			
			for (int spasi=1;spasi<=(2*i-2);spasi++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pagar();
		atas_bilek();
		bawah_jugabilek();
		pagar();
	}


}
