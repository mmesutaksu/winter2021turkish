package day35_inheritance;

public class Personel {
	public String isim;
	public int sayi;

	public Personel() {  // parametresiz bir const. olusturduk
		// super();
		// Javadan yardim alarak bir const. olusturdugumuzda,
		// Java const.'in ilk satirina super(); keywordunu ekler
		// Eger icinde oldugumuz class bir child class degilse super(); keywordu silinebilir
		// Bugüne kadar olusturdugumuz const.'larda hic super(); keywordunu kullanmadik
		//ancak bizim class'larimiz child class olmadigindan sorun yok
		
		
		System.out.println("Personel parametresiz constructor calisti");
	}
	
	public Personel(String isim, int sayi) {  // Parametreli bir const. olusturduk
		//super();
		System.out.println("Personel parametreli constructor calisti");
	}
	
	// Her class default constructor a sahiptir
	// Default constructor'in parametresi yoktur
	// Biz parametreli veya parametresiz bir constructor olusturdugumuzda default olan silinir
	// Eger biz sadece bir tane parametreli bir consructor olusturursak, Java defaultu sildiginden 
	//parametresiz constructor kalmaz
	// Dolayisiyla parametreli bir constructor olusturdugumuzda mutlaka default icin de parametresiz
	//bir constructor olusturmamiz gerekir
	
	
}
