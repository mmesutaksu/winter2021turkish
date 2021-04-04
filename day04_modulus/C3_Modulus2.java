package day04_modulus;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		
		//kullanicidan 4 basamakli bir sayi alalim ve sayinin basamaklarini ters sirada yazdiralim.
		
		//bir sayinin basamaklarini elde etmek icin 2 islemi tekrar tekrar yapariz
		// 1. islem en sondaki basamagi elde etmek
		// 2. islem sondaki basamagi yok etmek
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Basamaklarini bulmak icin L�tfen d�rt basamakli bir sayi giriniz :");
		
		int sayi=scan.nextInt();   //bu satirdan itibaren elimizde 4 basamakli sayi var
		
		// 1.Tekrar
		
		int birlerBas=sayi%10;
		
		sayi/=10;
		int onlarBas=sayi%10;
		
		sayi/=10;
		int y�zlerBas=sayi%10;
		
		sayi/=10;
		int binlerBas=sayi;
		
		System.out.println("Birler Basamagi : "+birlerBas);
		System.out.println("Onlar Basamagi  : "+onlarBas);
		System.out.println("Y�zler Basamagi : "+y�zlerBas);
		System.out.println("Binler Basamagi : "+binlerBas);
		
		//sayiyi tersten yazalim
		
		System.out.print("Verdiginiz sayinin tersten yazilisi : ");
		System.out.print(birlerBas);
		System.out.print(onlarBas);
		System.out.print(y�zlerBas);
		System.out.println(binlerBas);
		
		//Tersten yazdirma farkli y�ntem
		
		System.out.println("Verdiginiz sayinin tersten yazilisi : "+birlerBas+onlarBas+y�zlerBas+binlerBas);
		
		//Sayinin rakamlari toplami
		
		System.out.print("Verdiginiz sayinin rakamlarin toplami : ");
		System.out.println(birlerBas+onlarBas+y�zlerBas+binlerBas);
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
