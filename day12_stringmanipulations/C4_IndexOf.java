package day12_stringmanipulations;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// IndexOf() methodu bize istedigimiz karakter(ler)in indexini d�nd�r�r
		
		String str="Java �gren, is sahibi ol";
		
		System.out.println(str.charAt(6)); // g
		
		System.out.println("char arama: "+str.indexOf('g'));  // char arattik   6 verdi
		
		System.out.println("String harf arama: "+str.indexOf("g"));  // String arattik 6 verdi
		
		System.out.println("String arama: "+str.indexOf("is"));
		
		System.out.println("Birden fazla ayni harf varsa: "+str.indexOf('i')); // 12  ilk karakteri verir
		
		System.out.println("Baslangic indexi ile: "+str.indexOf('a', 4));  // baslangic indexi inclusive(icinde)
		
		// kullanicidan bir c�mle isteyin
		// case sensitive olmadan Java kelimesini icerip icermedigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir c�mle yaziniz");
		String cumle=scan.nextLine().toLowerCase();
		
		int sonuc=cumle.indexOf("java");  //java varsa java kelimesinin indexi d�ner
										  //java yoksa -1 d�nd�r�r
		System.out.println(sonuc==-1 ? "Java icermiyor" : "Java iceriyor");
		
		
		scan.close();
		
		
		
	}

}
