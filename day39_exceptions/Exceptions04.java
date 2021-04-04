package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions04 {
	// Eger handle edilecek Exception'lar arasinda Parent-Child iliskisi varsa
	// bu duruumda child Exception icin catch blogu yazmasakta kod calisir
	// Child exception'u silmenin
	// pozitif yönü: tek catch blogu ile tüm Exceptionlar handle edilebbilikr
	// negatif yönü: bir sorunla karsilastigimizda bunun dosya bulunamadigi icin mi
	// yoksa dosya okunamadigi icin mi oldugunu anlayamayiz
	
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\winter2021turkish\\day39_exceptions\\File");
			int k=0;
			
				while ((k=fis.read())!=-1) {
					System.out.print((char)k);
					fis.close();
				} 
			}catch (IOException e) {
			
		
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Kod bloke olmamis");
		
		
	}

}
