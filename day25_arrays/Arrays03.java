package day25_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// verilen bir String'i Array a nasil ceviririz?
		// verilen bir cümlede kac kelime oldugunu bulunuz
		// verilen bir cümlede her kelimenin ilk harfini büyük yapiniz
		
		String str="Herkes Javayi tanisa severdi";
		// bu stringi kelimelere ayirin
		// split methodu
		
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String arr2[]=str.split("Java");
		System.out.println(Arrays.toString(arr2));
		
		String arr3[]=str.split("a");
		System.out.println(Arrays.toString(arr3));
		
		String arr4[]=str.split("");
		System.out.println(Arrays.toString(arr4));
		
		
	}

}
