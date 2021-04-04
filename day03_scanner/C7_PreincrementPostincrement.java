package day03_scanner;

public class C7_PreincrementPostincrement {

	public static void main(String[] args) {
		
		int num = 20;
		
		num++;                      // num=21
		System.out.println(num);    // num=21
		
		System.out.println(num++);  // num=21 önce yazacak sonra artiracak   POST incremet(artirmak)
		
		System.out.println(num);    // num=22
		
		System.out.println(++num);  // num=23 önce artiracak sonra yazdiracak PRE increment(artirmak)
		
		System.out.println(num);    // num=23
		
		
		

	}

}
