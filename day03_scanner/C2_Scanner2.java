package day03_scanner;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		// Kullanicidan ismini isteyip, ilk harfini büyük olarak yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen Adinizi Giriniz: ");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		// Stringde harflerin indexleri 0 dan baslar.
		// Biz ilk harfi almayi istedigimiz icin index olarak 0 girmeliyiz.
		 System.out.println("Isminizin Bas Harfi: "+ilkHarf);
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
