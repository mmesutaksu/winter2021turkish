package day38_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// try catch blogundaki e'nin görevi
		
		int sayi1=10;
		int sayi2=0;
		
		Exceptions01 exp=new Exceptions01();
		// esitligin solundaki Exceptions01 hem class adi hemde exp objecti icin data türü
		
		try {
			System.out.println(sayi1/sayi2);
		} catch (ArithmeticException e) {
		// ArithmeticException java'da bir class ve e objesi icin data türü
		// e ise ArithmeticException class'indan olusturdugumuz objenin adidir
			System.out.println(e);  // java.lang.ArithmeticException: / by zero yazdirir
		// bu durumda hem java'ya sorunu yazmasi icin firsat vermis
		// hem de aplicationu bloke etmemis oluruz
			System.out.println(e.getMessage());  // / by zero yazdirir
		}

	}

}
