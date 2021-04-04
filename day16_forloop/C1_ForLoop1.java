package day16_forloop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		// kullanicidan pozitif iki tam sayi alin
		// aldiginiz degerlerden kücük olandan baslayip büyük olana kadar
		//tüm sayilari yan yana (virgülle ayirarak) yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("iki tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int kücük=0;
		int büyük=0;
		
		if (sayi1<0 || sayi2<0) {System.out.println("Lütfen pozitif tam sayi giriniz");
		
		} else if (sayi1>sayi2) {
			
			büyük=sayi1;
			kücük=sayi2;
	
		} else {
			
			büyük=sayi2;
			kücük=sayi1;
		}
		
		
		for (int i=kücük+1; i<=büyük; i++) {
			System.out.print(i+",");
		}
		
		scan.close();
		
		}
		
	}
