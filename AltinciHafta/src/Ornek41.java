import java.util.Scanner;

public class Ornek41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner veriGiris = new Scanner(System.in);
		System.out.println("1-10 arası sayı giriniz : ");
		int sayi = veriGiris.nextInt();
				
		if(sayi>=1 && sayi<=10){
				if(sayi == 5){
				System.out.println("hoşgeldiniz");	
			}else{
				System.out.println("Güle güle");
			}
		}else {
			System.out.println("YANLIŞ İŞLEM");
		}
		
		
		
		
	}

}
