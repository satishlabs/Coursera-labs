package com.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Kaushik");
		map.put(101, "Satish");
		map.put(102, "Gopal");
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		System.out.println(map.get(101));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		System.out.println(map.remove(101));
		map.clear();
		System.out.println(map);
	}
}
