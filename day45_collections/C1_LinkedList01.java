package day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01{
	
	public static void main(String[] args) {
		// linked bagli demektir
		// linked list'te tüm elemanlar tren gibi birbirine baglidir
		
		//Collections'da object olustururkken
		// olusturmak istedigimiz collection'in class'mi interface'mi olduguna bakmaliyiz
		// Eger olusturmak istedigimiz collection interface ise 
		// data türü olarak interface'i, constructor olarak ise uygun bir class secmeliyiz
		// Simdiye kadar List(interface) olusttururken constructor olarak ArraList() seciyorduk
		
		
		List<String> list=new ArrayList<>();
		list.add("X");
		list.add("Y");
		
		LinkedList<String> ll1=new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);  // [A, B]
		ll1.add(1, "C");
		System.out.println(ll1);  // [A, C, B]
		ll1.addAll(list);
		System.out.println(ll1);  // [A, C, B, X, Y]
	
		ll1.addAll(2, list);
		System.out.println(ll1);  // [A, C, X, Y, B, X, Y]
		
		// addLast() Queue interface'sinden alinan bir abstract method
		ll1.addLast("K");
		System.out.println(ll1);  // [A, C, X, Y, B, X, Y, K]
		
		ll1.removeAll(list);
		System.out.println(ll1);  // [A, C, B]
		
		// LinkedList hem List hem Queue interface'lerinin child class'idir
		
		List<String> lList=new LinkedList<>();
		lList.add("Sadece List'den gelen özellikler, methodlar mevcut");
		
		Queue<String> qList=new LinkedList<>();
		qList.add("Sadece Queue'den gelen özellikler, methodlar mevcut");
		
		
		
		
		
	}
}