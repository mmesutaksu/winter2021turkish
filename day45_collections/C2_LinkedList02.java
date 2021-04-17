package day45_collections;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
		LinkedList<Object> ll1=new LinkedList<>();
		
		// Collections'da esitligin sol tarafina <> icine data türü yazilmasa
		// veya data türü olarak Object yazilsa ble collections calisir
		// Zaman ve hafiza acisindan bunlar verimli degildir
		
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 1000; i++) {
			ll1.add("A"+i);
			ll1.add(20+i);
			ll1.add('C'+i);
		}
		System.out.println(System.currentTimeMillis());
	
		
		LinkedList ll2=new LinkedList<>();

		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < args.length; i++) {
			ll2.add("B"+i);
			ll2.add(25+i);
			ll2.add('K'+i);
		}
		System.out.println(System.currentTimeMillis());
		
		
		LinkedList<Integer> ll3=new LinkedList<>();
		
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < args.length; i++) {
			ll3.add(10+i);
			ll3.add(20+15+i);
			ll3.add(30+'Z'+i);
		}
		System.out.println(System.currentTimeMillis());

		
		
		
	}

}
