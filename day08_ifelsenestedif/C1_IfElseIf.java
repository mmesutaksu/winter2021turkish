package day08_ifelsenestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		//Kullanicidan gun ismini yazmasini isteyin,
		//Girilen isim gecerli bir gun ise gun isminin il 3 harfinin ilki b�y�k digeri k�c�k sekilde yazdirin,
		//gun  ismi  gecerli degilse �Gecerli gun ismi giriniz� yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir g�n ismi yaziniz");
		String g�n=scan.nextLine();
		
		if (g�n.equalsIgnoreCase("pazar") || g�n.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		} else if (g�n.equalsIgnoreCase("persembe")) {
			System.out.println("Per");
		} else if (g�n.equalsIgnoreCase("cuma") || g�n.equalsIgnoreCase("cumartesi")) {
			
		} else if (g�n.equalsIgnoreCase("sali")){
			System.out.println("Sal");
		} else if (g�n.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");			
		} else {
			System.out.println("Gecersiz kelime");
		}
		
		
		
		scan.close();
			
	}

}
