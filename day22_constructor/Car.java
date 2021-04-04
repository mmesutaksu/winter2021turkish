package day22_constructor;

class Car {
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	public static void main(String[] args) {
		
		Car car1=new Car();
		//           CONSTRUCTOR
		
		System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazasiVarMi);
							//null	        null		    0          false
		car1.marka="Toyota";
		car1.model="Corolla";
		car1.yil=2010;
		car1.kazasiVarMi=false;
		
		System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazasiVarMi);
		                    //Toyota	  Corolla		  2010          false
		
		
		Car car2=new Car();
		//           CONSTRUCTOR
		car2.marka="Opel";
		car2.model="Astra";
		car2.yil=2015;
		car2.kazasiVarMi=true;
		System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazasiVarMi);
							//Opel	   		Astra          2015             true
		
		car1.kazasiVarMi=true;  // car1 e ait herhangi bir özelligi degistirebiliriz
		System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazasiVarMi);

		
	}

}
