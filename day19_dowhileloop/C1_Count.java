package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// kullanicidan bir cümle ve bir harf aliniz
		// While loop kullanilarak istenen harf cümlede kac kez kullanilmis bulunuz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cümle yaziniz");
		String cümle=scan.nextLine();
		System.out.println("Saymak istediginiz istediginiz harfi giriniz");
		String harf=scan.next().substring(0, 1);
		
	    int count=0;
	    int index=0;
	    while (index<cümle.length()) {
			
	    	if (cümle.substring(index, index+1).equals(harf)) {
				count++;
			}
	    index++;
	    }
		
		System.out.println("Cümlede "+harf+" harfi "+count+" defa kullanilmistir.");
		
		
		scan.close();
	}

}
