package day42_abstractclasses;

public class C2_Final2 extends C1_Final {

	public static void main(String[] args) {
		
		System.out.println(C1_Final.SAYI);
		
		// static bir variable okul adi gibi heekes icin aynidir
		
		// C1_Final.SAYI+=20;
		// Sayi variable'i final olarak tanimlandigi icin DEGISTIRILEMEZ
		
		C2_Final2 obj1=new C2_Final2();
		
		obj1.deneme();
		obj1.deneme2();
	}

	public void deneme() {
		System.out.println("child class'daki overridng method");
	}
	/* public void deneme2() {  // final method olusturuldugu icin overriding yapamiyoruz
		
		// Cannot override the final method from C1_Final
	}
	*/
	
}
