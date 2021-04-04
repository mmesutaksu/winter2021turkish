package day41_error_garbagecollector;

public class Errors {

	public static void main(String[] args) {
		
		// System.out.println(20/0);  // RTE degil RunTimeException
		
		// String str="asd;  // CTE
		
		// Java da Error dendiginde onüne gecilemeyen, kod ile cözülemeyen
		// sistemden kaynakli hbüyük hatalar kastedilir
		
		// Error'lar unchecked'dir ve Java bunlari öngöremez
		// ancak gerceklestiginde kodun calismasi durdurulur
		
		String str="";
		
		for (int i = 0; i < 1000000; i++) {
			str+=i;
		}
		
		
		
	}

}
