package day29_passbyvalueimmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {
		//  Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
		//  - Method’da indirim uygulayip fiyati main method’da yazdirin
		//  - Method’lari arka arkaya cagirip dogru calistiklarini kontrol edin
		
		double fiyat=100;
		System.out.println("%10 indirimli fiyat: "+indirim10(fiyat));
		System.out.println("%20 indirimli fiyat: "+indirim20(fiyat));
		System.out.println("%25 indirimli fiyat: "+indirim30(fiyat));
		System.out.println("method call sonrasi fiyat: "+fiyat);
	}

	public static double indirim30(double fiyat) {
		
		fiyat*=0.75;
		
		return fiyat;
	}

	public static double indirim20(double fiyat) {
		
		fiyat*=0.80;
		
		return fiyat;
	}

	private static double indirim10(double fiyat) {
		
		fiyat*=0.90;
		
		return fiyat;
	}

}
