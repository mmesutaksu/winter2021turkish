package day34_inheritance;

public class Muhasebe extends Personel{
	
	// Muhasebe class'inin personel class'inin child class'i oldugunu
	// declare etmek icin class ismine extends keyword ile parent class'i yazariz
		
	public int saat�creti;
	public String stat�;
	public int maas;
	
	public int maasHesapla() {
		
		maas=30*8*saat�creti;
		
		return maas;
	}
}
