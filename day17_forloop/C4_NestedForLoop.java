package day17_forloop;

import java.util.Scanner;

public class C4_NestedForLoop {

	public static void main(String[] args) {
		// kullanicidan 10dan kücük bir rakam girmesini isteyin ve 
		// girilen rakama göre asagidaki gibi cizdirin
		/*
		 
		 * 
		
		 * *
		 
		 * * *
		 
		 * * * *
		 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("10 dan kücük pozitif bir tam sayi giriniz");
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
