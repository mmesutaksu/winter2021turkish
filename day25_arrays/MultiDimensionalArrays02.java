package day25_arrays;

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
		// verilen 2 katli bir Arrayin t�m elemanlarinin toplamini bulalim
		int arr[][]= {{1,2,3},{5,8},{9,6,5,1}};
		int toplam=0;
				
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				toplam+=arr[i][j];
			}
		}
		
		System.out.println("Arraydaki t�m sayilarin toplami: "+toplam);
	}

}
