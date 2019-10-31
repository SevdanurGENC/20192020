import java.util.Scanner;
public class KullaniciGirisi {
	public static void main(String[] args) {
		Scanner sayiAL = new Scanner(System.in);
		System.out.println("Kullanýcý Adýný giriniz :");
		String kullaniciAdi = sayiAL.next();
		System.out.println("Þifrenizi giriniz :");
		int sifre = sayiAL.nextInt();

		if(kullaniciAdi.equals("Admin") && sifre==1234){
			System.out.println("Sisteme hoþgeldiniz");
		}else{
			if(!kullaniciAdi.equals("Admin") && sifre==1234)
				System.out.println("Kullanýcý Adý Hatalý");
			else if(!(sifre==1234) && kullaniciAdi.equals("Admin"))
				System.out.println("Þifre Hatalý");
			else
				System.out.println("Girdiðiniz tüm deðerler hatalý");
		} 
	} 
} 