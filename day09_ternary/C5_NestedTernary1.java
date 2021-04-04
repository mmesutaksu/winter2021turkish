package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		// genislik uzunluk al, kare yada degil yazdir
		Scanner scan=new Scanner(System.in);
		System.out.println("dörtgenin 2 kenarini yaziniz");
		
		double ken1=scan.nextDouble();
		double ken2=scan.nextDouble();
		
		System.out.println(ken1>0 && ken2>0 ? (ken1==ken2 ? "Karedir" : "Kare degil"):("Lütfen gecerli bir sayi giriniz"));
		
		//veya
		String sonuc=ken1>0 && ken2>0 ? ken1==ken2 ? "Karedir" : "Kare degil":"Lütfen gecerli bir sayi giriniz";
		System.out.println(sonuc);
		
		
		
		scan.close();
		
		
		
		
		
		
	}

}
