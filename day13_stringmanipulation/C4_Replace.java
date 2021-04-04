package day13_stringmanipulation;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		// Kullanicidan bir cumle isteyin 
		//cümledeki tüm bosluklari silin
		//ve tüm a larin yerine e yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cümle yaziniz");
		String cümle=scan.nextLine().toLowerCase();
		
		cümle=cümle.replace(" ", "");
		cümle=cümle.replace("a", "e");
		
		System.out.println(cümle);
		
		System.out.println(cümle.replace(" ", "").replace('a', 'e'));
		
		
		scan.close();
		

	}

}
