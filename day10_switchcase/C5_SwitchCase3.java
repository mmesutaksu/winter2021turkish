package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullanicidan hangi günde oldugumuzu yaziyla isteyin
		// haffta ici veya haftasonu old. yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen hangi günde oldugunuzu giriniz");
		String gün=scan.next().toLowerCase();
		
		
		switch (gün) {
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
			System.out.println("Lütfen tekrar giriniz");
			break;
		
		}

		scan.close();
		
		
	}

}
