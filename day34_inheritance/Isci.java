package day34_inheritance;

public class Isci extends Muhasebe{

	public static void main(String[] args) {
		
		Isci isci1=new Isci();
		isci1.isim="Ömer";
		isci1.Soyisim="Aydin";
		isci1.id=1001;
		isci1.izindeMi=false;
		isci1.saatÜcreti=10;
		isci1.statü="Isci";
		isci1.maas=isci1.maasHesapla();
		
		System.out.println(isci1.id+" "+isci1.isim+" "+isci1.Soyisim+" "+isci1.statü+" "+isci1.maas+" TL");
		
		// Child class da olusturdugum obje ile tüm parent class'larda bulunan variable ve methodlari
		// inherit edebilirim.
		
		Isci isci2=new Isci();
		isci2.isim="Esad";
		isci2.Soyisim="Okumus";
		isci2.id=1002;
		isci2.izindeMi=true;
		isci2.saatÜcreti=15;
		isci2.statü="Isci";
		isci2.maas=isci2.maasHesapla();
		
		System.out.println(isci2.id+" "+isci2.isim+" "+isci2.Soyisim+" "+isci2.statü+" "+isci2.maas+" TL");
		
	}

}
