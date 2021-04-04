package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// Kullanicidan yasini girmesini isteyin. 
		// Kodunuzu kullanici sifirdan kucuk bir sayi girerse
		// Exception verecek sekilde yazin.
		
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yasinizi giriniz");
		int yas=scan.nextInt();
		
			if (yas>=0) {
				System.out.println("Girdiginiz yas: "+yas);
			}else {
				throw new IllegalArgumentException();
			}
			*/
		
		// Java'ya bir exception throw ettirmek icin throw ve new keyword'u kullanilir
		
		// Bu sekilde yazdigimizda Java Exception trow eder ama kodumuz bloke olur
		// Bloke olmasini engellemek istersek try catch ile surround yapabiliriz
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		try {
			if (yas>=0) {
				System.out.println("Girdiginiz yas: "+yas);
			}else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		System.out.println("Kod bloke olmamis");
	}

}
