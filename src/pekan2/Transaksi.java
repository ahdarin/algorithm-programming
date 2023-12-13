/*
untuk penugasan pekan 2
dengan output total bayar setelah di diskon
untuk data nya

harga barang = 337000
jumlah barang = 5
diskon = 25%

dengan output untuk tiap sesi

contoh :
total harga bayar = 1500000
"Total harga yang di bayarkan = Rp. 1500000"
 */
package pekan2;

public class Transaksi {

	public static void main(String[] args) {
		int harga=337000; //harga barang
		int jml=5; //jumlah barang
		double diskon=0.25; //diskon
		double harga_aseli = harga*jml;
		double harga_diskon = harga*jml*diskon;
		double total = harga_aseli - harga_diskon;

		System.out.println("Total harga yang dibayarkan = Rp. " + total);
	}
}