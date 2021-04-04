package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		
		// toplama(list); varargs esnek oldugundan liste benzese de list degildir
		
		int arr[]= {15,20,25};
		toplama(arr);  // argümant olarak array gönderilebilir
		
		// kullanicidan deger alarak varargs calistiracaksak
		// girilen degerleri bir Array e kaydetmeliyiz
		// bunun icin kullanicidan degerleri esnek oldugundan bir list'e koyariz
		// sonra list'i array'a ceviririz
		
	}
	public static void toplama(int... i) {
				
		int toplam=0;
		for (int each : i) {
			toplam+=each;
		}
		System.out.println(toplam);
		
	}
}
