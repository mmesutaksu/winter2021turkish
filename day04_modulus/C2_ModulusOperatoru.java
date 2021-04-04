package day04_modulus;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		// modulus operatörü bölme isleminde kalani verir
		
		// 15 tek mi cift mi? 15/2 yaparsak kalan=1, yani tektir.
		// 25 3'e bölünür mü? 25/3 kalan=1
		// herhangi bir sayinin 7 ile bölünebildigini kontrol etmek icin modulud kullanilir.
		
		int kalan=15 % 4;   //3
		System.out.println(kalan);
		
		System.out.println(26%8); //2
		
		// 856 sayisinin birler basamagi kactir? 6
		int sayi=856;
		
		int birlerBasamagi= sayi %10;
		System.out.println("sayinin birler basamagi : "+birlerBasamagi);
		
		// 856 sayisinin 10lar basamagi 5
		
		sayi/=10;    //85
		
		int onlarBasamagi= sayi%10;
		System.out.println("sayinin onlar basamagi : "+onlarBasamagi);
		
		// 856 sayisinin yüzler basamagi 8
		sayi/=10;
		System.out.println("sayiyi tekrar 10 a böleriz : "+sayi);
		
		
		
		
		
		
		
		
		
		
	}

}
