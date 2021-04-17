package day49_maps;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class Map04_VeriTabani {

	public static void main(String[] args) {
		
		String dosyaYolu="C:\\Users\\user\\Desktop\\VeriTabani.csv";
		
		Map<String,String> map=veriTabaniAl(dosyaYolu);
		System.out.println(map);
		
	}

	public static Map<String, String> veriTabaniAl(String dosyaYolu) {
		
		Map<String,String> geciciMap=new HashMap<>();
		List<String> list=new ArrayList<>();
		
		try {
			BufferedReader br=new BufferedReader(new FileReader(dosyaYolu));
			String satir=br.readLine();
			
			while (satir != null) {
				
				String arr[]=satir.split(";");
				geciciMap.put(arr[0], arr[1]);
				
				satir=br.readLine();
			}
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();  // Detayli hata raporu verir
		}
		
		
		return geciciMap;
	}

}
