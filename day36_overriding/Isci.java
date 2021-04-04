package day36_overriding;

public class Isci extends Personel {
	
	public String bölüm="Kaynak Atölyesi";
	public int maas=5000;
	public String isim="Mesut";
	
	
	public int maasHesapla() {
		return 30*8*15;  // 30 gün sayisi, 8 mesai saati, 15 saatlik ücret
	}
	
	public void mesai() {
		
		System.out.println("isciler günlük 8 saat calisir");
	}
	
	
	
	// Overloading: ayni isme sahip ama farkli signature'lara sahip methodlardir
	public int maasHesapla(int gunSayisi) {
		
		return gunSayisi*8*15;
	}
	public int maasHesapla(int gunSayisi,int günlükCalismaSaati) {
		
		return gunSayisi*günlükCalismaSaati*15;
	}
	public int maasHesapla(int günlükCalismaSaati,int gunSayisi,int saatÜcreti) {
		
		return gunSayisi*günlükCalismaSaati*saatÜcreti;
	}
}
