package dsaPractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(123, "aditi");
		map.put(124, "sam");
		map.put(345, "tom");
		map.put(654, "pam");
		
//		System.out.println(map.get(345));
//		
//		Set<Entry<Integer,String>> entrySet=map.entrySet();
//		
//		for(Entry<Integer,String> entry: entrySet) {
//			System.out.println(entry.getKey()+" : " + entry.getValue());
//		}

		HashMap<Integer, String> map1=new HashMap<Integer,String>();
		
		map1.putAll(map);
		map1.remove(123);
		
		Set <Entry<Integer, String>> set1= map1.entrySet();
		
		for(Entry<Integer, String> entry:set1) {
			System.out.println(entry.getKey() + entry.getValue());
		}
		
		//when only want to retrieve keys
		
//		Set<Integer> keySet=map1.keySet();
//		
//		for(Integer key:keySet) {
//			System.out.println(key);
//		}
		
		map1.remove(123);
	}

}
