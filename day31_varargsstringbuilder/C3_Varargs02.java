package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		// istedigimiz kadar sayiyi girdigimizde tüm sayilari toplayan bir method yazalim
		// Var--- variety cesitli args--- arguments
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(4,5,5,3,3,232,25);
		
	}

	public static void toplama(int... i) { // data türünden sonra... yazinca varags kullanacagiz demektir
		int toplam=0;
		for (int each : i) {
			toplam+=each;
		}
		System.out.println("Toplam: "+toplam);
		
	}

}
