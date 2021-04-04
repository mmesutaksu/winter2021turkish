package day10_switchcase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		// Kullanicidan bir rakam isteyin
		//girilen rakami yazi ile yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir rakam giriniz");
		int sayi=scan.nextInt();
		
		if (sayi==1) {
			System.out.println("Bir");
		} else if (sayi==2){
			System.out.println("iki");
		} else if (sayi==3) {
			System.out.println("üc");
		} else if (sayi==4) {
			System.out.println("dört");
		} else if (sayi==5) {
			System.out.println("bes");
		} else if (sayi==6) {
			System.out.println("alti");
		} else if (sayi==7) {
			System.out.println("yedi");
		} else if (sayi==8) {
			System.out.println("sekiz");
		} else if (sayi==9) {
			System.out.println("dokuz");
		} else {
			System.out.println("Lütfen tekrar giriniz");
		}

		
		
		// switch ile yazalim
		
		switch (sayi) {
		case 0:
			System.out.println("sifir");
			break;
		case 1:
			System.out.println("bir");
			break;
		case 2:
			System.out.println("iki");
			break;
		case 3:
			System.out.println("üc");
			break;
		case 4:
			System.out.println("dört");
			break;
		case 5:
			System.out.println("bes");
			break;
		case 6:
			System.out.println("alti");
			break;
		case 7:
			System.out.println("yedi");
			break;
		case 8:
			System.out.println("sekiz");
			break;
		case 9:
			System.out.println("dokuz");
			break;
		default:
			System.out.println("Lütfen tekrar giriniz");
			break;
		}
		
		
		
		
		scan.close();
		
		
		
		
		
		
	}

}
