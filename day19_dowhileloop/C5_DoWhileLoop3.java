package day19_dowhileloop;

import java.util.Scanner;

public class C5_DoWhileLoop3 {

	public static void main(String[] args) {
		// Kullanicidan bir sifre girmesini isteyin. 
		// Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
		// Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
		// gecerli sifre girdiginde �Sifreniz Kabul edilmistir� yazdirin.
		//  - Sifre kucuk harf icermelidir
		//  - Sifre buyuk harf icermelidir
		//  - Sifre ozel karakter icermelidir
		//  - Sifre en az 8 karakter olmalidir.
		
		Scanner scan=new Scanner(System.in);
		String sifre="";
		int sonuc=0;
		
		do {
			System.out.println("L�tfen Sifrenizi giriniz");
			sifre=scan.nextLine();
			
		sonuc=k�c�kHarfVarMi(sifre)+b�y�kHarfVarMi(sifre)+�zelKarakterVarMi(sifre)+uzunlukUygunMu(sifre)+sayiVarMi(sifre);
			
			
			
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

	public static int �zelKarakterVarMi(String sifre) {
		int flag�zel=0;
		int index=0;
		
		while (index<sifre.length()) {
			if ((sifre.charAt(index)>' ' && sifre.charAt(index)<='/')||(sifre.charAt(index)>':' && sifre.charAt(index)<='@')||(sifre.charAt(index)>'[' && sifre.charAt(index)<='_')) {
				flag�zel=1;
			}
		index++;
		}
		
		if (flag�zel==0) {
			System.out.println("sifreniz �zel karakter icermelidir");
		}
		
		
		
		
		
		
		return flag�zel;
	}

	public static int b�y�kHarfVarMi(String sifre) {
		int flagB�y�k=0;
		int index=0;
		
		while (index<sifre.length()) {
			if (sifre.charAt(index)>='A' && sifre.charAt(index)<='Z') {
				flagB�y�k=1;
			}
		index++;
		}
		
		if (flagB�y�k==0) {
			System.out.println("sifreniz b�y�k harf icermelidir");
		}
		
		
		return flagB�y�k;
	}

	public static int k�c�kHarfVarMi(String sifre) {
		int flagK�c�k=0;
		int index=0;
		
		while (index<sifre.length()) {
			if (sifre.charAt(index)>='a' && sifre.charAt(index)<='z') {
				flagK�c�k=1;
			}
		index++;
		}
		
		if (flagK�c�k==0) {
			System.out.println("sifreniz k�c�k harf icermelidir");
		}
		
		
		return flagK�c�k;
	}

}
