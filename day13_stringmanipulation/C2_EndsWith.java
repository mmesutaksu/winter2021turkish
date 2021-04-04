package day13_stringmanipulation;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
		
		String str="Javayla hayat ne güzel";
		
		System.out.println(str.endsWith("zel")); //true
		
		System.out.println(str.endsWith("ne güzel")); //true
		
		System.out.println(str.endsWith("zel ")); //false
		
		//kullanicidan bir email isteyin
		//eger @ isareti icermiyorsa "girdiginiz bilgi email degil"
		//eger @isareti iceeriyor ama @gmail.com icermiyorsa lütfen gmail adresi yazin
		//eger ilk ikisini sagliyor ama @gmail.com ile bitmiyorsa gecersiz gmail adresi.
		Scanner scan=new Scanner(System.in);
		System.out.println("Email giriniz");
		String mail=scan.nextLine().toLowerCase();
				
		
		if (!mail.contains("@")) {
			System.out.println("Girdiginiz bilgi email degil");
		} else if (!mail.contains("@gmail.com")){
			System.out.println("Lütfen gmail adresi yazin");
		} else if (mail.endsWith("@gmail.com") && mail.indexOf("@gmail.com", mail.length()-10)==-1){
			System.out.println("Email adresiniz basariyla kaydedilmistir");
		} else {
			System.out.println("Lütfen gecerli bir mail adresi giriniz");
		}
		
		scan.close();
		
		

	}

}
