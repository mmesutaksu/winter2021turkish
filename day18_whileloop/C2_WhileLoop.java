package day18_whileloop;

public class C2_WhileLoop {

	public static void main(String[] args) {
		// 10 dan 30 dahil 30 a kadar olan sayilardan 4 ile bölünebilenleri
		//aralarinda bir boslik olacak sekilde yanyana yazdirin
		
		System.out.print(" ");
		for (int i=10; i<=30; i++) {
			
			if (i%4==0) {
				System.out.print(i+" ");
		}
	}
		
		System.out.println(" ");
		
		int sayi=12;
				
		while (sayi<=30) {
			if (sayi%4==0) {
				System.out.println(sayi+" ");
			}
			sayi++;
		}
		
				
	}
}
