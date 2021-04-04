package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		//kullanicidan bir sayi isteyin ve sayinin 
		//tek veya cift sayi oldugunu yazdirin
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("Bir tam sayi giriniz : ");
		
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("Girdiginiz sayi cifttir");
		}
		
		if (sayi%2==1 || sayi%2==-1) {
			System.out.println("Girdiginiz sayi tektir");
		}
		
		System.out.println(" ");
		
		System.out.println("Katildiginiz icin tesekkür ederiz");
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
	}

}
