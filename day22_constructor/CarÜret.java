package day22_constructor;

public class Car�ret {
	// Bu classta g�r�n�r bir Constructor yoktur
	// Bir class olusturuldugunda java bu classtan object �retilecegini
	// ve g�r�nmeyen DEFAULT Constructor class a yerlestirir
	// DEFAULT CONTRUCTOR parametresizdir ve sadece hicbir �zelligi tanimlanamayan 
	// objectler �retilir
	// DEFOULT CONSTRUCTOR ile �retilen bir objenin t�m �zellikleri sonradan tanimlanmalidir.
	
	// Eger biz sonrdan bir Constructor olusturursak, Java Default Constructoru iptal eder.#
	
	
	// Olusturdugumuzda Default Constructor u iptal ettiren Constructor:
	public Car�ret() {
		
	}
	// 1- Ismi class ismiyle ani olmalidir
	// 2- Constructor return type'a sahip degildir
	// 3- Constructor isminden sonra mutlaka () olur, parametre istersek girebiliriz.
	// 4- Bir Constructor olusturuldugunda kimlerin kullanacagini belirlemek icin access modofoer yazilabilir.
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;	
	//Cok fazla ��retilecek objeler icin bir tane class olusturulur
	//bu classta olusturulacak objelere ait t�m �zellikler olur
	//bu class direkt calistirilmayacagi icin main method olmasa da olur.
	
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak "+yakit+" kullanir");
	}
	
	public void vites(String vites) {
		System.out.println("Araba "+vites+" viteslidir");
	}

}
