import java.util.Scanner;

	public class RumusEnergiPotensial
	{		
  
	public static void main (String[] args)
	{	

	Scanner Ketik = new Scanner (System.in);
	
	Double Epotensial;
	Double massa;
	Double gravitasi=9.8;
	Double ketinggian;

	System.out.println("                        =====MENGHITUNG ENERGI POTENSIAL=====");
	System.out.println(" Rumus Energi potensial = massa.gravitasi.ketinggian ");

        System.out.println(" Masukkan Gravitasi     = 9.8 ");

	System.out.print(" Masukkan massa         = " );
        massa = Ketik.nextDouble();
	
        System.out.print(" Masukkan ketinggian    = " );
        ketinggian = Ketik.nextDouble();
       
	Epotensial = massa*gravitasi*ketinggian;

	System.out.print(" Epotensial             = " + Epotensial + " Joule");
		
	}
}