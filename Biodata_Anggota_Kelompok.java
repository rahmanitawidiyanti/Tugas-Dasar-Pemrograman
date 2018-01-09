import java.util.Scanner;

public class Biodata_Anggota_Kelompok

	{
	public static void main (String[] args)
		{
		Scanner papanketik = new Scanner (System.in);
		byte pilihan;

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\BIODATA ANGGOTA KELOMPOK 3////////////////////////////\n");
		do {
		System.out.println("Silahkan pilih biodata anggota kelompok yang akan dilihat:");
		System.out.println("1. AHMAD FAISAL RISKI");
		System.out.println("2. INOCENTIO DEOVRA GIBY");
		System.out.println("3. IRMA");
		System.out.println("4. LINDA");
		System.out.println("5. RAHMANITA WIDIYANTI");
		System.out.println("6. RIFQI DWI SUPRAYOGA");
		System.out.println("99. Keluar\n");
		System.out.print("Pilihan Anda: ");
		pilihan = papanketik.nextByte();

		if(pilihan == 1)
			{System.out.println("\n");
			System.out.println("Nama Lengkap	: AHMAD FAISAL RISKI");
			System.out.println("NIM		: H1051171031");
			System.out.println("Jenis Kelamin	: LAKI-LAKI");
			System.out.println("TTL		: TABAU, 26 DESEMBER 1998");
			System.out.println("No. HP		: +62-8225-0474-436");
			System.out.println("E-mail		: ernestoutright@gmail.com");
			System.out.println("Alamat		: JL. U.D.K.P. DUSUN BONTI");
			System.out.println("Hobi            : Futsal\n");}

		else if(pilihan == 2)
			{System.out.println("\n");
			System.out.println("Nama Lengkap	: INOCENTIO DEOVRA GIBY");
			System.out.println("NIM		: H1051171043");
			System.out.println("Jenis Kelamin	: LAKI-LAKI");
			System.out.println("TTL		: SUNGAI TONTANG, 17 MEI 2000");
			System.out.println("No. HP		: +62-8215-3087-227");
			System.out.println("E-mail		: trisnameliyanti@yahoo.com");
			System.out.println("Alamat		: SEI TONTANG KEC.SIMPANG DUA");
			System.out.println("Hobi            : Futsal\n");}

		else if(pilihan == 3)
			{System.out.println("\n");
			System.out.println("Nama Lengkap	: IRMA");
			System.out.println("NIM		: H1051171069");
			System.out.println("Jenis Kelamin	: PEREMPUAN");
			System.out.println("TTL		: BAKARU, 1 MARET 1999");
			System.out.println("No. HP		: +62-8223-8822-628");
			System.out.println("E-mail		: irmausman12@gmail.com");
			System.out.println("Alamat		: JL.PROF M YAMIN GG. SELAMAT NO. 18 B");
			System.out.println("Hobi            : Nonton Drama Korea\n");}

		else if(pilihan == 4)
			{System.out.println("\n");
			System.out.println("Nama Lengkap	: LINDA");
			System.out.println("NIM		: H1051171055");
			System.out.println("Jenis Kelamin	: PEREMPUAN");
			System.out.println("TTL		: NIMPA, 26 JULI 1997");
			System.out.println("No. HP		: +62-8965-1052-8");
			System.out.println("E-mail		: okta9700@gmail.com");
			System.out.println("Alamat		: JL. YAM SABRAN");
			System.out.println("Hobi            : Nonton Drama KOrea\n");}

		else if(pilihan == 5)
			{System.out.println("\n");
			System.out.println("Nama Lengkap	: RAHMANITA WIDIYANTI");
			System.out.println("NIM		: H1051171007");
			System.out.println("Jenis Kelamin	: PEREMPUAN");
			System.out.println("TTL		:  PONTIANAK, 6 OKTOBER 1999");
			System.out.println("No. HP		: +62-8135-2116-086");
			System.out.println("E-mail		: rahmanita.widiyanti06@gmail.com");
			System.out.println("Alamat		: JALAN PANGERAN NATAKUSUMA GANG MELATI NOMOR 25");
			System.out.println("Hobi            : Membaca\n");}

		else if(pilihan == 6)
			{System.out.println("\n");
			System.out.println("Nama Lengkap	: RIFQI DWI SUPRAYOGA");
			System.out.println("NIM		: H1051171051");
			System.out.println("Jenis Kelamin	: LAKI-LAKI");
			System.out.println("TTL		: LEDO, 17 JULI 1999");
			System.out.println("No. HP		: +62-8164-9176-103");
			System.out.println("E-mail		: rifqimoderndeathcore@gmail.com");
			System.out.println("Alamat		: JLN. PARIT H. HUSIN II, GG. ASOKA, NO. 11A");
			System.out.println("Hobi            : Makan\n");}

		else if(pilihan == 99)
			{System.out.println("\n");
			System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-TERIMA KASIH & SAMPAI JUMPA-_-_-_-_-_-_-_-_-_-_-_-_-_-");}
		else
				{System.out.println("\n");
			System.out.println("Tidak cocok\n");}
		} while (pilihan != 99);
	}
}