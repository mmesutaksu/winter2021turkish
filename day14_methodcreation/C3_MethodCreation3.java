package day14_methodcreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		// verilen 3 double sayinin ortalamasini alan bir method yazin
		//sonuclarini
		
		ortalama(10,20); // 2. yi calistirir 15
		ortalama(10,20,30); // 3.yi calistirir  20
		

	}
	
	public static void ortalama(double sayi1,double sayi2,double sayi3) {
		System.out.println("Verilen sayilarin ortalamasi: "+(sayi1+sayi2+sayi3)/3);
		
		
		
	}
	
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("Girdiginiz iki sayinin ortalamasi: "+(sayi1+sayi2)/2);
	
	}
}
