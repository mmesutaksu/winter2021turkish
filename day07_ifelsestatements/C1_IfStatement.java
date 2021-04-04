package day07_ifelsestatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		if (sayi>0) {
			System.out.println("Sayi Pozitiftir");
		}
		
		if (sayi<100) {
			System.out.println("100'den kücüktür");
		}
		
		if (sayi>1000) {
			System.out.println("1000'den büyüktür");
		}
		
		
		
		
		
		
		
		scan.close();
		
	}

}
