package day35_inheritance;

public class Memur extends Personel {
	
	public int maas;
		
	public Memur() {
		super();     // yerine baska bir keyword yazmadigimiz sürece calisir.
		System.out.println("Child class parametresiz constructor calisti");
	}
	
	public Memur(int maas) {
		super("Seher",6000);
		System.out.println("Child class parametreli constructor calisti");
	}

	public static void main(String[] args) {
		
		Memur obj1=new Memur(2400);
		
	}

}
