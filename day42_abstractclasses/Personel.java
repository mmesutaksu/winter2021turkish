package day42_abstractclasses;

public abstract class Personel {
	
	// Bir class'i abstract yapmak icin class keyword'undan önce 
	// abstract yazmak yeterlidir
	
	// abstract bir class'in icinde variable olabilir
	
	public String isim="naber";
	
	// Variable'lar abstract olamaz cünkü 
	
	// abstract class'in tüm concrete child'lari abstract class'taki 
	// tüm dinamik özellikleri override etmek zorundadir
	
	// bir method abstract olabilir
	public abstract void maasHesapla();
	public abstract void mesaiBilgisi();
	
	// Bir abstract class'ta concrete method yazilabilir
	// Concrete child class'lar abstract methodlari override etmek ZORUNLUDUR
	// Concrete methodlari override etmek istege baglidir.
	
	public void özelSigorta() {
		System.out.println("Bu personel özel sigorta kapsamindadir");
	}
	
	
	
}
