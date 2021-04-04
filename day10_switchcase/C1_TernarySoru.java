package day10_switchcase;

import java.util.Scanner;

public class C1_TernarySoru {

	public static void main(String[] args) {
		//Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, yoksa  “Uc  basamakli degil” yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		System.out.println((sayi<1000 && sayi>99) || (sayi>-1000 && sayi<-99) ? "Üc basamakli sayi" : "Üc basamakli degil");		
		
		
		scan.close();
		
		
	}

}
