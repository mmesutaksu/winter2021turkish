package day28_foreachloop1;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoop4 {

	public static void main(String[] args) {
		// iki String array olusturunuz ve 
		// bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		// Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
		
		String arr1[]= {"Ali","Can","Ayse","Seher",};
		String arr2[]= {"Ali","Veli","Mesut","Seher","Sedat",};
		
		// Ortak elemanlar icin bitr list olusturalim
		List <String> ortakElemanlar=new ArrayList<>();
		
		for (String i : arr1) {
			for (String j : arr2) {
				if (i.equals(j)) {
					ortakElemanlar.add(i);
				}
			}
		}
		System.out.println(!ortakElemanlar.isEmpty() ? ortakElemanlar : "Ortak eleman yok");

	}

}
