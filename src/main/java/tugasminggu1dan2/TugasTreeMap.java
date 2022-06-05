package tugasminggu1dan2;

import java.util.Map;
import java.util.TreeMap;

public class TugasTreeMap {
	
	public static void main (String [] args) {

		TreeMap <Integer, String> data = new TreeMap<> ();
		
		data.put(1, "mbak Khusna");
		data.put(7, "Om Amri");
		data.put(2, "mbak Isna");
		data.put(3, "mbak Mira");
		data.put(6, "Bu Limah");
		data.put(5, "Umi Nurhaida");
		data.put(4, "mas Arifin");
		data.put(3, "Azila");
		
		for (Map.Entry nama: data.entrySet()) {
			System.out.println("Nama Panggilan anak ke: " + nama.getKey() + " adalah " + nama.getValue());
		}	
	}
}

