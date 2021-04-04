package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		// Verilen bir Arrayi Liste nasil cevirebiliriz
		
		String arr[]={"Ali","Veli"};
		
		List<String> listArr=Arrays.asList(arr);
		
		System.out.println(listArr);
						
//------------------------------------------------------------------	
				
		Integer arr1[]= {1,2,3};
		
		List<Integer> list2=Arrays.asList(arr1);
		
		System.out.println(list2);
	}

}
