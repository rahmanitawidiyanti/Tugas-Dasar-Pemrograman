import java.util.Scanner;

	public class IfJurusan
	{
	
		public static void main(String []args)
		{

			Scanner masuk = new Scanner(System.in);
			int pil;

			System.out.print("Masukkan PIlihan : ");
			pil = masuk.nextInt();

			if (pil==1)
				System.out.println("Jurusan Sistem Komputer");

			else if (pil==2)
				System.out.println("Jurusan Sistem Informasi");
			
			else if (pil==3)
				System.out.println("Jurusan Kimia");

			else if (pil==4)
				System.out.println("Jurusan Fisika");

			else if (pil==5)
				System.out.println("Jurusan Biologi");

			else 
				System.out.println("Pilihan Salah!!!!");
	}
}