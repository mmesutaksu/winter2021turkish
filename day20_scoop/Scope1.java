package day20_scoop;

import java.util.Scanner;

public class Scope1 {

	public int sayi;   //INSTANCE(Object) variable
				// class levelda olusturuldugundan classin her yerinde belli sartlarda kullanilabilir
				// Instance variable lar objeye bagli olarak calisir
	public String isim="Mesut";
	public String soyisim;
	boolean izindeMi;
	char ilkHarf;
	
	public static void main(String[] args) {
		
		// INSTANCE bir variable a main method icinde ulasmak istedigimizde 
		// OBJECT olusturmaliyiz
		
		Scanner scan=new Scanner(System.in); // bu javada standart bir obje olusturma formudur
		// Scanner class ismi.
		// scan obje ismi.
		// new obje olusturma keyword u.
		// Scanner(System.in) class ismi ve (parametre).
		
		Scope1 obje1 = new Scope1();
		
		System.out.println(obje1.sayi);
		System.out.println(obje1.isim);
		System.out.println(obje1.soyisim);
		// INSTANCE variable lar olusturuldugunda biz istersek deger atayabiliriz
		// Eger biz deger atamazsak java DEFAULT deger atar
		
		Scope1 obje2=new Scope1();
		obje2.isim="Müslüm";
		obje2.soyisim="Baba";
		
		System.out.println(obje2.isim+" "+obje2.soyisim);  //Müslüm Baba
		System.out.println(obje1.isim+" "+obje1.soyisim);  //Mesut null
		
		System.out.println(obje2.izindeMi);
		System.out.println(obje2.ilkHarf);
		
		Scope1 obje3=new Scope1();
		obje3.isim="Ferdi";
		obje3.soyisim="Tayfur";
		obje3.izindeMi=true;
		System.out.println(obje3.isim+" "+obje3.soyisim+" "+obje3.izindeMi);
		
		scan.close();
		
		
		
	}
	
	public static void staticMethod() {
		
	}
	
	
	public void method() {
		System.out.println(sayi);  // bu method static olmadigindan variablelere direkt erisebilir
		sayi=sayi+20;  //sadece bu method icerisinde gecerli olmak üzere deger degistirilebilir
		
	}

}
