package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		//kullanicidan g�n isminin ilk harfini isteyin ve 
		//harfe uygun olan g�n isimlerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("G�n isimlerinden birinin bas harfini veriniz");
		
		char harf=scan.next().charAt(0);
		
		if (harf=='c' || harf=='C') {
			System.out.println("Cumartesi,Cuma,Carsamba");
		}
		
		if (harf=='p' || harf=='P') {
			System.out.println("Pazartesi,Pazar,Persembe");
		}
		
		
		if (harf=='s' || harf=='S') {
			System.out.println("Sali");
		}
		
		if (harf!='p' && harf!='P' && harf!='s' && harf!='S' && harf!='C' && harf!='c') {
			System.out.println("L�tfen gecerli bir harf giriniz");
		}
		
		
		scan.close();
		
	}

}
