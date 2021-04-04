package day18_whileloop;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		/*Kullanicidan baslangic ve bitis haflerini alin ve 
		  baslangic harfinden baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. 
		  Kullanicinin hata yapmadigini farz edin.
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Baslangic ve bitis harfini yaziniz");
		char ilk=scan.next().toUpperCase().charAt(0);
		char son=scan.next().toUpperCase().charAt(0);
		
		System.out.print(" ");
		
		for (char i = ilk; i <= son; i++) {
			System.out.print(i+" ");
		}
		
		
		System.out.println(" ");
		while (ilk<=son) {
			System.out.println(ilk);
			ilk++;
		}
		
		
		scan.close();
	}

}
