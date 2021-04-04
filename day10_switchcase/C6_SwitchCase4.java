package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// VIP
	Scanner scan=new Scanner(System.in);
	System.out.println("VIP Kisaltmasinin aciklamasini istediginiz harfini yaziniz");
	String VIP=scan.next().toUpperCase();
	
	
	switch (VIP) {
	case "V":
		System.out.println("Very");
		break;
	case "I":
		System.out.println("Important");
		break;
	case "P":
		System.out.println("Person");
		break;
	default:
		System.out.println("Lütfen tekrar giriniz");
		break;
	}
	
	// toUpperCase yada toLowerCase olmadan yarsak
	System.out.println("vip Kisaltmasinin aciklamasini istediginiz harfini yaziniz");
	String vip=scan.next();
	
	switch (vip) {
	case "v":
	case "V":
		System.out.println("Very");
		break;
	case "i":
	case "I":
		System.out.println("Important");
		break;
	case "p":
	case "P":
		System.out.println("Person");
		break;
	default:
		System.out.println("Lütfen tekrar giriniz");
		break;

	}

	scan.close();
	
	
}
}