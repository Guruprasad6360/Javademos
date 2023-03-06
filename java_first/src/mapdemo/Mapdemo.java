package mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mapdemo {
 public static void main(String[] args) {
	Map<String, Integer> map= new LinkedHashMap<>();
	map.put("bob", 99);
	map.put("john", 90);
	map.put("preveen", 65);
	System.out.println(map);
	System.out.println(map.keySet());
	System.out.println(map.values());
	for(String key : map.keySet()) {
		System.out.println(map.get(key));
	}
	}
}
