import java.util.Scanner;

public class Ornek41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner veriGiris = new Scanner(System.in);
		System.out.println("1-10 aras� say� giriniz : ");
		int sayi = veriGiris.nextInt();
				
		if(sayi>=1 && sayi<=10){
				if(sayi == 5){
				System.out.println("ho�geldiniz");	
			}else{
				System.out.println("G�le g�le");
			}
		}else {
			System.out.println("YANLI� ��LEM");
		}
		
		
		
		
	}

}
