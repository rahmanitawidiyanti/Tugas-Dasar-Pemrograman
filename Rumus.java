import java.util.Scanner;

	public class Rumus
	{

	public static void main(String[] args)
	{

	Scanner Ketik = new Scanner(System.in);
	byte hitung;

	System.out.println("<<<<<<<<<< RUMUS ENERGI POTENSIAL DAN RUMUS GAYA >>>>>>>>>>\n");

	System.out.println("Silahkan pilih Rumus : ");
	System.out.println("1. Rumus Energi Potensial ");
	System.out.println("2. Rumus Gaya ");
	System.out.println("99. Keluarc");

	System.out.print("Rumus : ");
	hitung = Ketik.nextByte();
	switch (hitung){

	case 1 :
	Double Epotensial;
	Double massa;
	Double gravitasi=9.8;
	Double ketinggian;

	System.out.println("\n");
	System.out.println("                   =====MENGHITUNG RUMUSENERGI POTENSIAL=====");
	System.out.println(" Rumus Energi potensial = massa.gravitasi.ketinggian ");

	System.out.println(" Masukkan Gravitasi     = 9.8 ");

	System.out.print(" Masukkan massa         = " );
        massa = Ketik.nextDouble();
	
        System.out.print(" Masukkan ketinggian    = " );
        ketinggian = Ketik.nextDouble();
       
	Epotensial = massa*gravitasi*ketinggian;

	System.out.print(" Epotensial             = " + Epotensial + " Joule");
	break;

	case 2 :
	Double Gaya;
	Double Massa;
	Double Percepatan;

	System.out.println("                  =====MENGHITUNG RUMUS GAYA=====");
	System.out.println(" Rumus Gaya = Massa.Percepatan ");

	System.out.print(" Masukkan Massa         = " );
        Massa = Ketik.nextDouble();
	
        System.out.print(" Masukkan Percepatan    = " );
        Percepatan = Ketik.nextDouble();
       
	Gaya = Massa*Percepatan;

	System.out.print(" Gaya             = " + Gaya + " N ");

	break;
	} 
    }
}

	
	