import java.util.Scanner;

	public class TugasModul6
	{

		public static void main(String args[])
   		{

			Scanner masuk=new Scanner(System.in);
			float b, ratarata, jumlah;
			int data=0;
			int a = 1;
			System.out.print("Banyaknya data : ");
			data=masuk.nextInt();
			b=0;
			jumlah=0;
	do
	{
	System.out.print("Masukkan bilangan ke-"+a+" : ");
	b=masuk.nextFloat();
	jumlah+=b;
	a++;
		}while (a<=data) ;
		ratarata=jumlah/data;
		System.out.println("Rata-rata bilangan : " + ratarata);

	}
}
