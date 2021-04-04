package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {
	
	public static void main(String[] args) {
		// kullanicidan 35 dan k�c�k pozitif bir sayi alin
		// girilen sayinin fakt�riyelini hesaplayip yazdiran bir method olusturun
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen fakt�riyelini istediginiz 35'ten k�c�k pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		if (sayi>0 && sayi<35) {
			System.out.println(fakt�riyelSonuc(sayi));
		} else {
			System.out.println("L�tfen gecerli bir sayi giriniz");
		}
			
		scan.close();
	}
									
	public static int fakt�riyelSonuc(int sayi) {
		
		int fakt�riyelSonuc=1;
		
		for (int i=1; i<=sayi; i++) {
			fakt�riyelSonuc=fakt�riyelSonuc*i;   
		}
		
		return fakt�riyelSonuc;
		
			
		
	}
}
