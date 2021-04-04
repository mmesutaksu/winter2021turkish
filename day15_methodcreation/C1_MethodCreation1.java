package day15_methodcreation;

import java.util.Scanner;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		//Kullanicidan bir tam sayi alin. 
		//Bu sayinin negatif veya pozitif oldugunu,  
		//tek mi cift mi oldugunu ve 
		//3 basamakli ve veya daha b�y�kse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		//100�den kucukse sadece 1�ler basamagini yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("L�tfen bir tam sayi giriniz: ");
		int sayi=scan.nextInt();
		
		pozitifNegatif(sayi);  //girilen sayi arg�mentinin pozitif ya da negatif oldugunu yazdirsin
		tekMiCiftMi(sayi);
		
		if (sayi>=100) {
			yuzdenB�y�k(sayi);
		} else {
			y�zdenK�c�k(sayi);
		}
		scan.close();
	}
	
	
	public static void y�zdenK�c�k(int sayi) {
		System.out.println(sayi%10);
		
	}


	public static void yuzdenB�y�k(int sayi) {
		int rakamlarToplami;
		rakamlarToplami=sayi%10;
		sayi/=10;
		rakamlarToplami+=sayi%10;
		sayi/=10;
		rakamlarToplami+=sayi%10;
		System.out.println(rakamlarToplami);
		
	}


	public static void tekMiCiftMi(int sayi) {
		
		System.out.println(sayi%2==0 ? "cift sayidir" : "tek sayidir");
		
	}


	public static void pozitifNegatif(int sayi) {  //parametre yazarken data tipini de yazmaliyiz
		
		System.out.println(sayi>0 ? "pozitif" : sayi<0 ? "negatif" : "pozitif yada negatif degildir");
		
	}
	
	
	
	
	
}
