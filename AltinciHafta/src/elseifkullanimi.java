import java.util.Scanner; 
public class elseifkullanimi { 
	public static void main(String[] args) { 
	Scanner sayiAL = new Scanner(System.in);
	System.out.println("Birinci sayýyý giriniz :");
	int sayi1 = sayiAL.nextInt();
	System.out.println("Ýkinci sayýyý giriniz :");
	int sayi2 = sayiAL.nextInt();
	
	 
	
	
	if(sayi1>sayi2){
		System.out.println( sayi1 + "büyük");
	}else if(sayi1<sayi2){
		System.out.println(sayi1 + "küçük");
	}else{
		System.out.println("sayýlar eþittir");
	}
	
	
	}

}
