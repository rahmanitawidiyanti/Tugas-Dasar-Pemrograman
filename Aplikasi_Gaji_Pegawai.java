import java.util.Scanner;

/**
Nama Kelompok
1. Rifqi Dwi Suprayoga
2. Irma
3. Linda
4. Rahmanita Widiyanti
5. Ahmad Faisal Riski
6. Inocentio Deovra Giby
*/

public class Aplikasi_Gaji_Pegawai
{
	public static void main (String[] args)
	{
		Scanner ketik = new Scanner (System.in);
		String NIP;
		String Nama;
		String Bidang_Kerja;
		String Keputusan;
		int Gaji_Pokok;
		int Uang_Makan;
		int Total_Uang_Makan;
		int Total_Gaji;
		byte Jumlah_Kehadiran;
		byte Jumlah_Absen;

		System.out.print("NIP			:");
		NIP = ketik.nextLine();

		System.out.print("Nama			:");
		Nama = ketik.nextLine();

		System.out.print("Bidang Kerja		:");
		Bidang_Kerja = ketik.nextLine();

		System.out.print("Gaji Pokok		:");
		Gaji_Pokok = ketik.nextInt();

		System.out.print("Uang Makan		:");
		Uang_Makan = ketik.nextInt();

		System.out.print("Jumlah Kehadiran	:");
		Jumlah_Kehadiran = ketik.nextByte();

		System.out.print("Jumlah Absen		:");
		Jumlah_Absen = ketik.nextByte();

		Total_Uang_Makan = Uang_Makan*Jumlah_Kehadiran;
		System.out.println("Total Uang Makan 	= " + Total_Uang_Makan);

		Total_Gaji = Gaji_Pokok+Total_Uang_Makan;
		System.out.println("Total Gaji 		= " + Total_Gaji);

		Keputusan = (Jumlah_Absen > 10) ? "GAJI TIDAK DAPAT DITERIMA":"SILAHKAN AMBIL GAJI ANDA";
		System.out.println(Keputusan);

	}
}