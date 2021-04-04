package day21_scoop;

public class Scope2 {

	public static void main(String[] args) {
		
		// Static variable lar icin object olusturma ihtiyaci yoktur
		// Baska bir class tan variable lara ulasmak istedigimizde
		// ulasmak istedigimiz variable nin Class adi. satatic variable adi yazmamiz lazim
		
		System.out.println(Scope1.okulAdi);  // Yildiz Koleji
		System.out.println(Scope1.okulId);  
											// Java runtime programdir.
		
		
		Scope1.okulAdi="Mehmet Koleji";
		System.out.println(Scope1.okulAdi);  // Mehmet Koleji
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);
		System.out.println(Scope1.okulAdi);
	}

}
