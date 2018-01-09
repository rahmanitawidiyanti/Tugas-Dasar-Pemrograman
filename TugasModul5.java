import java.util.Scanner;

	public class TugasModul5
	{

		public static void main(String args[])
		{

			Scanner Ketik = new Scanner(System.in);

			System.out.print(" Banyaknya data : ");
			int data = Ketik.nextInt();

			float jumlah = 0;
			float data_ke = 0;
			int a = 1;
			int ke = 0;
			while (a<=data) {
				a++; 
				ke++;

				System.out.print(" Data ke- "+ke+" : ");
				data_ke = Ketik.nextFloat();
				jumlah+= data_ke;
				}

					float ratarata = jumlah/data;
					System.out.println(" Rata-rata : " + ratarata);
					System.out.println(" Jumlah : " + jumlah);
	}
}