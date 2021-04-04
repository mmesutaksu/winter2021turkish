package day02_variables;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		// new kelimesi herzaman yeni bir object olusturuluyor demektir
		// Parantezin icine parametre yazilir. Scanner icin System in gerekir
		// scan, Scanner objesine verdigimiz isimdir.
		
		// 1.Adim Scanner Objesi olusturmak
		Scanner scan=new Scanner(System.in);
		
		// 2.Adim kullaniciya bir mesaj yazin
		System.out.println("Karenin Bir Kenarinin Uzunlugunu Giriniz");
		
		// 3.Adim Kullanicinin konsola girdigi degeri programin icine alacagiz
		// Kullanicinin nasil bir sayi girecegi belli olmadigindan 
		double kenar=scan.nextDouble();
		
		
		System.out.println("Karenin Alani = "+kenar*kenar);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
