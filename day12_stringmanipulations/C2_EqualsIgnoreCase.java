package day12_stringmanipulations;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		// eualIgnoreCase() methodu karsilastirdiklarina case senstive(büyük kücük duyarliligi olmadan bakar
		// Stringler ayni ise true, ayni degilse false döner.
		
		String str1="Ali Can";
		String str2="Ali CAN";
		String str3="Ali can ";
		
		System.out.println(str1.equals(str2)); // false
		System.out.println(str1.equalsIgnoreCase(str2)); // true
		
		System.out.println(str1.equals(str3)); //false
		System.out.println(str1.equalsIgnoreCase(str3));  //false
		
		
		
		
		
		
		
		
		
	}

}
