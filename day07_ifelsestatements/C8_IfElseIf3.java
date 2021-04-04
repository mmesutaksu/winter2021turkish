package day07_ifelsestatements;

import java.util.Scanner;

public class C8_IfElseIf3 {

	public static void main(String[] args) {
		// maas icin teklif isteyin
		//80,000 üstüyse kabul edelim
		//60,000 80,000 arasi düsünürüm
		//60,000 den düsükse kabul etmeyelim
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Maas teklifinizi yaziniz");
		int maas=scan.nextInt();
		
		if (maas>=80000) {
			System.out.println("Kabul ediyorum");
		} else if(maas>=60000){
			System.out.println("Konusabiliriz");
		}else {
			System.out.println("Kabul Etmiyorum");
		}
		
		
		
		scan.close();
	}

}
