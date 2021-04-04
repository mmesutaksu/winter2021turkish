package day08_ifelsenestedif;

import java.util.Scanner;

public class C5_NestedIf {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen sifrenizi giriniz : ");
		char ilkHarf=scan.next().charAt(0);
		
				
		if (ilkHarf>='A' && ilkHarf<='Z') {
			if (ilkHarf=='A') {
				System.out.println("Sifre gecerli");
			} else {
				System.out.println("Sifre gecersiz");
			}
						
			
		} else if(ilkHarf>='a' && ilkHarf<='z') {
			if (ilkHarf=='z') {
				System.out.println("Sifre gecerli");
			} else {
				System.out.println("Sifre gecersiz");
			}
		
		
		
		} else {
			System.out.println("Sifre gecersiz");
		}
		
		
		
		
		scan.close();
		
	}

}
