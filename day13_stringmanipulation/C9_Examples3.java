package day13_stringmanipulation;

import java.util.Scanner;

public class C9_Examples3 {

	public static void main(String[] args) {
		//Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
		// isim-soyisim : M***** B*******
		//  kart no : **** **** **** 1234
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen adinizi giriniz");
		String isim=scan.next();
		
		System.out.println("Lütfen soyadinizi giriniz");
		String soyisim=scan.next();
		
		System.out.println("Lütfen kart numaranizi giriniz");
		String kart=scan.next();
		
		char isimIlkHarf=isim.toUpperCase().charAt(0);
		String isimGeriKalan=isim.substring(1).replaceAll("\\w", "*");
		String soyisimIlkHarf=soyisim.toUpperCase().substring(0, 1);
		String soyisimGeriyeKalan=soyisim.substring(1).replaceAll("\\w", "*");
		String kartIlk="**** **** **** ";
		String kartSon=kart.substring(kart.length()-4);
		
		System.out.println("Adiniz ve Soyadiniz: "+isimIlkHarf+isimGeriKalan+" "+soyisimIlkHarf+soyisimGeriyeKalan);
		System.out.println("Kart Numarasi: "+kartIlk+kartSon);
		
		
		scan.close();
		
		
		
		
	}

}
