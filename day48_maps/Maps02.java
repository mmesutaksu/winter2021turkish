package day48_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		// Verilen bir Map'ta yazilim dili Java olan kisilerin isimlerini bir liste olarak yazdiran
		// bir method yaziniz
		
		Map<Integer,String> map1=new HashMap<>();
		
		map1.put(101, "Ali, Can, Java");
		map1.put(102, "Veli, Yan, Java");
		map1.put(103, "Ali, Yan, C#");
		
		String istenenDil="Java";
		
		List<String> isimListesi = javaBilenler(map1, istenenDil);
		System.out.println(isimListesi);
		
	}

	private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
		
		List<String> geciciIsimListesi=new ArrayList<>();
		
		for (String each : map1.values()) {
			
			String arr[]=each.split(", "); 
			
			if (arr[2].equalsIgnoreCase(istenenDil)) {
				geciciIsimListesi.add(arr[0]);
			}
		}
		
		
		return geciciIsimListesi;
		
		
		
	}

}
