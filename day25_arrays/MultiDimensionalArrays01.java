package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		// ic ice array olusturdugumuzda distaki ana array e outer,
		// icerdekilere inner array denir
		
		int arr[][]= {{1,3,5},{3,5},{5,9,11,3}};
		
		// 11 i index ile ifade etmek istersek arr[2][2] yazariz
		
		// eger Array'i uzunlukla declare etmek istersek inner array uzunluklari esit olmali
		
		int arr2[][]=new int [3][2];  // [3] outer Arrayin icinde kactane inner Array oldugunu belirtir
		
		System.out.println(Arrays.toString(arr2));  // hatali verir 
		System.out.println(Arrays.deepToString(arr2)); // [[0,0],[0,0],[0,0]]
		
		
		

	}

}
