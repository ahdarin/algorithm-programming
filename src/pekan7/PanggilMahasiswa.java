package pekan7;

public class PanggilMahasiswa {

	public static void main(String[] args) {
		Mahasiswa ahda = new Mahasiswa();
		ahda.setNim(231153100);
		ahda.setNama("Ahda Rindang Al-Amin");
		System.out.println(ahda.getNama());
		System.out.println(ahda.getNim());
		ahda.Cetak();

	}

}
