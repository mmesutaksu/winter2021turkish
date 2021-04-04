package day12_stringmanipulations;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir c�mle aliniz
		// ve asagidaki uc durumdan uygun olani yazdirin
		// 1 c�mle java icermiyor
		// 2 c�mle bir tane java iceriyor
		// 3 c�mlede birden fazla java var
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir c�mle yaziniz");
		String c�mle=scan.nextLine().toLowerCase();
		
		int ilk=c�mle.indexOf("java");
		int son=c�mle.lastIndexOf("java");
		
		System.out.println(ilk==-1 ? "C�mle java icermiyor" : ilk==son ? "C�mle bir tane java iceriyor" : "C�mle birden fazla java iceriyor");
		
		if (ilk==-1) {
			System.out.println("C�mle java icermiyor");
		} else if (ilk==son){
			System.out.println("C�mle bir tane java iceriyor");
		} else {
			System.out.println("C�mle birden fazla java iceriyor");
		}
		
		scan.close();
		
		
		

	}

}
