package day16_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		//kullanicidan 2 tam sayi alin
		// ilk sayidan 2. sayiya kadar t�m tam sayilari yanyana 
		// aralarinda boslukla yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("iki tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		if (sayi1>sayi2) {
			
			for (int i=sayi1; sayi2<i; i--) {System.out.print(i+" ");}
							
		} else {
			
			for (int i=sayi1; i<=sayi2; i++) {System.out.println(i+" ");}
						
		}
		
		scan.close();
		
	}

}
