package day19_dowhileloop;

public class C6_Scope {
	// Bir Class icinde olusturulan variable lerin nerede gecerli oldugu
	// ve nereden kullanilabildigini o variable in Scope si belirler.
	// Javada Scope nedir.
	
	public static void main(String[] args) {
		int sayi=10;
		
		
		denemeMethod();
		sayi++;
		System.out.println(sayi);
		//System.out.println(isim);
	}

	public static void denemeMethod() {
		String isim="Mehmet";
		
		
		
	}

}
