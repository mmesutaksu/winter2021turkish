package day16_forloop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		// kullanicidan pozitif iki tam sayi alin
		// aldiginiz degerlerden k�c�k olandan baslayip b�y�k olana kadar
		//t�m sayilari yan yana (virg�lle ayirarak) yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("iki tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int k�c�k=0;
		int b�y�k=0;
		
		if (sayi1<0 || sayi2<0) {System.out.println("L�tfen pozitif tam sayi giriniz");
		
		} else if (sayi1>sayi2) {
			
			b�y�k=sayi1;
			k�c�k=sayi2;
	
		} else {
			
			b�y�k=sayi2;
			k�c�k=sayi1;
		}
		
		
		for (int i=k�c�k+1; i<=b�y�k; i++) {
			System.out.print(i+",");
		}
		
		scan.close();
		
		}
		
	}
