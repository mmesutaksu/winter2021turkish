package day09_ternary;

public class C1_Ternary1 {

	public static void main(String[] args) {
		
		int sayi = 101;
		
		//ternary islemi bir sonuc döndürdügünden bir variable olusturup ona assign etmeliyiz
		String sonuc = sayi%2==0 ? "cift sayidir" : "teksayidir";
		
		System.out.println(sonuc);
		
		//ben bir variable'a assign etmek istemezsem
		//syso icine yazabiliriz
		
		System.out.println(sayi%2==0 ? "cift sayidir" : "teksayidir");
		
		// basina aciklama yazmak istersek, 
		
		System.out.println("islem sonucu : "+ (sayi%2==0 ? "cift sayidir" : "teksayidir"));
		
		
		
		
		
		

	}

}
