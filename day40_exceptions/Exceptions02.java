package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException , IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\winter2021turkish\\day39_exceptions\\File");
		
		// try-catch blogu Exception ile handle etmekte kullanilir
		// throws keyword'u ise sadece declaration'dir
		// throws kullaniilan bir method'da exception olusursa KOD BLOKE OLUR
		int k=0;
		
		while ((k=fis.read())!=-1) {
			System.out.print((char)k);
		}
		
		// Eger birden fazla Exception icin throws keywor'u kullanacaksa
		// yazacagimiz Exception'larin arasindaki iliski ve siralama önemli olur
		// Eger Exceptionlar arasinda Parent-Child ilskisi varsa 
		// once Child Exception yazilmalidir, yoksa child Exception erisilemez olur
		
		
	}

}
