package day08_ifelsenestedif;

import java.util.Scanner;

public class C3_ArtikYil {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		int yil=scan.nextInt();
		
		if (yil%4==0 && yil%100!=0) {
			System.out.println("Artik yildir");
		}else if (yil%4==0 && yil%100==0 && yil%400==0) {
			System.out.println("Artik yildir");
		}else {
			System.out.println("Artik yil degildir");
		}
		
		
		scan.close();
		
		
		
		
		
	}

}
