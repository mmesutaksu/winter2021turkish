package day45_collections;

import java.util.LinkedList;

public class C3_LinkedList03 {

	public static void main(String[] args) {

		LinkedList<String> ll1=new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);  // [A, B]
		
		System.out.println(ll1.remove(0));  // A // Sildigi elemani döndürür, hem siler hem de sildigini gösterir
		
		System.out.println(ll1);  // [B]
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);  // [B, A, B]
		
		System.out.println(ll1.remove("B")); // true ya da false döndürür
		System.out.println(ll1);  // [A, B] ilk B'yi sildi
		ll1.addFirst("B");
		System.out.println(ll1);  // [B, A, B]
		ll1.removeFirstOccurrence("B");
		System.out.println(ll1);  // [A, B] ilk B'yi sildi
		ll1.remove();
		System.out.println(ll1);  // [B] ilk elemani siler
		
		
		
		
		
	}

}
