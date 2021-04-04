package day43_interfaces;

public interface Interface01 {
	
	public void motor(); // interface icinde anstract method'lar ve 
					     // �ZEL concrete method'lar olablir
		/*
	 	Bir abstract method'un body'si olmadigindan o method'un istenen dinamik �zelligi
	 	nasil gerceklestirecegini bilmemiz m�mk�n degildir
	 	Sadece ne yapacagiini biliriz
		
		Bu method bize sunu anlatir:
		Beni inherit eden her concrete class'in dinamik motor �zelligi olmalidir.
		
		*/
	
	void vites(); // bu methodu inherit eden her concrete class'in dinamik motor �zelligi olmalidir.
	abstract void kasa();  // // bu methodu inherit eden her concrete class'in dinamik motor �zelligi olmalidir.
	
	// Interface'de sadece ABSTRACT ve PUBLIC method'lar olur.
	// Bu iki keyword'u yazsakta yazmasakta Java t�m methodlari bu sekilde kabul eder.
	
	// Java'da interface olusturmak istiyorsak bastan o sekilde olusturmaliyiz
	// Bir class sonradan bazi keywor'ler yazilarak interfaces yapilamaz
	
	String ISIM="Mustafa";  // Java isim kelimesini italik ve bold yapti
							// Demek ki t�m variable'ler hem final hem static'tir
	
}
