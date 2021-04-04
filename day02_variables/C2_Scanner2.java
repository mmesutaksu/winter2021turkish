package day02_variables;

import java.util.Scanner;

public class C2_Scanner2 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lütfen Alanini Bulmak Istediginiz Dairenin yari capini giriniz = ");
		
		double yaricap=scan.nextDouble();
		
		System.out.println("Dairenin Alani = "+3.14*yaricap*yaricap);
		
		
		scan.close();
		
		
		
		
	}

}
