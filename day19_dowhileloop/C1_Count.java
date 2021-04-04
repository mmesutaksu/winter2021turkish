package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// kullanicidan bir c�mle ve bir harf aliniz
		// While loop kullanilarak istenen harf c�mlede kac kez kullanilmis bulunuz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir c�mle yaziniz");
		String c�mle=scan.nextLine();
		System.out.println("Saymak istediginiz istediginiz harfi giriniz");
		String harf=scan.next().substring(0, 1);
		
	    int count=0;
	    int index=0;
	    while (index<c�mle.length()) {
			
	    	if (c�mle.substring(index, index+1).equals(harf)) {
				count++;
			}
	    index++;
	    }
		
		System.out.println("C�mlede "+harf+" harfi "+count+" defa kullanilmistir.");
		
		
		scan.close();
	}

}
