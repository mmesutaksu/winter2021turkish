package day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin
		// bu sayiyi tam bolen sayilari ve toplam kac tane  olduklarini ekranda yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bölenlerini bulmak icin pozitif bir tamsayi giriniz");
		
		int sayi=scan.nextInt();
		int bölen=1;
		int count=0;
		int sira=1;
		
		while (bölen<=sayi) {
			
			if (sayi%bölen==0) {
				count++;
				System.out.println(sira+++"_"+ bölen);
			}
			bölen++;
		}
		System.out.println("");
		System.out.println(sayi+" sayisinin bölenleri: "+count+" adettir.");
		
		
		scan.close();
	}

}
