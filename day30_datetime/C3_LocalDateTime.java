package day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {


		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.toString());
		
		String time=ldt.toString();
		
		System.out.println(time.startsWith("2021"));  // 2021 ile mi basliyor? true/false
		
		
		
		
	}

}
