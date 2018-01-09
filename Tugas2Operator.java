public class Tugas2Operator
{

	public static void main(String args[])
	{

		int A = 7;
		int B = 2;
		int Jumlah;
		int Kurang;
		int Kali;
		int Bagi;
		int Sisa;
		
		System.out.println("Bilangan 1 : 7");
		System.out.println("Bilangan 2 : 2");

		System.out.println("Hasil Operator Aritmatika");
		System.out.println("=========================");
		System.out.println("");

			Jumlah = A + B;
			System.out.println("Jumlah = " + Jumlah);
			Kurang = A - B;
			System.out.println("Kurang = " + Kurang);
			Kali = A * B;
			System.out.println("Kali   = " + Kali);
			Bagi = A / B;
			System.out.println("Bagi   = " + Bagi);
			Sisa = A % B;
			System.out.println("Sisa   = " + Sisa);
	}
}