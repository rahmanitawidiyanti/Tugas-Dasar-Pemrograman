import java.util.Scanner;

	public class Tugas3If
	{

		public static void main (String[] args)
		{

			Scanner Ketik = new Scanner(System.in);
			Double Determinan;
			Double a;
			Double b;
			Double c;

			System.out.print(" Masukkan Nilai a = ");
			a = Ketik.nextDouble();

			System.out.print(" Masukkan Nilai b = ");
			b = Ketik.nextDouble();

			System.out.print(" Masukkan Nilai c = ");
			c = Ketik.nextDouble();	

			Determinan = b*b-(4*a*c);
	
			if (Determinan==0)
			System.out.println(" Akar Kembar ");

			else if (Determinan>0)
			System.out.println(" Akar Beda ");

			else if (Determinan<0)
			System.out.println(" Akar Imajiner ");
	}
}