package day05;

public class C3_Concatenation {
	
	public static void main(String[] args) {
		//Concatenation(birlestirme): Javada birden fazla Stringi toplama isareti ile
		//toplarsaniz, Java bu Stringleri yan yana yazar
		
		String str1="Java";
		String str2="Güzeldir";
		
		
		
		System.out.println(str1+" "+str2);   // arada bir bosluk olmasini istiyorsak cift tirnakla
											 // bosluk eklemeliyiz.
		
		int sayi1=5;
		int sayi2=4;
		//verilenleri kullanarak konsolda 9 yazdiralim
		System.out.println(sayi1+sayi2);
		
		// 9JavaGüzeldir yazdiralim
		System.out.println(sayi1+sayi2+str1+str2);
		
		// JavaGüzeldir54 yazdiralim
		System.out.println(str1+str2+sayi1+sayi2);
		
		//verilenlerle JavaGüzeldir1 yazdiriniz
		System.out.println(str1+str2+(sayi1-sayi2));
		
		//verilenlerle 9 JavaGüzeldir yazdiralim
		System.out.println(sayi1+sayi2+" "+str1+str2);

		System.out.println(sayi1+sayi2+' '+str1+str2);  //toplamaya char eklenirse ASCI degeriyle toplamaya eklenir
		
		System.out.println(sayi1+sayi2+" "+str1+' '+str2);  //Stringden sonra char karakteri sayi ifadece etmez
		
		
		System.out.println(sayi1+sayi2+sayi1*' '*sayi2); // carpma islemi önce yapilir
														 // islemin arasindaki char karakteri ASCII deki 32 sayisidir
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
