package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir dörtgene ait iki kenar uzunlugunu yaziniz");
		
		System.out.print("1.Kenar = ");
		double kenar1=scan.nextDouble();
		
		System.out.print("2.Kenar = ");
		double kenar2=scan.nextDouble();
		
			
		if (kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("Bu bir Karedir");
		}
		
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("Bu bir dikdörtgendir");
		}
		
		if (kenar1<=0 || kenar2<=0 ) {
			System.out.println("Lütfen gecerli uzunluk giriniz.");
		}
		
		
		
		
		
		
		scan.close();
	}

}
