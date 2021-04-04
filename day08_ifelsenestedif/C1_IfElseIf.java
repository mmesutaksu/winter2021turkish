package day08_ifelsenestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		//Kullanicidan gun ismini yazmasini isteyin,
		//Girilen isim gecerli bir gun ise gun isminin il 3 harfinin ilki büyük digeri kücük sekilde yazdirin,
		//gun  ismi  gecerli degilse “Gecerli gun ismi giriniz” yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir gün ismi yaziniz");
		String gün=scan.nextLine();
		
		if (gün.equalsIgnoreCase("pazar") || gün.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		} else if (gün.equalsIgnoreCase("persembe")) {
			System.out.println("Per");
		} else if (gün.equalsIgnoreCase("cuma") || gün.equalsIgnoreCase("cumartesi")) {
			
		} else if (gün.equalsIgnoreCase("sali")){
			System.out.println("Sal");
		} else if (gün.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");			
		} else {
			System.out.println("Gecersiz kelime");
		}
		
		
		
		scan.close();
			
	}

}
