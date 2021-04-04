package day07_ifelsestatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		//kullanicidan ücgenin kenarlarini alin 3 kenar esitse eskenar
		//degilse eskenar degil yazdirn
		Scanner scan=new Scanner(System.in);
		System.out.println("Ücgenin 3 kenarini yaziniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Eskenar ücgendir");
		} else {System.out.println("Eskenar ücgen degildir");

		}
		
		scan.close();
		
	}

}
