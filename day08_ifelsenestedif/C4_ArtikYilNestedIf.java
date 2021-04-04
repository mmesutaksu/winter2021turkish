package day08_ifelsenestedif;

import java.util.Scanner;

public class C4_ArtikYilNestedIf {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		int yil=scan.nextInt();
		
		if (yil%100==0) {
			if (yil%400==0) {
				System.out.println("Artik yil");
			} else {
				System.out.println("Artik yil degil");
			}
						
		} else {
			if (yil%4==0) {
				System.out.println("Artik yil");
			} else {
				System.out.println("Artik yil degil");
			}
			
			scan.close();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
