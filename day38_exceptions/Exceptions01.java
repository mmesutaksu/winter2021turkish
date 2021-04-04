package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// kullanicidan 2 tam sayi alin ve b�l�mlerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen b�l�necek tam sayiyi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("L�tfen kaca b�lmek istediginizi yaziniz");
		int sayi2=scan.nextInt();
		
		// java exceptions'i handle etmek icin try-catch blogu olusturmus
		try {
		System.out.println("B�lme isleminin sonucu: "+sayi1/sayi2);
		
		} catch (ArithmeticException e) {
			System.out.println("Sayiyi sifira b�lemezsin");
		}
	}

}
