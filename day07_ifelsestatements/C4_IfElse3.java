package day07_ifelsestatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		//kullanicidan yasini sorun
		//65 veya 65ten b�y�kse emekli olabilirsin
		//k�c�kse emekli olamazsin yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		byte yas=scan.nextByte();
		
		if (yas>=65) {
			System.out.println("Emekli olabilirsin");
		} else {System.out.println("Emekli olamazsin");

		}
				
		
		
		scan.close();
		

	}

}
