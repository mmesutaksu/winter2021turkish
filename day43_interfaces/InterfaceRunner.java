package day43_interfaces;

public class InterfaceRunner implements Interface02{

	public static void main(String[] args) {
		
		// static olarak tanimlanmis bir variable veya method
		// baska class'tan classIsmi.methodIsmi seklinde cagirilir
		
		Interface02.deneme2();
		
		// Default keyword'u olusturdugumuz method ise
		// obje �zerinden cagirilabilir
		
		InterfaceRunner obj1=new InterfaceRunner();
		obj1.deneme();
		
	}

}
