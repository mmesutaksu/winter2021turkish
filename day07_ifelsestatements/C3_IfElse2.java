package day07_ifelsestatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		//Kullanicidan bir karakter girmesini isteyin
		//Harf olup olmadigini yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.print("Lütfen bir karakter giriniz : ");	
		char karakter=scan.next().toLowerCase().charAt(0);
		
		if (karakter>='a' && karakter<='z') {
			System.out.println("Girdiginiz karakter harftir");
		} else {System.out.println("Girdiginiz karakter harf degildir");

		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
