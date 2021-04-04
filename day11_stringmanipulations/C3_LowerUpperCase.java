package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.toLowerCase() verilen Stringin hepsini kücük harfe cevirir
		// str.toUpperCase() verilen stringin hepsini kücük harfe cevirir
		
		String str="Techproeducation";
		
		// büyük harf ile yazdiracaksak
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str);
		
		//etr i büyük harfe cevirmek istersek
		
		str=str.toUpperCase(); // artik str büyük harf
		
		System.out.println(str);
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
