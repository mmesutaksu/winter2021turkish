package day21_scoop;

public class Scope5 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			
			String isim="Ayse";
			System.out.println(i+" "+isim);
		}
		
		// System.out.println(isim); Loop icicnde olusturulan variableler Loopa ozeldir,
		// Loop disinda kullanilamaz
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i+" ");
		}
		
		// System.out.println(i); hata
		
		int count=0;
		
		
		while (count<5) {
			System.out.println(count);
			count++;
		}
	}

}
