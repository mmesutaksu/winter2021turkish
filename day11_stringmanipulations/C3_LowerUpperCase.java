package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.toLowerCase() verilen Stringin hepsini k�c�k harfe cevirir
		// str.toUpperCase() verilen stringin hepsini k�c�k harfe cevirir
		
		String str="Techproeducation";
		
		// b�y�k harf ile yazdiracaksak
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str);
		
		//etr i b�y�k harfe cevirmek istersek
		
		str=str.toUpperCase(); // artik str b�y�k harf
		
		System.out.println(str);
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
