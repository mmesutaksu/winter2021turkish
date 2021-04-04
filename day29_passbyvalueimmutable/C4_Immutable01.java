package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		
		String isim="Ali";
		isim.concat("can");
		System.out.println(isim);  // Ali
		
		System.out.println(isim.concat("can"));  // Alican
		System.out.println(isim);  // Ali
		
		// String'lerde method ile yaptigimiz degisiklikler kalici olmaz
		// Cünkü Java String class'ini immutable yapmisitr
		
		List<String> isimList=new ArrayList<>();
		System.out.println(isimList);  // []
		isimList.add("Ali");
		isimList.add("can");
		System.out.println(isimList);  // [Ali, can]
		isimList.remove(1);
		System.out.println(isimList);  // [Ali]
		// list'lerde methodlarla yaptigimiz degisiklikler kalici olarak list'e islenir
		// Cünkü list mutable'dir
		
		
	}

}
