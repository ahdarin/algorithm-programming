package pekan7;

public class Mahasiswa {
	private int nim;
	private String nama;
	//membuat mutator (setter)
	public void setNim (int nim) {
		this.nim=nim;
	}
	public void setNama (String nama) {
		this.nama=nama;
	}
	//membuat accessor (getter)
	public int getNim() {
		return nim;
	}
	public String getNama() {
		return nama;
	}
	public void Cetak() {
		System.out.println("Nim  : " +nim);
		System.out.println("Nama : " +nama);
	
	}
}

