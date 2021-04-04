package day31_varargsstringbuilder;

public class C2_Varargs01 {

	public static void main(String[] args) {
		
		//verilen iki sayiyi toplayan ve sonucu yazdiran bir method yaziniz
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
				
		toplama(sayi1,sayi2);
				
		//verilen üc sayiyi toplayan ve sonucu yazdiran bir method yaziniz
		
		toplama(sayi1,sayi2,sayi3);
		
		// Öyle bir method yazalimki icine kac sayi yazarsak yazalim toplsin
		toplama(2,3);    // ikiSayininToplami methodu calisir
		toplama(2,3,8);  // ücSayininToplami methodu calisir
		
		// istedigimiz kadar sayiyi yazabilecegimiz methodu olusturabilmemiz icin 
		// Java varargs olusturulur
				
	}

	public static void toplama(int sayi1, int sayi2, int sayi3) {
		
		System.out.println("üc sayinin toplami: "+(sayi1+sayi2+sayi3));
	}

	public static void toplama(int sayi1, int sayi2) {

		System.out.println("iki sayinin toplami: "+(sayi1+sayi2));
		
	}

}
