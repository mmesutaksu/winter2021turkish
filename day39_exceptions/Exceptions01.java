package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {
	// Java'ya bir dosyayi okumasini veya dosyaya yazmasini s�yledigimizde
	// Java'ya "dosyayi bulamazsam" der ve bizden c�z�m �retmemizi bekler
	// Dosya bulma ile ilgili exception t�r�; FileNotFoundException
	// Java, kodu yazar yazmaz buradaki olasi problemi g�r�r ve CTE verir
	// Kodumuzu yazdirdigimizda ortaya cikan bu t�r exceptionlara Checked Exception denir
	
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fio=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\winter2021turkish\\day39_exceptions\\File");
		} catch (FileNotFoundException e) {
			
		//	e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Kod bloke olmamis");
	}

}
