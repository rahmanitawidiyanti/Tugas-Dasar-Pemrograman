import java.util.Scanner;

	public class TugasModul7_2
	{

		public static void main(String args[])
		{

			Scanner Masukkan = new Scanner(System.in);
			int a;
			int b;
			System.out.print(" Masukkan Angka Awal  : ");
			a = Masukkan.nextInt();
			System.out.print(" Masukkan Angka Akhir : "); 
			b = Masukkan.nextInt();

			for (a=1;a>10;a+=2)
			System.out.println(a);
	}
}