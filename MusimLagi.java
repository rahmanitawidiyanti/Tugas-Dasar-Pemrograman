import java.util.Scanner;

	public class MusimLagi
	{

	 public static void main(String [] args)
{	
	Scanner Ketik = new Scanner(System.in);
	int a;

	System.out.print("Bulan : ");
	a = Ketik.nextInt();

	if(a==1){
	System.out.println("Januari");
	System.out.println("Musim Dingin");}

        else if(a==2){
	System.out.println("Februari");
	System.out.println("Musim Dingin");}

	 else if(a==3){
	System.out.println("Maret");
	System.out.println("Musim Semi");}

	else if(a==4){
	System.out.println("April");
	System.out.println("Musim Semi");}

	 else if(a==5){
	System.out.println("Mei");
	System.out.println("Musim Semi");}

	else if(a==6){
	System.out.println("Juni");
	System.out.println("Musim Panas");}

	else if(a==7){
	System.out.println("Juli");
	System.out.println("Musim Panas");}

	else if(a==8){
	System.out.println("Agustus");
	System.out.println("Musim Panas");}

	else if(a==9){
	System.out.println("September"); 
	System.out.println("Musim Gugur");}

	else if(a==10){
	System.out.println("Oktober");
	System.out.println("Musim Gugur");}

	else if(a==11){
	System.out.println("November");
	System.out.println("Musim Gugur");}

	else if(a==12){
	System.out.println("Desember");
	System.out.println("Musim Dingin");}
	
	else
	System.out.println("tidak ada");
}

}