package day36_inheritance;

public class UstaBasi extends Isci {
	
	public String bolum="Takimhane";
	public int sorOldIsciSay=20;
	
	public static void main(String[] args) {
		
		UstaBasi ub1=new UstaBasi();
		// Objeyi torun classinda olusturunca 3 class'a da ulasabiliyoruz
		
		System.out.println(ub1.bolum);  // Takimhane
		System.out.println(ub1.sorOldIsciSay);  // 20
		System.out.println(ub1.saat‹creti);   //10
		System.out.println(ub1.isim);  // Mehmet
		
		Isci ub2=new UstaBasi();
		System.out.println(ub2.departman);  // Isci den aldik
		System.out.println(ub2.izindeMi);   // Personel den aldik
		
		Personel ub3=new UstaBasi();
		System.out.println(ub3.id);  // Personel den alir
	}

}
