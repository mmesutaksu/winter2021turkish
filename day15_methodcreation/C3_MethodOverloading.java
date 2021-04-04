package day15_methodcreation;

public class C3_MethodOverloading {

public static void main(String[] args) {
	// Javada ayni isimde birden fazla method olusturulursa buna overloading denir
	// Overloading yapabilmek icin Method Signature larin farkli olmasik gerekir	
	// Method Signature = isim+parametre sayisi+parametre data t�r�
	
		toplama(2,5);
		
	}
		
	public static void toplama(int sayi1, int sayi2) {
		System.out.println("integer method sonucu: "+(sayi1+sayi2));
	}
	
	public static void toplama(double sayi1, double sayi2) {
		System.out.println("double method sonucu: "+(sayi1+sayi2));
	}
	
	public static void toplama(int sayi1, double sayi2) {
		System.out.println("integer/double method sonucu: "+(sayi1+sayi2));
	}
	
	public static void toplama(double sayi2, int sayi1) {
		System.out.println("double/integer method sonucu: "+(sayi1+sayi2));
	}
	
	public static void toplama(char char1, char char2) {
		System.out.println("char method sonucu: "+(char1+char2));
	}
	
	public static void toplama(String str1, String str2) {
		System.out.println("String method sonucu: "+(str1+str2));
	}
}
