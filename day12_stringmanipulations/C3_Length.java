package day12_stringmanipulations;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// Kullanicidan bir String girmesini isteyin
		// Stringin son harfini büyük harf olarak yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cümle giriniz");
		String harf=scan.nextLine();
		System.out.println("Girdiginiz cümlenin son karakteri: "+(harf.toUpperCase().charAt(harf.length()-1)));

		String str2="";
		System.out.println(str2.length());
		
		//String str3=null;
		//System.out.println(str3.length());  hata verir cünkü null hiclik demek // RTE hatasi
		
		scan.close();
		
	}

}
