package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
	
		//kullanicidan 2 sayi isteyin ve büyük olani yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("2 sayi giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println(sayi1>sayi2 ? sayi1 : sayi2);
		
		
		scan.close();
		
}
}
