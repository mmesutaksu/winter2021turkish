package day28_foreachloop1;

public class C2_ForEachLoop2 {

	public static void main(String[] args) {
		// bir int array olusturun ve tüm sayilari carpan bir for each loop olsturun
		
		int arr[]= {1,2,1,2,4,3,1,2};
		int sonuc=1;
		
		for (int i : arr) {
			sonuc*=i;
		}
		System.out.println("Arrayin tüm elemanlari carpimi: "+sonuc);
	}

}
