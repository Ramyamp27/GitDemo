package tutorialpoint;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapTypes {

	public static void main(String[] args) {

		Map<Integer, String> map = new ConcurrentHashMap<>();

		map.put(1, "Asia");
		map.put(27, "South Korea");
		map.put(2, "South Korea");
	//	map.put(8, null);
		//map.put(16, null);
		map.put(3, "Europe");
		map.put(2, "North America");
		map.put(5, "South America");
		map.put(36, "Australia");
		map.put(22, "Antarctica");
		System.out.println(map);

		int size = map.size();
		System.out.println(size);

		String string = map.get(36);
		System.out.println(string);

		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);

		Collection<String> values = map.values();
		System.out.println(values);

		boolean containsKey = map.containsKey(99);
		System.out.println(containsKey);

		boolean containsValue = map.containsValue("South Korea");
		System.out.println(containsValue);

		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);

	}

}
