package day13_stringmanipulation;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		// Kullanicidan bir cumle isteyin 
		//c�mledeki t�m bosluklari silin
		//ve t�m a larin yerine e yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir c�mle yaziniz");
		String c�mle=scan.nextLine().toLowerCase();
		
		c�mle=c�mle.replace(" ", "");
		c�mle=c�mle.replace("a", "e");
		
		System.out.println(c�mle);
		
		System.out.println(c�mle.replace(" ", "").replace('a', 'e'));
		
		
		scan.close();
		

	}

}
