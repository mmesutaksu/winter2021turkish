package day41_error_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 {

	public static void main(String[] args) {
		
		String str="";
		
		for (int i = 0; i < 1000; i++) {
			str+=i;
		}
		
		// bu kod calistirildiginda kac tane kod olusturulur?
		// 1001
		//String immutable oldugu icin her yeni bir degerde
		// yeni bir String object'i olusturulur ve eski object'ten pointer silinir
		
		// Dolayisiyla loop bittiginde str icin 1 tane pointer'in isaret ettigi obje,
		// 1000 tane de hic bir pointer'in isaret etmedigi obje heap memory'de bulunur
		
		List<Integer> list=new ArrayList<>();
		// bu satir yeni bir obje olusturmasini söylüyor.
		// Java yeni obje icin yer var mi die memory'i kontrol eder
		// ve memory kritik bir seviyede ise(buna java karar verir biz bilemeyiz)
		// Garbage collector'u devreye sokuyor
		
		// Garbage collector finalized() methodunu calistirir
		// finalize() methodu silinecek objeleri isaretler ve 
		// sonra Garbage collector finalized olan objeleri siler
		
	}

}
