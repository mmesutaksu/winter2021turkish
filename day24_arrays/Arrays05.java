package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		// karisik sirali verilen bir Array'i sirali olarak yazdiriniz
		
		int arr[]= {25,45,7,9,56,987,12,0,45};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// Arrayi Büyükten kücüge siralayalim
		
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(" ");
		
		// ayni Array i büyükten kücüge nasil atariz
		
		int arrTers[]=new int[arr.length];
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]=arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(arrTers));
		

	}

}
