import java.util.*;
/**
 * Aplikasi Pembelian Barang
 * Recoded by H3xagon a.k.a Denny Septian
 */
public class BuyBarang {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String yesh3x = "y";
    String noh3x = "n";
	String tambah_namabarang,nama_konsumen,nama_barang,belilagi, bonus = "";
	double tambah_hargabarang,harga_barang,diskonh3x = 0, diskon = 0, total_harga, total_bayar, totalbelanja, totalh3x;
	int tambah_jumlahbarang,jml_barang;

	System.out.println("============== APLIKASI PEMBELIAN BARANG ==============");
	System.out.print("Nama Konsumen : ");
	nama_konsumen = scan.nextLine();
	System.out.print("Nama Barang : ");
	nama_barang = scan.nextLine();
	System.out.print("Harga Barang : ");
	harga_barang = scan.nextDouble();
	System.out.print("Jumlah Barang : ");
	jml_barang = scan.nextInt();
	System.out.println("============== APLIKASI PEMBELIAN BARANG ==============");

	System.out.print("\nMau Belanja lagi? y/n : ");
	belilagi = scan.next();

	// Jika Yes , Maka akan belanja di ulang
	if (belilagi.equals(yesh3x)) {
		System.out.println("\n\n============== BELI BARANG LAGI ==============");
		System.out.print("Nama Barang : ");
		tambah_namabarang = scan.next();
		System.out.print("Harga Barang : ");
		tambah_hargabarang = scan.nextDouble();
		System.out.print("Jumlah Barang : ");
		tambah_jumlahbarang = scan.nextInt();
		System.out.println("============== BELI BARANG LAGI ==============");
		totalh3x = harga_barang * jml_barang + tambah_hargabarang * tambah_jumlahbarang;
		System.out.println("\n\n============== KERANJANG BELANJA ANDA ==============");
		System.out.println("| Konsumen : " + nama_konsumen);
		System.out.println("| Nama Barang : " + nama_barang);
		System.out.println("| Harga Barang : " + harga_barang);
		System.out.println("| Jumlah Barang : " + jml_barang);
		System.out.println("|");
		System.out.println("| Nama Barang : " + tambah_namabarang);
		System.out.println("| Harga Barang : " + tambah_hargabarang);
		System.out.println("| Jumlah Barang : " + tambah_jumlahbarang);
		System.out.println("|");
		if (totalh3x >= 1000000) {
			diskonh3x = totalh3x * 10 / 100;
			totalh3x = totalh3x - diskonh3x; 
			System.out.println("| Diskon = 10%");
		} else if (totalh3x >= 500000) {
			diskonh3x = totalh3x * 5 / 100;
			totalh3x = totalh3x - diskonh3x;
			System.out.println("| Diskon = 5%");
		}
		System.out.println("============== KERANJANG BELANJA ANDA ==============");
		totalbelanja = harga_barang * jml_barang + tambah_hargabarang * tambah_jumlahbarang;
		System.out.println("\n\n============== TOTAL BELANJA ==============");
		System.out.println("Total Belanja : " + totalbelanja);
		System.out.println("Diskon (Rp) : " + diskonh3x);
		System.out.println("Total Bayar : " + totalh3x);
		System.out.println("===========================================");
	} else if (belilagi.equals(noh3x)) {
		// Jika No , Maka akan belanja tidak di ulang
		total_harga = harga_barang * jml_barang;
		System.out.println("\n\n============== KERANJANG BELANJA ANDA ==============");
		System.out.println("| Konsumen : " + nama_konsumen);
		System.out.println("| Nama Barang : " + nama_barang);
		System.out.println("| Harga Barang : " + harga_barang);
		System.out.println("| Jumlah Barang : " + jml_barang);
		if (total_harga >= 500000) {
			diskon = total_harga * 10 / 100;
			total_harga = total_harga - diskon; 
			System.out.println("| Diskon = 10%");
		} else if (total_harga >= 250000) {
			diskon = total_harga * 5 / 100;
			total_harga = total_harga - diskon;
			System.out.println("| Diskon = 5%");
		}
		System.out.println("============== KERANJANG BELANJA ANDA ==============");
		total_bayar = harga_barang * jml_barang;
		System.out.println("\n\n============== TOTAL BELANJA ==============");
		System.out.println("Total Belanja : " + total_bayar);
		System.out.println("Diskon (Rp) : " + diskon);
		System.out.println("Total Bayar : " + total_harga);
		System.out.println("===========================================");
	}
  }
}