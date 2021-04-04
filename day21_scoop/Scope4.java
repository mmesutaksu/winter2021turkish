package day21_scoop;

public class Scope4 {

	public static void main(String[] args) {
		
		int sayi=10;
		
		// 1- System.out.println(isim);   bir method icerisinde olusturulan variable sadece o method icinde kullanilabilir
		
		
		int sayi2;  // 2- bir lokal variable deger atamadan da olusturulabilir (decleration)
		// 2- degeer atamayan local variable lar herhangi bir islemde kullanilamaz
		// 2- ancak ilerde deger atanmasi icin local variable olusturulabilir
		
		sayi2=15;  // assingment
		
		// 3- birden fazla methodun oldugu classlarda her methodda kullanmamiz gereken ortak varibleler varsa
		// 3- Class level da variable olusturmaliyim
		// 3- Ortak variable Classin yapisina bagli olarak Instance veya Static olabilir
	}
	
	public static void staticMethod() {
		
		String isim="Hasan";
		// 1- System.out.println(sayi);  main methoddaki variable lerde baska methodlarin icinde kullanilamaz
	}
	
	public void method() {
		
		boolean isTrue=true;
		// 1- System.out.println(sayi);  bu kural tüm methodlar icin gecerlidir
	}
}
