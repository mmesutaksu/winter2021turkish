package day38_exceptions;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		
		int count=1;
		Scanner scan=new Scanner(System.in);
		
		while(count<=100) {
			
		System.out.println("Lütfen bölünecek tam sayiyi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("Lütfen kaca bölmek istediginizi yaziniz");
		int sayi2=scan.nextInt();
		
		System.out.println("islem no: "+count);
		try {
			System.out.println("Bölme isleminin sonucu: "+sayi1/sayi2);
		} catch (ArithmeticException e) {
			System.out.println("sayiyi sifira bölemezsin");
		}
		count++;
		}
		
	}

}
