package day42_abstractclasses;

public class Isci extends Personel {

	public static void main(String[] args) {
		Isci isci1=new Isci();
		isci1.maasHesapla();  // isciler icin maas 5000 tl
		isci1.mesaiBilgisi(); // iscilar günlük 8 saat calisir
		isci1.isim="Rumeysa";
		System.out.println(isci1.isim);  // Rumeysa
		isci1.özelSigorta();  // Bu personel özel sigorta kapsamindadir
		
		
	}

	@Override
	public void maasHesapla() {
		// Parent clas'taki abstract methodu implement etti(uyarladi)
		// 1- abstract class'i Parent edindiysek mutlaka oradaki abstract method'u
		// implement etmeliyiz
		// 2- Parent class'taki abstract methodda body olmadigi icin onu kullanamayiz ve
		// child class'ta body'si olan method (concrete) kullanarak islem yapmaliyiz
		System.out.println("isciler icin maas 5000 tl");
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("iscilar günlük 8 saat calisir");
	}

}
