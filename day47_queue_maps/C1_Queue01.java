package day47_queue_maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue01 {

	public static void main(String[] args) {
		
		Queue<String> k1=new PriorityQueue<>();
		k1.add("D");
		k1.add("C");
		k1.add("M");
		k1.add("A");
		
		System.out.println(k1);  // [A, M, C, D]  tamamen javanin kendi siralamasi
		
		// Istersek priority kuralini tanimlayabiliriz. 
		// Bizim istedigimize göre siralama yapilir.
		
		
		Queue<String> k2=new LinkedList<>();
		k2.add("D");
		k2.add("C");
		k2.add("M");
		k2.add("A");
		
		System.out.println(k2);  // [D, C, M, A]  eklenme önceligine göre siralar
		// FIFO kurali gecerlidir. First in First Out
		
		k2.offer("Z");  // en sona ekler
		System.out.println(k2);  // [D, C, M, A, Z]
		
		System.out.println(k2.peek());  // D ilk elemani döndürür
		System.out.println(k2);  // [D, C, M, A, Z]
	
		k2.remove();
		System.out.println(k2);  // [C, M, A, Z]
		k2.remove();
		System.out.println(k2);  // [M, A, Z]
		
		k2.remove("A");  // indexle silemeyiz sadece karakter belirtip silebiliriz
		System.out.println(k2);  // [M, Z]
		
		k2.poll();  // ilk elemani siler ve döndürür
		System.out.println(k2);  // [Z]
		
		System.out.println(k2.element());  // Z
		
		
		
		k2.remove();
		System.out.println(k2.isEmpty()); 
		// k2.remove(); bos bir queue'den remove ile eleman silmek istersek exception verir
		
		k2.poll();
		// bu method eleman olmasa da hata vermez. eleman olmadigindan null döndürür
		
		
		

		
		
		
		
	}
}
