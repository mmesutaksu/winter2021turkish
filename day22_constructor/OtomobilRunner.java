package day22_constructor;

public class OtomobilRunner {

	public static void main(String[] args) {
		
		Otomobil oto1=new Otomobil();  // Default Constructor iken olusturduk ve biz Constructor olusturunca 
		oto1.vites("otomatik");        // Default iptal oldugundan dolayi burada hata verdi.
									   
									   // eger biz sonradan bir constructor yazarsak, 
		                               // Java default constructor'ı iptal eder.
		
		Otomobil oto2=new Otomobil("Kirmizi");
		
	}

}
