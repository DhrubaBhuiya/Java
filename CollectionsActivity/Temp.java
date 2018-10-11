package CollectionsActivity;

import java.util.Map;
import java.util.TreeMap;

public class Temp {

	public static void main(String[] args) {
		Map<Product, String> map = new TreeMap<Product, String>();
		Product p = new Product("p001", "Google Pixel 2");
		map.put(p, "Mobile");
		p = new Product("p005", "Lenovo Vibe K5");
		map.put(p, "Mobile");
		p = new Product("p209", "Dell Inspiron 3457");
		map.put(p, "Laptop");
		p = new Product("p050", "LG SmartTv");
		map.put(p, "TV");
		p = new Product("p011", "Apple Ipad");
		map.put(p, "Tablet");
		for(@SuppressWarnings("rawtypes") Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
