package day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {

	public static void main(String[] args) {
		// iterator'u kullanarak list'in elemanlarini sondan basa dogru yazdirin
		
		List<Integer> sayiList=new ArrayList<>();
		sayiList.add(2);
		sayiList.add(13);
		sayiList.add(56);
		sayiList.add(23);
		sayiList.add(45);
		sayiList.add(14);
		sayiList.add(40);
		
		System.out.println(sayiList);  // [2, 13, 56, 23, 45, 14, 40]
		
		ListIterator li1=sayiList.listIterator();
		
		while(li1.hasNext()) {
			li1.next();
			
		}
		
		while (li1.hasPrevious()) {
			System.out.print(li1.previous()+" ");
		}
		
	}

}
