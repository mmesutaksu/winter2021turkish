package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// kullanicidan degerler alarak bir int olusturun
		// önce kullanicidan girecegi sayi adedini almamiz lazim
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen girmek istediginiz sayilarin adedini yaziniz");
		int sayiAdedi=scan.nextInt();
		
		int arr[]=new int[sayiAdedi];
		
		System.out.println("Lütfen sayilari giriniz");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
