import java.util.Scanner;

	public class IfSatuPilihan
	{

		public static void main(String args[])
		{

			Scanner masuk = new Scanner(System.in);
			int bil;

			System.out.print("Masukkan Bilangan : ");
			bil = masuk.nextInt();
			
			if (bil==0)
			System.out.println("Bilangan Nol");
	}
}