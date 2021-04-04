package day02_variables;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Adinizi Yaziniz");
		
		String name=scan.nextLine(); // .next() kullanici kac kelime girerse girsin ilk kelimeyi alir
								     // .nextLine() Kullanicinin girdigi tüm kelimeleri alir
		
	System.out.println("Soyadinizi Giriniz");
	String surname=scan.nextLine();
	
	System.out.println(name+" "+surname);
	
		
		scan.close();
		
		
		

	}

}
