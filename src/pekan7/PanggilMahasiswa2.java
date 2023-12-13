package pekan7;
import java.util.Scanner;
public class PanggilMahasiswa2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("NIM?");
		int nimsaya=input.nextInt();
		
		System.out.println("Nama?");
		Scanner input2 = new Scanner (System.in);
		String namasaya=input2.nextLine();
		
		Mahasiswa ahda = new Mahasiswa();
		ahda.setNim(nimsaya);
		ahda.setNama(namasaya);
		
		System.out.println(ahda.getNama());
		System.out.println(ahda.getNim());
		ahda.Cetak();
		
		input.close();
		input2.close();

	}

}
