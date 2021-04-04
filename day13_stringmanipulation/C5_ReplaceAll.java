package day13_stringmanipulation;

public class C5_ReplaceAll {

	public static void main(String[] args) {

		String str="Java ogren, mutlu ol, Java candir 12345";
		
		System.out.println(str.replace("Java","hava"));
		
		//replaceAll() methodu replace() methoduna benzer ama 2 fark vardir
		//1 rep. methodu char kabl eder ama repAll etmez
		//2 repAll methodu regex kullanimina izin verir
		
		System.out.println(str.replaceAll("\\w", "*")); //tüm harfler ve rakamlari * yapar
		System.out.println(str.replaceAll("\\W", "*")); // tüm harf ve rakamlar disindakileri * yapar
		System.out.println(str.replaceAll("\\d", ".")); // tüm sayilari . yapar
		System.out.println(str.replaceAll("\\D", ".")); // sayi disinda herseyi . yapar
		System.out.println(str.replaceAll("\\s", "&")); // bosluklari & yapar
		System.out.println(str.replaceAll("\\S", "&")); // bosluk disinda herseyi & yapar
		
	}

}
