package day03_scanner;

public class C3_DataCasting {

	public static void main(String[] args) {
		// byte veri türünde bir degisken olusturup bir deger atayin,
		// olusturulan variable lari AUTO WIDENING ile genisletip yazdirin.
		
		byte numByte=34;
		System.out.println("byte degisken degeri    : "+numByte);
		
		short numShort=numByte;
		System.out.println("short degisken degeri   : "+numShort);
		
		int numInt=numShort;
		System.out.println("integer degisken degeri : "+numInt);
		
		float numFloat=numInt;
		System.out.println("float degisken degeri   : "+numFloat);
		
		double numDouble=numFloat;
		System.out.println("double degisken degeri  : "+numDouble);
		
		
		byte numByte1=55;
		
		double numDouble1=numByte1;
		
		System.out.println("double degisken degeri  : "+numDouble1);
		
		
		
		
		
		

	}

}
