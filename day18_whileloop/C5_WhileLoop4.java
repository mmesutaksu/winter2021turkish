package day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin
		// bu sayiyi tam bolen sayilari ve toplam kac tane  olduklarini ekranda yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("B�lenlerini bulmak icin pozitif bir tamsayi giriniz");
		
		int sayi=scan.nextInt();
		int b�len=1;
		int count=0;
		int sira=1;
		
		while (b�len<=sayi) {
			
			if (sayi%b�len==0) {
				count++;
				System.out.println(sira+++"_"+ b�len);
			}
			b�len++;
		}
		System.out.println("");
		System.out.println(sayi+" sayisinin b�lenleri: "+count+" adettir.");
		
		
		scan.close();
	}

}
