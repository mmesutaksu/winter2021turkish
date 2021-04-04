package day03_scanner;

public class C6_IncrementDecrement {
		
		public static void main(String[] args) {
			
			// bir variable nin degerini toplayarak artirmak icin3 yöntem var
			
			int number = 0;
			
			number = number + 5;
			number += 5;
			number++;
			
			// bu yöntemler tüm islemler icin yapilir. (number++,number-- haric)
			
			System.out.println(number);
			
			//cikarma
			number -= 6;   // number=5
			number--;      // number=4
			
			//bölme
			number /= 2;   // =2
			
			//carpma
			number *= 2;   // =4
						
			
			System.out.println(number);
			
			
			
		}
}
