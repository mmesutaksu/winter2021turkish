package day24_arrays;

import java.util.Arrays;

public class Arrays02_2 {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
				
		Integer arr2[]=new Integer[arr.length];
		arr2[arr.length-1]=arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			arr2[i-1]=arr[i];
		}
		System.out.println(Arrays.toString(arr2));
	}
}
