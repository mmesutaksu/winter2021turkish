package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {

	public static void main(String[] args) {
		//Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. 
		//Iki method olusturup list elemanlarini artirmayi deneyelim
		// - 1. Method’da elemanlari for each loop kullanarak artirin
		//- 2. Method’da elemanlari set method’u kullanarak artirin
		// - Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);
		
		degistirFor(list);
		System.out.println("Birinci method call sonrasi: "+list);
		degistirSet(list);
		System.out.println("Set ile degistirdigimiz list main method'un icinde: "+list);
	}

	public static void degistirSet(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i)+3);
		}
		System.out.println("Set ile degistirdigimiz list methodun icinde: "+list);
		
	}

	public static void degistirFor(List<Integer> list) {
		
		for (Integer i : list) {
			i+=3;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(list);
	}
}