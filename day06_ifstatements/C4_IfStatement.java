package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement {
	public static void main(String[] args) {
		//kullanicidan gün ismini isteyin
		//girilen gün hafta ici veya hafta sonu oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir gün ismi giriniz");
		
		String gün= scan.next().toLowerCase();
		
		//eger stringlerde esitlik sorguluyorsak == kullanmaamliyiz
		//Stringlerde esit olma durumunu sorgulamak icin .equals() kullanilir
		
		if (gün.equals("montag") || gün.equals("dienstag") || gün.equals("mittwoch") || gün.equals("donnerstag") || gün.equals("freitag")) {
			System.out.println("Yazdiginiz gün Haftaici'dir");
		}
		
		if (gün.equals("samstag") || gün.equals("sonntag")) {
			System.out.println("Yazdiginiz gün Haftasonu'dur.");
		}
			
			
			
			scan.close();
		}
	}

