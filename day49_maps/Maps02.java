package day49_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		// Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz
		// Input: Hellooo       Output: H=1, e=1, l=2, o=3
		
		String input="Hellooo";
		
		Map<String,Integer> gelenMap=harfSayisiBul(input);
		
		System.out.println(gelenMap);
		
	}

	private static Map<String, Integer> harfSayisiBul(String input) {
		
		String arr[]=input.split("");
		
		Map<String,Integer> sonuc=new HashMap<>();
				
		for (String each : arr) {
			if (!sonuc.containsKey(each)) {
				sonuc.put(each, 1);
			} else {
				sonuc.put(each, sonuc.get(each)+1);
			}
		}
		return sonuc;
	}
}
