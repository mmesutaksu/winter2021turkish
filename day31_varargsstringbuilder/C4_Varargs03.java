package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(4,5,5,3,3,232,25);
		
	}
	
	public static void toplama(int sayi, int... i) { // data türünden sonra... yazinca varags kullanacagiz demektir
		System.out.println("varargs'a dahil olmayan argument: "+sayi);
		
		int toplam=0;
		for (int each : i) {
			toplam+=each;
		}
		
		int carpim=toplam*sayi;
		System.out.println(carpim);
		
		
	}	
}
