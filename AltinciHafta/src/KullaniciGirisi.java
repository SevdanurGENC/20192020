import java.util.Scanner;
public class KullaniciGirisi {
	public static void main(String[] args) {
		Scanner sayiAL = new Scanner(System.in);
		System.out.println("Kullan�c� Ad�n� giriniz :");
		String kullaniciAdi = sayiAL.next();
		System.out.println("�ifrenizi giriniz :");
		int sifre = sayiAL.nextInt();

		if(kullaniciAdi.equals("Admin") && sifre==1234){
			System.out.println("Sisteme ho�geldiniz");
		}else{
			if(!kullaniciAdi.equals("Admin") && sifre==1234)
				System.out.println("Kullan�c� Ad� Hatal�");
			else if(!(sifre==1234) && kullaniciAdi.equals("Admin"))
				System.out.println("�ifre Hatal�");
			else
				System.out.println("Girdi�iniz t�m de�erler hatal�");
		} 
	} 
} 