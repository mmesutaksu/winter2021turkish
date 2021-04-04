package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullanicidan hangi g�nde oldugumuzu yaziyla isteyin
		// haffta ici veya haftasonu old. yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen hangi g�nde oldugunuzu giriniz");
		String g�n=scan.next().toLowerCase();
		
		
		switch (g�n) {
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("hafta ici");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("hafta sonu");
			break;
		default:
			System.out.println("L�tfen tekrar giriniz");
			break;
		
		}

		scan.close();
		
		
	}

}
