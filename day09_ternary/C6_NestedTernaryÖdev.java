package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary�dev {

	public static void main(String[] args) {
		//Kullanicidan bir harf isteyin kucuk harf ise consola �Kucuk Harf� , 
		//buyuk harfse consola �Buyuk Harf� yoksa �girdiginiz karakter harf degil� yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char harf=scan.next().charAt(0);
		System.out.println(harf>='a' && harf<='z' ? "K�c�k harf" : (harf>='A' && harf<='Z' ? "B�y�k harf" : "Girdiginiz karakter harf degil"));
		
		
		
		scan.close();
		
	}

}
