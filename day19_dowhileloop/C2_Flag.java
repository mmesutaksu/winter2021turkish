package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// kullanicidan bir c�mle alin
		//c�mlede b�y�k harf var mi yok mu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir c�mle yaziniz");
		String c�mle=scan.nextLine();
		String flag="yok";
				
		int ilk=0;
		
		while (ilk<c�mle.length()) {
			if (c�mle.charAt(ilk)>='A' && c�mle.charAt(ilk)<='Z') {
				flag="var";
			}
		ilk++;	
		}
		
		System.out.println(flag);
		
		scan.close();
		
	}

}
