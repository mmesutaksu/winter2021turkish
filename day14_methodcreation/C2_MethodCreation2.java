package day14_methodcreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		
	//bir methodu calistirmak icin main methodun icinden cagirmamiz gerekir
	// bir methodu cagirmak icin ise method adini ve parametrelere uygun argumentleri yazmaliyiz
		
		ortalama(85.2,90.3); // method call 
		
	
	
	} // main method sonu
	
	// bir method olusturacaksak class in icinde 
	//ama main methodun disinda bir alanda olusturmaliyiz
	// genel kullanim methodlar main method dan sonra olur
	
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("Girdiginiz iki sayinin ortalamasi: "+(sayi1+sayi2)/2);
		// bir methodu olusturmak o methodu calistirmak icin yeterli degildir
		// olusturulan method, main method icinden cagirilinca calisir.
	}
	
} //Class sonu
