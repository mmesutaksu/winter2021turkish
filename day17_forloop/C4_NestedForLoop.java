package day17_forloop;

import java.util.Scanner;

public class C4_NestedForLoop {

	public static void main(String[] args) {
		// kullanicidan 10dan k�c�k bir rakam girmesini isteyin ve 
		// girilen rakama g�re asagidaki gibi cizdirin
		/*
		 
		 * 
		
		 * *
		 
		 * * *
		 
		 * * * *
		 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("10 dan k�c�k pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt();
	
		
		for (int i = 0; i <= sayi; i++) {
			System.out.println("");
			for (int j=0; j<i; j++) {
				System.out.print("* ");
			}
		
		}
		
		scan.close();
		
		
	}

}
