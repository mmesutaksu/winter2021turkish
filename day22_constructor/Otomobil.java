package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk) {  // istersek constructor'i parametreli olarak olusturabiliriz
		
	}
	
	public Otomobil() {  // Default Contructor un yerine bunu yazmaliyiz
		
	}
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak "+yakit+" kullanir");
	}
	
	public void vites(String vites) {
		System.out.println("Araba "+vites+" viteslidir");
	}
	

}
