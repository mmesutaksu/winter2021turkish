package day21_scoop;

public class Scope6 {
	
	public int num1;      //access modifier public olunca heryerden ulasabiliriz
	String name = "Ali";  
	
	public static void main(String args){ 
		
		add();	
	// product (5);  static olmayan bir methoddur o yüzden main methoda cagirilamaz
	}
	
	public static void add(){
	
	// num1 ++;  instance variabledir ve object olusturmadan kullanilamaz
	int num2 = 6;
	char letter;
	System.out.println("Do addition ");
	}
	
	public void product(int num3){
	name = "Veli";
	
	//num2++; // üstteki methodda olusturulmus Localdir.
	
	System.out.println(num3 * num3);
	
	} }

