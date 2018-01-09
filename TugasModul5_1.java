import java.util.Scanner;

	public class TugasModul5_1
	{

		public static void main(String args[])
		{

			Scanner Ketik = new Scanner (System.in);

			System.out.print(" Banyaknya Data : ");
			int data = Ketik.nextInt();

			int Kecil;
			int Besar;
			int data_ke = 0;
			int a = 1;
			int ke = 0;
			Kecil = 0;
			Besar = 0;
			
				while (a<=data){
				ke++;

				System.out.print(" Data ke- "+ke+" : ");
				data_ke = Ketik.nextInt();
					
					if(a==1){
					Kecil = data_ke;
					Besar = data_ke;
					}
					else if (data_ke<Kecil){
					Kecil = data_ke;
					}
					else if (data_ke>Besar){
					Besar = data_ke;
					}
					a++;	
						}
					System.out.println(" Bilangan TerKecil : " +Kecil);
					System.out.println(" Bilangan Terbesar : " +Besar);
					
	}

}
				
				
