package day15_methodcreation;

public class C4_ForLoop1 {

	public static void main(String[] args) {
		// Bes defa Hello World yazdiralim
		/*
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		*/
		
		// bunun yerine loop kullaniyoruz
		// ne yapacagimizi javaya s�yl�yoruz, kac kere yapmasi gerektigini de s�yl�yoruz
		
		// t�m looplarda 3 seyi yazmak zoruundayiz
		// 1. baslangic degeri
		// 2. bitis degeri
		// 3. artis degeri
		
		
		for(double i=100 ; i<102 ; i+=1) {
			
		System.out.println(i+"Hello World");	
		
		}
		
		// loop negatif y�ne de gidebilir.
		// sartlari saglamadiginda hata vermez ama calismaz da.
		
	}

}
