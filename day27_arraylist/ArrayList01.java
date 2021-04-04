package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		
		System.out.println(list); // [Ali, Can, Ayse, Fatma]
		
		System.out.println(list.size());  // 4
		
		System.out.println(list.remove(1)); // indexi 1 olan Can'i silip, sildigi elemani bana d�nd�recek
		System.out.println(list);
		
		System.out.println(list.remove("Ayse")); // Ayseyi silip bize true yazacak
		System.out.println(list);
		
		System.out.println(list.remove("Mehmet"));  // Mehmeti bulamadigi icin silemeyecek ve false yazacak
		
		
		
		
	}

}
