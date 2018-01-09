import java.util.Scanner;

	public class TugasModul3Case
	{

		public static void main(String []args)
		{

			Scanner Masukkan = new Scanner(System.in);
			int Pilihan;
			System.out.print(" Masukkan Pilihan Anda : ");
			Pilihan = Masukkan.nextInt();

			switch (Pilihan) {
			
			case 1 :
			System.out.print(" Pilihan Anda : ");
			System.out.println(" Naik Pesawat Terbang ");
			break;

			case 2 :
			System.out.print(" Pilihan Anda : ");
			System.out.println(" Naik Kereta Api ");
			break;

			case 3 :
			System.out.print(" Pilihan Anda : ");
			System.out.println(" Naik Bus ");
			break;

			case 4 :
			System.out.print(" Pilihan Anda : ");
			System.out.println(" Naik Taksi ");
			break;

			case 5 :
			System.out.print(" Pilihan Anda : ");
			System.out.println(" Naik Mobil Pribadi ");
			break;

			case 6 :
			System.out.print(" Pilihan Anda : ");
			System.out.println(" Naik Motor ");
			break;

			default :
			System.out.print(" Pilihan Anda : ");
			System.out.println(" Anda Salah Memilih!!!! ");
			break;
		}
	}
}