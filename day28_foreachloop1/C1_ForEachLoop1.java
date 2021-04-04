package day28_foreachloop1;

public class C1_ForEachLoop1 {
	
	public static void main(String[] args) {
		// bir arrayin tüm elemanlarini for loop ile yazdiralim
		
		int arr[]= {2,4,6,8,10,12};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		// for loop yazmamizin amaci Arrayin TÜM ELEMANLARI üzerinde islem apmak ise
		// foreach loop daha koly kod yazmamizi saglar
		
		// each==>her bir demek
		// for each loop istedigim topluluktaki tüm elemanlari birer birerbana getirir
		// for each loop'da BASLANGIC,BITIS VE INDEX YOKTUR
		System.out.println();
		
		for (int each : arr) {
			
			System.out.print(each+" ");
		}
		
	}

}
