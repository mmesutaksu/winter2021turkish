package day03_scanner;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
				
		System.out.print("Lütfen Adinizi Yaziniz: ");
		
		String name=scan.nextLine();
		
		System.out.print("Lütfen Soyadinizi Yaziniz: ");
		
		String surname=scan.nextLine();
		
		System.out.println("Adiniz: "+name);
		System.out.println("Soyadiniz: "+surname);
		System.out.println("Kursumuza Kaydiniz Basariyla Gerceklesmistir, Tesekkür Ederiz.");
		
		scan.close();
		
		
		
		
	}

}
