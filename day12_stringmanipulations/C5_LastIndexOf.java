package day12_stringmanipulations;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cümle aliniz
		// ve asagidaki uc durumdan uygun olani yazdirin
		// 1 cümle java icermiyor
		// 2 cümle bir tane java iceriyor
		// 3 cümlede birden fazla java var
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cümle yaziniz");
		String cümle=scan.nextLine().toLowerCase();
		
		int ilk=cümle.indexOf("java");
		int son=cümle.lastIndexOf("java");
		
		System.out.println(ilk==-1 ? "Cümle java icermiyor" : ilk==son ? "Cümle bir tane java iceriyor" : "Cümle birden fazla java iceriyor");
		
		if (ilk==-1) {
			System.out.println("Cümle java icermiyor");
		} else if (ilk==son){
			System.out.println("Cümle bir tane java iceriyor");
		} else {
			System.out.println("Cümle birden fazla java iceriyor");
		}
		
		scan.close();
		
		
		

	}

}
