package day43_interfaces;

public interface Interface02 {
	
	// Burdaki default  ve static bizim bildigimiz default ve  static mi?
	// cevap: HAYIR
	
	public default void deneme() {
		System.out.println("default keyword'lu method calisti");
	}
	// bizim bildigimiz default access modifier'di.
	// bir method'da birden fazla acces modifier olur mu?
	// Bizim interface'de olusturdugumuz tüm method'lar public ve abstract'tir
	// interface'de default keyword method kullanarak concrete method olusturabiliriz
	// Buradaki default keyword'u access modifier degil, 
	// Javanin özel bir cözümüdür.
	// Buradaki default keyword, basina yazildigi method'un concrete oldugunu belirtir
	
	static void deneme2() {
		System.out.println("static keyword'lu method calisti");
	}
	// yukaridaki default keyword'u icin yazilanlar static icin de gecerlidir
	
	// static ve default keywor'u kullanarak olusturdugumuz method'lar
	// override edilmek ZORUNDA DEGILDIRLER
	
	
	
}
