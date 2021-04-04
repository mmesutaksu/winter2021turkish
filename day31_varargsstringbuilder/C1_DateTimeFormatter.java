package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);  // güncel tarih saat verir
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMMM/dd hh:mm");
		System.out.println(dtf.format(ldt));
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yyyy/MMM/dd");
		System.out.println(dtf2.format(ldt));
		
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("HH:mm");
		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf3.format(ldt));
		System.out.println(dtf4.format(ldt));
		
		LocalDate dogumTarihi=LocalDate.of(1994, 5, 21);
		LocalDate bugün=LocalDate.now();
		
		
		Period benimYasim=Period.between(dogumTarihi, bugün);
		System.out.println(benimYasim);
			
		int yas=Period.between(dogumTarihi, bugün).getYears();
		System.out.println(yas);
			
		
			
	}

}

