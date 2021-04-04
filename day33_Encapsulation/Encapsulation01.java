package day33_Encapsulation;

import day20_scoop.Scope1;
import day21_scoop.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		// OOP concept
		// Object Oriented Programing
		// Bir proje kapsamindaki class'larda olusturulan variable ve method'larin
		// baska class'larda tekrar tekrar yazilmamasi, var oldugu class'tan object üretilerek
		// bu variable ve methodlarin istendigi kadar kullanilmasidir (reusability)
		// Write once Reuse Anywhere
		
		// Scope06 class'indaki varible ve methodlara ulasmak istiyorum
		// bunun icin Scope6 class'indan obje üretmeliyiz
		
		Scope6 obj1=new Scope6();
		// Esitligin sol tarafi declaration
		// declaration 2 parcadir ilk parca data türü, ikinci kisim adidir
		// non-primitive'ler icin data türü ayni zamanda class ismi olabilir
		
		// Esitligin saginda ise deger 2parcadan olusur
		// ilki new keyword, ikincisi constructor'dur
		// hangi class'tan obje üretmek istersek o class'in constructor'ini kullaniriz
		
		obj1.num1=10;
		System.out.println(obj1.num1);  // 10
		
		obj1.add();
		
		// deneme() method'unu main method icine cagiranilir miyiz?
		// deneme() method'u static olmadigindan direkt main methoddan cagirilamaz
		// bunun yerine icinde bulundugumuz class'tan bir obje üretip onun üzerinden
		// static olmayan method'lari cagirabiliriz
		Encapsulation01 obj3=new Encapsulation01();
		obj3.deneme();
			
	}
	
	public void deneme() {
		// Projemiz kapsaminda bulunan tüm Class'lardan 
		// public variable ve methodlara istedigim yerden obje üreterek ulasabilirim
		// eger ulasmak istedigim class üyeleri(class members) public degilse baska 
		// package'lardan ulasmak icin extra islem yapmak gerekir
		Scope1 obj2=new Scope1();
		obj2.isim="Ahmet";
		obj2.soyisim="Ozcelik";
		obj2.sayi=20;
		obj2.method();
		
		
		
	}
	
	

}
