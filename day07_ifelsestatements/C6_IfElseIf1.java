package day07_ifelsestatements;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Aldiginiz notu yaziniz");
		double not=scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("Lütfen gecerli bir not yazin");
		} else if(not<50) {
			System.out.println("Notunuz : D");
		} else if(not<60) {
			System.out.println("Notunuz : C");
		} else if(not<80) {
			System.out.println("Notunuz : B");
		} else {
			System.out.println("Notunuz : A");
		}
		
		
		
		
		scan.close();
		
		
		
		
		
	}

}
