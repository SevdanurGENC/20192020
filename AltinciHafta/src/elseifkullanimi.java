import java.util.Scanner; 
public class elseifkullanimi { 
	public static void main(String[] args) { 
	Scanner sayiAL = new Scanner(System.in);
	System.out.println("Birinci say�y� giriniz :");
	int sayi1 = sayiAL.nextInt();
	System.out.println("�kinci say�y� giriniz :");
	int sayi2 = sayiAL.nextInt();
	
	 
	
	
	if(sayi1>sayi2){
		System.out.println( sayi1 + "b�y�k");
	}else if(sayi1<sayi2){
		System.out.println(sayi1 + "k���k");
	}else{
		System.out.println("say�lar e�ittir");
	}
	
	
	}

}
