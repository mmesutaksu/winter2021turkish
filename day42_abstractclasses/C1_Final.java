package day42_abstractclasses;

public class C1_Final {
	
	final static int SAYI=10;
	// instance bir variable'i final ve static yaparsaniz java onu bold yapar
	// biz de ismi BÜYÜK HARFLE yazariz
	
	String isim; // null
	// Instance variable'lara degeri sonradan degistirilemeyecegi icin
	// Deger atamadigimizda Java data türüne göre default bir deger atar
	
	// final String soyIsim;
	// final variable'larin degeri sonradan degistirilemeyecegi icin 
	// Java, atama yapilmadan final varible'in olusturulmasina izin vermez
	
	public static void main(String[] args) {
		
		System.out.println(C1_Final.SAYI);
		// C1_Final.SAYI*=20;  // Degistirilemez
		
		System.out.println(Integer.MAX_VALUE); // bu variable final'dir		
	}
	
	public void deneme() {
		System.out.println("deneme yazdiriyoruz");
	}
	public final void deneme2() {
		System.out.println("2.denemeyi yapiyoruz");
	}
}
