package day36_overriding;

public class Formen extends Isci {
	public String sorumluOldBölüm="bakim";
	public String isim="Mesut";
	public static void main(String[] args) {
		
		// Inheritance'da data türü olarak class ismi kullanma
		
		Formen fr1=new Formen();
		// fr1 objesini kullanarak hangi class'larin variable'lari görebilirim
		fr1.sorumluOldBölüm="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOldBölüm+" "+fr1.maas);
		
		Isci fr2=new Formen();
		// data türü olarak Isci secildigi icin sadece Isci ve Persone class'i görülebilir
		fr2.bölüm="Kaynak Atölyesi";
		
		System.out.println(fr2.isim+" "+fr2.bölüm+" "+fr2.maas);
		// Mesut Kaynak Atölyesi
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim);  // Emre
		
	}
}
