package day36_overriding;

public class Formen extends Isci {
	public String sorumluOldB�l�m="bakim";
	public String isim="Mesut";
	public static void main(String[] args) {
		
		// Inheritance'da data t�r� olarak class ismi kullanma
		
		Formen fr1=new Formen();
		// fr1 objesini kullanarak hangi class'larin variable'lari g�rebilirim
		fr1.sorumluOldB�l�m="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOldB�l�m+" "+fr1.maas);
		
		Isci fr2=new Formen();
		// data t�r� olarak Isci secildigi icin sadece Isci ve Persone class'i g�r�lebilir
		fr2.b�l�m="Kaynak At�lyesi";
		
		System.out.println(fr2.isim+" "+fr2.b�l�m+" "+fr2.maas);
		// Mesut Kaynak At�lyesi
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim);  // Emre
		
	}
}
