package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement {
	public static void main(String[] args) {
		//kullanicidan g�n ismini isteyin
		//girilen g�n hafta ici veya hafta sonu oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir g�n ismi giriniz");
		
		String g�n= scan.next().toLowerCase();
		
		//eger stringlerde esitlik sorguluyorsak == kullanmaamliyiz
		//Stringlerde esit olma durumunu sorgulamak icin .equals() kullanilir
		
		if (g�n.equals("montag") || g�n.equals("dienstag") || g�n.equals("mittwoch") || g�n.equals("donnerstag") || g�n.equals("freitag")) {
			System.out.println("Yazdiginiz g�n Haftaici'dir");
		}
		
		if (g�n.equals("samstag") || g�n.equals("sonntag")) {
			System.out.println("Yazdiginiz g�n Haftasonu'dur.");
		}
			
			
			
			scan.close();
		}
	}

