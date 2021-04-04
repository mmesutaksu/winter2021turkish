package day08_ifelsenestedif;

public class C2_NestedIf {

	public static void main(String[] args) {
		
		String cinsiyet="kadin";
		int yas=10;
		
		if (yas<0) {
			System.out.println("yas negatif olamaz");
		} else if (cinsiyet.equalsIgnoreCase("erkek") && yas>=65) {
			System.out.println("emekli olabilirsin");
		} else if (cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
			System.out.println("Emekli olamazsin");
		} else if (cinsiyet.equalsIgnoreCase("kadin") && yas>=60) {
			System.out.println("emekli olabilirsin");
		} else if (cinsiyet.equalsIgnoreCase("kadin") && yas<60){
			System.out.println("emekli olamazsin");
		} else {
			System.out.println("cinsiyet ve yas tanimsiz");
		}
		
		
		
		System.out.println("Nested if ile sonuc");
		
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			
			if (yas<0) {
				System.out.println("yas negatif olamaz");
			} else if(yas<65) {
				System.out.println("emekli olamazsin");
			} else {
				System.out.println("emekli olabilirsin");
			}
			
		} else if (cinsiyet.equalsIgnoreCase("kadin")){
			if (yas<0) {
				System.out.println("yas negatif olamaz");
			} else if (yas<60) {
				System.out.println("emekli olamazsin");
			} else {
				System.out.println("emekli olabilirsin");
			}
					
		
		} else {
			System.out.println("yazdiginiz cinsiyet emekli sistemimize kayitli degil");
		}
		
		
		
		
				
		
		

	}

}
