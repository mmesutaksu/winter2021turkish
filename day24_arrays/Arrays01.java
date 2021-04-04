package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		int sayi=10;
		int sayi2=10;
		int sayi3=30;
		String isim="Ali";
		
		int arr[]= {10,20,30};  // bu örnekte Array'in elemanlarini direkt yazdigim icin
								 // uzunluk belirtmeye gerek kalmadi
		
		System.out.println(Arrays.toString(arr));   // [10, 20, 30]
		
		String takim[]=new String[3];  // [null, null, null] Java 3 elemeanli String Array olusturdu
		
		System.out.println(Arrays.toString(takim));  // [null, null, null]
		
		takim[0]="Ali";
		System.out.println(Arrays.toString(takim));  // [Ali, null, null]
		
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim));  // [Ali, Veli, Hasan]
		
		// Array'in uzunlugunu bulabiliriz
		System.out.println(takim.length); // 3
		
		// Array deki son elemani mehmet yapin
		takim[takim.length-1]="Mehmet";
		System.out.println(Arrays.toString(takim));  // [null, null, null]
		
		// ortadaki elemni degistrme
		if (takim.length%2==1) {
			int ortaIndex=((takim.length+1)/2)-1;
			takim[ortaIndex]="Can";
			
		}
		System.out.println(Arrays.toString(takim));
		
		
	}

}
