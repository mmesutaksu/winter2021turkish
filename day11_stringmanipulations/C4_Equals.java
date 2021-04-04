package day11_stringmanipulations;

public class C4_Equals {

	public static void main(String[] args) {
		// Stringleri karsilastirir. == ile ayni ifadedir ancak Stringde .equals kullanilir
		// sonuc olarak true veya false döndürür.
		
		
		// bazi methodlarin yaptiklari islem ile döndürdükleri sonuc farkli olabilir
		// bir methoda git aliyi sil deriz
		// o gider aliyi bulur siler
		
		String str="Ali Can";
		String str2="Ali Can";
		
		int sayi1=5; // byte short int float double
		int sayi2=5;
		
		// str ile str2 nin esit olup olmadigini yazdirin
		
		System.out.println(str.equals(str2)); // true
		
		System.out.println(sayi1==sayi2);     // false
		
		
		// esittir yada degildir yazdirin
		
		System.out.println(str.equals(str2) ? "Esit" : "Esit degil"); //Esit
		
		if (str.equals(str2)) {
			System.out.println("Esit");
		} else {
			System.out.println("Esit degil");
		}
		
		System.out.println(sayi1==sayi2 ? "sayi1 ve sayi2 esit" : "sayi1 ve sayi2 esit degil");     //Esit degil
		
		if (sayi1==sayi2) {
			System.out.println("sayi1 ve sayi2 esit ");
		} else {
			System.out.println("sayi1 ve sayi2 esit degil");
		}
		
		
		
		// Java da Stringler Case sensitive dir.
		// Büyük kücük harf duyarlidir.
		// bir harf bile degisse Stringler esit olmaz.
		
		
		
		
		
		

	}

}
