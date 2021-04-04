package day20_scoop;

public class Scope2 {

	public static void main(String[] args) {
		// farkli classlardan da Scope1 class ina object olusturarak ulasabilirim
		
		Scope1 obje4=new Scope1();
		
		System.out.println(obje4.isim);
		System.out.println(obje4.soyisim);
		obje4.isim="Ahmet";
		obje4.soyisim="Can";
		
		System.out.println(obje4.isim+" "+obje4.soyisim);
		
		

	}

}
