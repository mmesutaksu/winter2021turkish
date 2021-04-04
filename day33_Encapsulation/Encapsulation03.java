package day33_Encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		// Encapsulation02 class'indaki class member'a ulasmaya calisalim
		
		Encapsulation02 obj1=new Encapsulation02();
		Encapsulation02 obj2=new Encapsulation02();
		
		// Biz erisim yetkisini ikiye ayiririz
		// 1- Okuyabilmek  get()
		// 2- Degistirip kullanabilme  set()
		
		System.out.println(obj1.sayi);  //100  // public oldugu icin hem görüntülenebilir hem degistirilebilir
		obj1.sayi=25;
		System.out.println(obj1.sayi);  //25
		
		System.out.println(obj2.sayi);  //100
		
		System.out.println(obj1.getOkulIsmi());  // sadece görüntüleyebiliriz degistiremeyiz
		
		obj1.setHesapNo(546789);   // sadece degistirebiliriz görüntülemeyiz
		
		obj1.setTcNo("123456789"); // sadece degistirebiliriz görüntülemeyiz
		
		
		
		
		
	}

}
