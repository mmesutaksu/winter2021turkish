package day07_ifelsestatements;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		
		//kullanicidan dortgenin kenar uzunluklarini alin
		//uzunluklar esit ise kare degilse kare degil yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Dörgenin iki kenar uzunlugunu giriniz");
		
		System.out.print("1.Kenar : ");
		double kenar1=scan.nextDouble();
		
		System.out.print("2.Kenar : ");
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Bu bir Karedir");
		}	else {
			System.out.println("Kare degildir");
		}
		
		
		
		
		
		scan.close();
		
	}

}
