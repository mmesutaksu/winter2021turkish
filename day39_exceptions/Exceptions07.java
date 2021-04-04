package day39_exceptions;

public class Exceptions07 {

	public static void main(String[] args) {
		// Data türlerini casting yaparken uygun olmayan islem yaparsaniz 
		// Java, ClassCastException hatasi verir
		
		// Eger tamamen sayilardan oölusmayan bir Stringi int e cevirmeye calisirsak 
		// Explicit Narrow casting hatasi verir
		
		int sayi=10;
	 // String str=sayi; // CTE
		
		String str="123456";
		
		System.out.println(str+10);
		
		int strSayi=Integer.parseInt(str);
		System.out.println(strSayi+10);  // 123466
		
		String str2="123a45";
	 // System.out.println(Integer.parseInt(str2));  //  NumberFormatException
		
		Object sayi2=40;
		String sayiStr=(String)sayi2;  // Explicit Narrow casting
									   // ClassCastException hatasi verdi
		
		
		
	}

}
