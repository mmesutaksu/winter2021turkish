package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1 tam sayi giriniz");
		int sayi1=scan.nextInt();
		
		System.out.println(sayi1%2==0 ? "cifttir" : "tektir");
		
		//sayinin mutlak degerini yazdirin
		System.out.println(sayi1<0 ? sayi1*-1 : sayi1);
		
		scan.close();
		
		
		
	}

}
