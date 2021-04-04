package day16_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullanicidan pozitif bir sayi alin
		// birden kullanicinin girdigi sayiya kadar olan tüm tam sayilarin toplami
		
		Scanner scan=new Scanner(System.in);
		System.out.println("pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt();
		int toplam=0;
		
		for (int i=1; i<=sayi; i++) {
			
			toplam+=i;
		}
		
		if (sayi<0) {	System.out.println("lütfen pozitif bir tam sayi giriniz");
			
		} else if (sayi==0){	System.out.println("toplam: 1");
			
		} else {	System.out.println("Toplam: "+toplam);
			
		}
		
		
		
		scan.close();
		
	}

}
