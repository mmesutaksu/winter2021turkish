package day36_overriding;

public class Isci extends Personel {
	
	public String b�l�m="Kaynak At�lyesi";
	public int maas=5000;
	public String isim="Mesut";
	
	
	public int maasHesapla() {
		return 30*8*15;  // 30 g�n sayisi, 8 mesai saati, 15 saatlik �cret
	}
	
	public void mesai() {
		
		System.out.println("isciler g�nl�k 8 saat calisir");
	}
	
	
	
	// Overloading: ayni isme sahip ama farkli signature'lara sahip methodlardir
	public int maasHesapla(int gunSayisi) {
		
		return gunSayisi*8*15;
	}
	public int maasHesapla(int gunSayisi,int g�nl�kCalismaSaati) {
		
		return gunSayisi*g�nl�kCalismaSaati*15;
	}
	public int maasHesapla(int g�nl�kCalismaSaati,int gunSayisi,int saat�creti) {
		
		return gunSayisi*g�nl�kCalismaSaati*saat�creti;
	}
}
