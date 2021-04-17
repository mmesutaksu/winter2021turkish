package day49_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps01 {

	public static void main(String[] args) {
		
		Map<Integer,String> map1=new HashMap<>();
		map1.put(101, "Ali, Can, Java");
		map1.putIfAbsent(102, "Veli, Yan, Java");
		map1.put(103, "Ali, Yan, C#");
		
		System.out.println(map1);  // {101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}
		System.out.println(map1.size());  // 3
		
		System.out.println(map1.entrySet());  // [101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#]
		// Set olarak köseli parantez icinde yazdirir
		
		System.out.println(map1.entrySet().size());  // 3
		// entry; key ve value ikilisinden olusan tüm elemandir
		
		Set<Entry<Integer,String>> mapSet=map1.entrySet();
		
		for (Entry<Integer, String> each : mapSet) {
			
			System.out.println(each);  
			/*
			101=Ali, Can, Java
			102=Veli, Yan, Java
			103=Ali, Yan, C#
			*/
		}
		
		System.out.println(map1.equals(mapSet));  // false
		
		System.out.println(map1.get(101));  // Ali, Can, Java
		// istedigimiz key'in value'lerini getirir
		
		
		
		
		
		
		
		
		
		
	}

}
