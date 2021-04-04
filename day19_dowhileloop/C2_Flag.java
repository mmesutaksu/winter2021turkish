package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// kullanicidan bir cümle alin
		//cümlede büyük harf var mi yok mu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cümle yaziniz");
		String cümle=scan.nextLine();
		String flag="yok";
				
		int ilk=0;
		
		while (ilk<cümle.length()) {
			if (cümle.charAt(ilk)>='A' && cümle.charAt(ilk)<='Z') {
				flag="var";
			}
		ilk++;	
		}
		
		System.out.println(flag);
		
		scan.close();
		
	}

}
