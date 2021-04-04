package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		int arr[]= {10,23,54};
		String isimler[]=new String[4];  // uzunlugu 4 olan bir array olusturuldu
		
		System.out.println(isimler[1]);
		isimler[2]="Boss";
		isimler[0]="Elveda";
		System.out.println(Arrays.toString(isimler));
		
		for (int i = 0; i < isimler.length; i++) {
			System.out.print(isimler[i]+" ");
		}
		

	}

}
