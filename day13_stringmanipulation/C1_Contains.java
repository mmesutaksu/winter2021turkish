package day13_stringmanipulation;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		//Kullanicidan bir cümle ve aramak istdigi bir string isteyin
		// cümle stringi iceriyorsa basarili degilse basarisiz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String cümle=scan.nextLine().toLowerCase();
		
		System.out.println("Aramak istediginiz karakter veya karakterleri giriniz");
		String ara=scan.nextLine().toLowerCase();
		
		System.out.println(cümle.contains(ara) ? "basarili" : "basarisiz");
		
		
		//Kullanicidan mail adresini isteyin
		// mail adresi @gmail.com iceriyorsa mailiniz kaydedildi
		// yoksa lütfen gmail adresinizi giriniz
		
		System.out.println("Mail adresinizi yaziniz");
		String mail=scan.next().toLowerCase();
		 						
		int son=mail.indexOf("@gmail.com", mail.length()-10); // asdfg@gmail.com@gmail.com
		// eger @gmail.com en sonda oldugunu kontrol etmek istersek
		// index olarak length()-10
		// eger mail @gmail.com ile bitiyorsa bu islemin sonucu bir sayi(index) olur
		// eger mail @gmail.com ile bitmiyorsa -1 olur.
		System.out.println(mail.contains("@gmail.com") && son!=-1 ? "Mailiniz kaydedildi" : "Lütfen gecerli gmail adresinizi giriniz");
		
		// eger @gmail.com en sonda oldugunu kontrol etmek istersek
		
		
		
		scan.close();
		
		
		
	}

}
