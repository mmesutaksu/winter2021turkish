package day13_stringmanipulation;

public class C6_Substring {

	public static void main(String[] args) {
		// 
		String str="Her ders Java gibi olsa";
		
		System.out.println(str.substring(10));  //10. karakter dahil ve sonrasini yazdirir
		System.out.println(str.substring(str.length()-10));  //sondan 10.haric yazdirir.
		System.out.println(str.substring(0, 10));  //ilk 10 harfi yazdirir.
												   // substring(0, 10) yazildiginda, 0 dahil 10 dahil degil anlaminda
		//11. karakterden sonuna kadar olan stringi yazdirin
		System.out.println(str.substring(10));
		
		//str in ilk 10 karakteri * ile gizleyin, geriye kalanlar normal yazilsin
		
		System.out.println("**********"+ str.substring(10));
		System.out.println(str.substring(0, 10).replaceAll("\\D", "*")+str.substring(10));
		
		System.out.println(str.substring(10, 10)); // baslangic indexi olsun der, bitis indexi olmasin der
												   // Java son söyleneni uygular
		System.out.println(str.substring(23));  // hic
		
		//str in ilk 10 karakteri * ile gizleyin, gerisi normal yazsin
		
		String str2=str.substring(0, 10); //ilk 10 karakteri aldik
		str2=str2.replaceAll("\\W", "a"); //harf olmayanlarin hepsini a harfine cevirdik
		System.out.println(str2.replaceAll("\\w", "*")+str.substring(10)); //ilk 10 harfin hepsini * yaptik
																		   // ve 10.haric geriye kalan tüm karakterleri ekledik
		
		// str.trim() iki ucundaki boslugu siler. 
	}

}
