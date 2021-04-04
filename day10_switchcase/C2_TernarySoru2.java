package day10_switchcase;

import java.util.Scanner;

public class C2_TernarySoru2 {

	public static void main(String[] args) {
		// kullanicidan bir sayi alin. sayi cift ise cifttir, degilse sayinin karesini yazdirin.

				
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		
		System.out.println(sayi%2==0 ? "Sayi cifttir" : sayi*sayi);
		
		
		scan.close();
		
		
		
		
		
	}

}
