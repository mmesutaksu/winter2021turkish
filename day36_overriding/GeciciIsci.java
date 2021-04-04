package day36_overriding;

public class GeciciIsci extends Isci {
	
		public String calistigiBölüm="Yemekhane";
	
	public static void main(String[] args) {
		
		// Overriding
		// bir child class'ta parent class'tan mkiras alinan method'u
		// degistirmeye overriding denir
		
		GeciciIsci gi1=new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
	}
	
	
	public int maasHesapla() {
		
		return 30*8*10;
	}

				// annotation: amaci sadece burada overriding var demektir ve overriden degisince 
				// buradaki methodu calistirmaz. ama kaldirirsak hata gider
	//@Override   
	public void mesai() {
		//super.mesai();
		System.out.println("Gecici isciler haftada 25 saat calisir");
	}
	// eger overriding edilen parent class'taki method'un(overriden) da
	// calismasini istiyorsak overriding methodunun icine super.isim(); yazariz
	// eger overriding methodunun ilk satirina super.isim(); yazilmazsa 
	// overriden calismaz, sadece overriding calisir
	
	// Access modifier child class parent classi sinirlandiramaz
	
	
	//Return type
	// overriden methodun return type'i primitiv ise
	// overriding methodun return type'da ayni olmali
	
	// ancak non-primitiv ise overriding return type'i 
	// aynisi ya da daha dar olmalidir
}
