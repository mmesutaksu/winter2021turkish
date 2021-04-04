package day30_datetime;

import java.time.LocalDate;

public class C1_LocalDate01 {

	public static void main(String[] args) {
		// Java da sadece tarih kullanmak istiyorsa
		// LocalDate Class indan obje üretiriz
		
		LocalDate tarih=LocalDate.now();
		System.out.println(tarih); 
		
		System.out.println(tarih.plusWeeks(20));
		System.out.println(tarih.plusDays(500));
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12));
		
		System.out.println(tarih.minusMonths(15));
		System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10));
		
		System.out.println(tarih.getDayOfYear());  // bugün yilin kacinci günü
		System.out.println(tarih.getDayOfMonth()); // kacinci ay
		System.out.println(tarih.getDayOfWeek());  // hangi gün
		
		LocalDate dogumGünü=LocalDate.of(1994, 5, 21);
		System.out.println(dogumGünü.getDayOfWeek());
		
		System.out.println(tarih.getMonth()); // bu ayin adini yazar
		
		System.out.println(tarih.isLeapYear()); // false
				
		LocalDate tarih1=LocalDate.of(1995, 12, 15);
		LocalDate tarih2=LocalDate.of(1995, 12, 10);
		
		System.out.println(tarih1.isAfter(tarih2));   // true
		System.out.println(tarih1.isBefore(tarih2));  // false
		
		
		
	}

}

