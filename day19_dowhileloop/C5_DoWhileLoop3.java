package day19_dowhileloop;

import java.util.Scanner;

public class C5_DoWhileLoop3 {

	public static void main(String[] args) {
		// Kullanicidan bir sifre girmesini isteyin. 
		// Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
		// Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
		// gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
		//  - Sifre kucuk harf icermelidir
		//  - Sifre buyuk harf icermelidir
		//  - Sifre ozel karakter icermelidir
		//  - Sifre en az 8 karakter olmalidir.
		
		Scanner scan=new Scanner(System.in);
		String sifre="";
		int sonuc=0;
		
		do {
			System.out.println("Lütfen Sifrenizi giriniz");
			sifre=scan.nextLine();
			
		sonuc=kücükHarfVarMi(sifre)+büyükHarfVarMi(sifre)+özelKarakterVarMi(sifre)+uzunlukUygunMu(sifre)+sayiVarMi(sifre);
			
			
			
		} while (sonuc!=5);
		
		System.out.println("Sifreniz basariyla kaydedilmistir");
		
		scan.close();
	}

	public static int sayiVarMi(String sifre) {
		int flagSayi=0;
		int index=0;
		
		while (index<sifre.length()) {
			if (sifre.charAt(index)>'0' && sifre.charAt(index)<='9') {
				flagSayi=1;
			}
		index++;
		}
		
		if (flagSayi==0) {
			System.out.println("sifreniz sayi icermelidir");
		}
				
		
		return flagSayi;
	}

	public static int uzunlukUygunMu(String sifre) {
				
		int flagUzunluk=0;
		
		if (sifre.length()<8) {
			System.out.println("Sifreniz en az 8 karakter olmalidir");
		} else {
			flagUzunluk=1;
		}
		
		
		return flagUzunluk;
	}

	public static int özelKarakterVarMi(String sifre) {
		int flagÖzel=0;
		int index=0;
		
		while (index<sifre.length()) {
			if ((sifre.charAt(index)>' ' && sifre.charAt(index)<='/')||(sifre.charAt(index)>':' && sifre.charAt(index)<='@')||(sifre.charAt(index)>'[' && sifre.charAt(index)<='_')) {
				flagÖzel=1;
			}
		index++;
		}
		
		if (flagÖzel==0) {
			System.out.println("sifreniz özel karakter icermelidir");
		}
		
		
		
		
		
		
		return flagÖzel;
	}

	public static int büyükHarfVarMi(String sifre) {
		int flagBüyük=0;
		int index=0;
		
		while (index<sifre.length()) {
			if (sifre.charAt(index)>='A' && sifre.charAt(index)<='Z') {
				flagBüyük=1;
			}
		index++;
		}
		
		if (flagBüyük==0) {
			System.out.println("sifreniz büyük harf icermelidir");
		}
		
		
		return flagBüyük;
	}

	public static int kücükHarfVarMi(String sifre) {
		int flagKücük=0;
		int index=0;
		
		while (index<sifre.length()) {
			if (sifre.charAt(index)>='a' && sifre.charAt(index)<='z') {
				flagKücük=1;
			}
		index++;
		}
		
		if (flagKücük==0) {
			System.out.println("sifreniz kücük harf icermelidir");
		}
		
		
		return flagKücük;
	}

}
