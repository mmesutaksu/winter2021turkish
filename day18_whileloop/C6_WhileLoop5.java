package day18_whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// verilen sayinin asal olup olmadigini bulunuz
		
		int sayi=11;
		
		int b�len=2;
		
		String flag="Asal";
		
		while (b�len<sayi) {
			
			if (sayi%b�len==0) {
				
				flag="Asal sayi degildir";
			}
			b�len++;
		}
		
		System.out.println(flag);

	}

}
