package day05;

public class C2_WrapperClass {
	
	public static void main(String[] args) {
		//javada iki tür data vardir.
		//Primitiv sadece value icerir.
		//Non-Pirimitiv ise value ve methodlar icerir.
		String isim= "mesut";
		System.out.println(isim.toUpperCase());
		
		//Wrapper Class: Javanin primitiv data türleri ile bazi methodlari 
		//               kullanabilmemiz icin olusturdugu Classlardir.
		
		//boolean, char, byte, short, int, long, float, double
		
		byte sayi=10;
		
		Byte sayi2=12;  //Adi Primitiv data türü ile ayni fakat Non-Primitiv datalara wrapper denir
		
		
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(sayi2);
		System.out.println(sayi);
		
		
		
		
		
	}

}
