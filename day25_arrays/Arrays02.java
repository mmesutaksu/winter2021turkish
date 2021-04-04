package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// verilan bir array da bir elemanin var olup olmadigini nasil kontrol ederiz?
		
		int arr[]= {10,25,3,16,75};
		int sayi=25;
		
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				flag=true;
			}
		}
		
		if (flag) {
			System.out.println("Array soruln elemani iceriyor");
		} else {
			System.out.println("Array sorulan elemani icermiyor");
		}
		
		// Arrays classindan method kullanarak yapalim
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 25));  // 3
		System.out.println(Arrays.binarySearch(arr, 10));  // 1
		System.out.println(Arrays.binarySearch(arr, 28));  // -5
		// olmayan sayı eger olsaydı kacıncı sirada olursa o sayiyi verır
		System.out.println(Arrays.binarySearch(arr, 5));   // -2
		System.out.println(Arrays.binarySearch(arr, -14)); // -1
		
		int arr2[]= {12,15,25,14,3,12,65};
		Arrays.sort(arr2);
		
		// Array nasil Stringe cevirilir
		
		String arrayString=Arrays.toString(arr2);
		System.out.println(arrayString);
		System.out.println(arrayString.substring(5));
		
	}

}
