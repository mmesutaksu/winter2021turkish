package day24_arrays;

public class Arrays03 {

	public static void main(String[] args) {
		//Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		int arr[]= {10,54,2,87,3,4};
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		
		System.out.println(toplam);
		
		// verilen Array'in tüm elemanlarini String methodu olmadan yanyana yazdirin
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
