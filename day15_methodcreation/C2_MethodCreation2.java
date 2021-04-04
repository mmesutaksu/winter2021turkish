package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		//Kullaniciya kac sayi toplamak istedigini sorun. 
		//Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
		//Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.
		Scanner scan=new Scanner(System.in);
		System.out.print("Kac adet sayiyi toplamak istediginizi yaziniz: ");
		int adet=scan.nextInt();
		
		if (adet<2) {
			System.out.println("En az iki sayi girmelisiniz");
		} else if (adet==2) {
			ikiSayiTopla();
		} else if (adet==3) {
			ucSayiTopla();
		} else if (adet==4) {
			dörtSayiTopla();
		} else {
			System.out.println("Cok sayi girdiniz, ben toplayamam");
		}
			
			scan.close();
	}

	public static void dörtSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.print("1.Sayiyi giriniz: ");
		double sayi1=scan.nextDouble();
		System.out.print("2.Sayiyi giriniz: ");
		double sayi2=scan.nextDouble();
		System.out.print("3.Sayiyi giriniz: ");
		double sayi3=scan.nextDouble();
		System.out.print("4.Sayiyi giriniz: ");
		double sayi4=scan.nextDouble();
		System.out.println("Dört sayinin toplami: "+(sayi1+sayi2+sayi3+sayi4));
		scan.close();
	}

	public static void ucSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.print("1.Sayiyi giriniz: ");
		double sayi1=scan.nextDouble();
		System.out.print("2.Sayiyi giriniz: ");
		double sayi2=scan.nextDouble();
		System.out.print("3.Sayiyi giriniz: ");
		double sayi3=scan.nextDouble();
		System.out.println("Üc sayinin toplami: "+(sayi1+sayi2+sayi3));
		scan.close();
	}

	public static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.print("1.Sayiyi giriniz: ");
		double sayi1=scan.nextDouble();
		System.out.print("2.Sayiyi giriniz: ");
		double sayi2=scan.nextDouble();
		System.out.println("Iki sayinin toplami: "+(sayi1+sayi2));
		scan.close();
	}

}
