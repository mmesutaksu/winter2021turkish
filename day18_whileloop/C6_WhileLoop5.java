package day18_whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// verilen sayinin asal olup olmadigini bulunuz
		
		int sayi=11;
		
		int bölen=2;
		
		String flag="Asal";
		
		while (bölen<sayi) {
			
			if (sayi%bölen==0) {
				
				flag="Asal sayi degildir";
			}
			bölen++;
		}
		
		System.out.println(flag);

	}

}
