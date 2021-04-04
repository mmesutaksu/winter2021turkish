package day33_Encapsulation;

public class Encapsulation02 {
	
	private String okulIsmi="Yildiz Koleji";
	// okul isminin baska classlardan okunabilmesini ama deger atamasi yapilmamasini istiyorsak getter() methodu
	
	private String tcNo="12345678901";
	private int hesapNo=5554321;
	// Obje olusturularak deger atanikp kullanilmasini istedigimiz ama 
	// ilk atadigimiz degerin görünmemesini istiyorsak setter() methodunu kullamiriz
	public int sayi=100;
	
	
	
	public static void main(String[] args) {
		// Eger ulasmak istedigim class üyeleri(class members) public degilse baska 
		// package'lardan ulasmak icin extra islem yapmak gerekir
		
		// Yapabilecegimiz islemlerden 1.si Encapsulation'dur
		// bu class'ta kimseyle paylasmak istemedigimiz variable ve methodlar olusturalim
		
		// Private yapinca güvenlik konusu halledildi.
		// Ancak class üyelerinin private olmasi OOP concept e aykiri
		
		// Encapsulation, classimizda olusturdugumuz classs üyelerine
		// kimlerin ne oranda ulasabilecegini belirlemek icin yapilir
	}
	
	private void denemeMethod() {
		System.out.println("Deneme method'u calisti");
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
		System.out.println(hesapNo);
	}
}
