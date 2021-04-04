package day22_constructor;

public class CarÜret {
	// Bu classta görünür bir Constructor yoktur
	// Bir class olusturuldugunda java bu classtan object üretilecegini
	// ve görünmeyen DEFAULT Constructor class a yerlestirir
	// DEFAULT CONTRUCTOR parametresizdir ve sadece hicbir özelligi tanimlanamayan 
	// objectler üretilir
	// DEFOULT CONSTRUCTOR ile üretilen bir objenin tüm özellikleri sonradan tanimlanmalidir.
	
	// Eger biz sonrdan bir Constructor olusturursak, Java Default Constructoru iptal eder.#
	
	
	// Olusturdugumuzda Default Constructor u iptal ettiren Constructor:
	public CarÜret() {
		
	}
	// 1- Ismi class ismiyle ani olmalidir
	// 2- Constructor return type'a sahip degildir
	// 3- Constructor isminden sonra mutlaka () olur, parametre istersek girebiliriz.
	// 4- Bir Constructor olusturuldugunda kimlerin kullanacagini belirlemek icin access modofoer yazilabilir.
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;	
	//Cok fazla üüretilecek objeler icin bir tane class olusturulur
	//bu classta olusturulacak objelere ait tüm özellikler olur
	//bu class direkt calistirilmayacagi icin main method olmasa da olur.
	
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak "+yakit+" kullanir");
	}
	
	public void vites(String vites) {
		System.out.println("Araba "+vites+" viteslidir");
	}

}
